package com.example.wmrmaven.threadCalss;

import com.example.wmrmaven.objecttemp.PageUtil;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/**
 * @author wumoran
 * @version 1.0
 * @description 创建线程
 * @date 2021/11/27 20:09
 */
public class CreateThreadClass {
    public static final int MAX_TURN = 5;
    public static String getCurThreadName(){
        System.out.println("main ==="+Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
    static int threadNo = 1;

    static class DemoThread extends Thread{
        public DemoThread(){
            super("DemoThread-" +threadNo++);
        }
        @Override
        public  void run(){
            for (int i = 0; i < MAX_TURN; i++) {
                System.out.println(getName()+",轮次："+i);
            }
            System.out.println(getName()+"运行结束。");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 12000; i++) {
            Thread thread = new DemoThread();
            thread.start();
        }
        System.out.println(getCurThreadName()+"运行结束");
    }
}