package com.example.wmrmaven.es;

/**
 * @author wumoran
 * @version 1.0
 * @description bean
 * @date 2021/10/15 15:40
 */
public class TestBean {
    private String username;
    private String url;
    private String password;

    public void TestBean() {
        System.out.println("TestBean sayHello...");
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
}