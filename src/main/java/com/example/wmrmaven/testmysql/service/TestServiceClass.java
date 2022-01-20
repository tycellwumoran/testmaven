package com.example.wmrmaven.testmysql.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.wmrmaven.testmysql.biz.ITestMybatisService;
import com.example.wmrmaven.testmysql.entity.TestMybatis;
import com.example.wmrmaven.testmysql.mapper.TestMybatisMapper;
import lombok.SneakyThrows;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

/**
 * @author wumoran
 * @version 1.0
 * @description test事务
 * @date 2021/11/30 17:47
 */
@Component
public class TestServiceClass {


    @Resource
    private TestMybatisMapper testMybatisMapper;


    @Resource
    private ITestMybatisService iTestMybatisService;

    private final   String stringJoinerT = ",";

    private final StringJoiner stringJoiner = new StringJoiner(",");


    public void testStr(){

        for (int i = 0; i < 3; i++) {
            System.out.println(analysisServices("wumoran"));
        }

    }


    private String analysisServices(String commodityServices) {
        if (StringUtils.isNotEmpty(commodityServices)) {
            for (int i = 0; i < 5; i++) {
                stringJoiner.add((i + 1) + "." + i);
            }
            return stringJoiner.toString();
        }
        return "";
    }


   @Transactional(rollbackFor = Exception.class)
    public void oneTest() throws Exception {

        try {
          //  iTestMybatisService.insertTest();
            oneTwo();
            //这个时候  onetwo 有没有事务呢
        }catch (Exception e){
           // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
           e.printStackTrace();
       }
       //iTestMybatisService.insertTestTwo();
         insertTestTwo();
    }
    @Transactional(rollbackFor = Exception.class)
    public void oneTwo ()throws Exception{
        TestMybatis testMybatis = new TestMybatis();
        testMybatis.settAge(12);
        testMybatis.settName("wumoran");
        testMybatisMapper.insert(testMybatis);
         int i = 1/0;
    }
    @Transactional(rollbackFor = Exception.class)
    public void insertTestTwo ()throws Exception{

        iTestMybatisService.insertTest();

//        TestMybatis testMybatis = new TestMybatis();  org.springframework.transaction.interceptor.TransactionAspectSupport
//        testMybatis.settAge(34);
//        testMybatis.settName("wuguoqing");
//        testMybatisMapper.insert(testMybatis);
    }

   @Transactional(rollbackFor = Exception.class)
    public void testData(){
        iTestMybatisService.insertTestTwo();
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
            @SneakyThrows
            @Override
            public void afterCompletion(int status ) {
                if(TransactionSynchronization.STATUS_COMMITTED == status){
                    System.out.println("suc");
                    iTestMybatisService.insertThree();
                }else if(TransactionSynchronization.STATUS_ROLLED_BACK == status){
                    System.out.println("fail");
                }
            }

            @Override
            public void afterCommit() {

            }
        });
        System.out.println("===========67788888===============");
    }
    @Transactional(rollbackFor = Exception.class)
    public void testTwoData() throws Exception {
       iTestMybatisService.insertThree();
    }


}