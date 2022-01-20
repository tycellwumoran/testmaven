package com.example.wmrmaven.beanclass;

import javax.annotation.PostConstruct;

/**
 * @author wumoran
 * @version 1.0
 * @description 假设第三方包
 * @date 2021/11/17 16:05
 */
public class TestClassBean {



    private String username;
    private String url;
    private String password;

    public void TestClassBean() {
        System.out.println("TestClassBean sayHello...");
    }

    @Override
    public String toString() {
        return "username:" + this.username + ",url:" + this.url + ",password:" + this.password;
    }

    public void start() {
        System.out.println("TestBean 初始化。。。");
    }

    public void cleanUp() {
        System.out.println("TestBean 销毁。。。");
    }

    @PostConstruct
    public void initBefore(){
        System.out.println("加载的时候 在init之前");
    }
    public void init(){
        System.out.println("======================init===========================");
    }
}