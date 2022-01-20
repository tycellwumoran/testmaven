package com.example.wmrmaven;

import com.example.wmrmaven.testmysql.biz.ITestMybatisService;
import com.example.wmrmaven.testmysql.entity.TestMybatis;
import com.example.wmrmaven.testmysql.service.TestServiceClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author wumoran
 * @version 1.0
 * @description ceshi
 * @date 2021/11/22 15:24
 */
@SpringBootTest
public class TestMybatisClass {

    @Resource
    private ITestMybatisService testMybatisService;



    @Resource
    private TestServiceClass testServiceClass;


    @Test
    public void  testStr() throws Exception {
        //testServiceClass.testData();  synchronized
        testServiceClass.testStr();
    }

    @Test
    public void  testDs() throws Exception {
        //testServiceClass.testData();
        testServiceClass.testData();
    }

    @Test
    public void selectOne(){
        //testMybatisService.selectOne();

        Calendar today = Calendar.getInstance();
        today.set(Calendar.DAY_OF_YEAR, today.get(Calendar.DAY_OF_YEAR) - 6);
        System.out.println(today.getTimeZone());
        System.out.println(today.getTime());
    }


    @Test
    public void test(){

        int num = 2002;
        List<TestMybatis> testBatchInserts = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            TestMybatis testMybatisClass = new TestMybatis();
            testMybatisClass.settAge(i+1);
            testMybatisClass.settChild(0);;
            testMybatisClass.settName("wu"+i);
            testBatchInserts.add(testMybatisClass);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        testMybatisService.saveBatch(testBatchInserts);
        stopWatch.stop();
        System.out.println("使用mp 批量插入方法耗时:"+stopWatch.getTotalTimeSeconds()+"s");
    }


    @Test
    public void oneTest() throws Exception {
        //testServiceClass.oneTest();
        long t1= 1638862401859L;
        long t2 = 1638862349660L;

        long temp = 1L;
        System.out.println((t1-t2)/temp);
    }




}