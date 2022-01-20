package com.example.wmrmaven.testmysql.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wmrmaven.testmysql.entity.TestMybatis;
import com.example.wmrmaven.testmysql.mapper.TestMybatisMapper;
import com.example.wmrmaven.testmysql.biz.ITestMybatisService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.reactive.TransactionSynchronization;
import org.springframework.transaction.reactive.TransactionSynchronizationManager;

import javax.annotation.Resource;

/**
 * <p>
 * test 服务实现类
 * </p>
 *
 * @author wumoran
 * @since 2021-11-22
 */
@DS("master")
@Service
public class TestMybatisServiceImpl extends ServiceImpl<TestMybatisMapper, TestMybatis> implements ITestMybatisService {


    @Resource
    public TestMybatisMapper  testMybatisMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertTest() throws Exception {

        TestMybatis testMybatis = new TestMybatis();
        testMybatis.settAge(12);
        testMybatis.settName("wumoran");
        testMybatisMapper.insert(testMybatis);


    }



    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertThree() throws  Exception{

 //       int re = 1/0;

        insertPrivote();
    }

    private void insertPrivote(){
        TestMybatis testMybatis = new TestMybatis();
        testMybatis.settAge(12);
        testMybatis.settName("wumoran");
        testMybatisMapper.insert(testMybatis);
    }

    @Transactional(rollbackFor = Exception.class)
    public Boolean insertTestThree() {
        TestMybatis testMybatis = new TestMybatis();
        testMybatis.settAge(56);
        testMybatis.settName("moranmoran");
        testMybatisMapper.insert(testMybatis);
        return Boolean.TRUE;
    }



    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertTestTwo() {
        TestMybatis testMybatis = new TestMybatis();
        testMybatis.settAge(56);
        testMybatis.settName("tuzhiwu");
        testMybatisMapper.insert(testMybatis);
    }

    @Override
    public void selectOne() {

        QueryWrapper<TestMybatis>  queryWrapper = new QueryWrapper<>();



        LambdaQueryWrapper<TestMybatis> testMybatisLambdaQueryWrapper = queryWrapper.lambda();
        testMybatisLambdaQueryWrapper.eq(TestMybatis::gettName,"tuzhiwu");
        testMybatisLambdaQueryWrapper.orderByDesc(TestMybatis::gettId);



        System.out.println(testMybatisMapper.selectList(queryWrapper));
    }


}
