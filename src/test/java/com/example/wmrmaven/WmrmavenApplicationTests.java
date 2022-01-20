package com.example.wmrmaven;

import com.alibaba.fastjson.JSONObject;
import com.example.wmrmaven.beanclass.TestClassBean;
import com.example.wmrmaven.es.EsConfig;
import com.example.wmrmaven.es.TestBean;
import com.example.wmrmaven.jinterface.TestInterfaceWalk;
import com.example.wmrmaven.jinterface.TestMainClass;
import com.example.wmrmaven.request.TestRequest;
import com.example.wmrmaven.request.TestRequestTwo;
import org.apache.http.HttpHost;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class WmrmavenApplicationTests {


    @Autowired
    private TestClassBean testClassBean;




    @Resource
    TestMainClass testMainClass;

    @Resource
    TestInterfaceWalk testInterfaceWalk;



    @Test
    void setTestClassBean(){

        testClassBean.TestClassBean();
    }






    @Test
    void testOneTest(){
        //testMainClass.testOne();
        testInterfaceWalk.walk();
    }


    @Test
    void contextLoads() {
    }


    @Test
    void test(){
        System.out.println(1212);
    }

    @Test
    void testOne(){

        TestRequest testRequest = new TestRequest();
        testRequest.setTargetParamOne(1);
        testRequest.setTargetParamTwo(2);
        testRequest.setTargetParamThree(3);
        testRequest.setStr("woaini");
        TestRequestTwo testRequestTwo = new TestRequestTwo();
        BeanUtils.copyProperties(testRequest,testRequestTwo);
        System.out.println(testRequestTwo);

        System.out.println(testRequest);
    }

    @Test
    void testEs(){

        RestClientBuilder restClient = RestClient.builder(
                new HttpHost("localhost", 9200, "http"));
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(restClient);

        System.out.println(restHighLevelClient.indices());

    }

    @Test
    void testBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(EsConfig.class);
        TestBean tb = (TestBean) context.getBean(TestBean.class);
        tb.start();

        RestHighLevelClient restHighLevelClient1 = context.getBean(RestHighLevelClient.class);
        System.out.println(restHighLevelClient1);

        RestHighLevelClient restHighLevelClient2 = context.getBean(RestHighLevelClient.class);
        System.out.println(restHighLevelClient2);

    }
    @Test
    void parseJson(){

        String strOne = "[1041059,1212,1212]";
        List<Long> skuList = new ArrayList<>();
        skuList = JSONObject.parseArray(strOne, Long.class);
        System.out.println(skuList);
        System.out.println(JSONObject.toJSON(skuList));

    }
    @Test
    void testList(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        for (Integer id : ids){
            id = 5;
        }
        System.out.println(ids);
    }





}
