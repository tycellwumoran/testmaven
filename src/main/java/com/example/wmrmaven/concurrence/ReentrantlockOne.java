package com.example.wmrmaven.concurrence;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wumoran
 * @version 1.0
 * @description 显示锁
 * @date 2022/1/17 19:22
 */
public class ReentrantlockOne {


    // 创建锁对象 true 表示公平锁
    private static final ReentrantLock lock = new ReentrantLock(true);

    public static void methodA() {
        // 加锁操作
        lock.lock();
        try {
            System.out.println("this thread name is "+Thread.currentThread().getName());
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                ReentrantlockOne.methodA();
            },"thread name is" +i).start();
        }

    }

}