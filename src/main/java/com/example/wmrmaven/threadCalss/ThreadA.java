package com.example.wmrmaven.threadCalss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author wumoran
 * @version 1.0
 * @description 线程a
 * @date 2021/11/27 14:56
 */
public class ThreadA {

    /**
     * 1、CountDownLatch 线程计数器
     *  2、每次执行一个线程减一
     *  3、主线程调用await 被阻塞 ,直到 计数器为0
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        List<Integer> tempD = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (tempD){
                        tempD.add(1);
                    }
                    System.out.println(Thread.currentThread().getName());
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println(tempD.size());
    }

}