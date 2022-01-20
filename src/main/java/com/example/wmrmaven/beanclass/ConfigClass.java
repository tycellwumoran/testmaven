package com.example.wmrmaven.beanclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wumoran
 * @version 1.0
 * @description bean配置类
 * @date 2021/11/17 15:34
 */
@Configuration
public class ConfigClass {


    /**
     *   @Bean的方法的返回值识别为Spring Bean，并注册到容器中，归入IoC容器管理
     * @return
     */
    @Bean("testNewIn")
    public TestClassBean testClassBean1(){
        return  new TestClassBean();
    }





}