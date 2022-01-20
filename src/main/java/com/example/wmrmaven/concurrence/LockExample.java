package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description 可重复锁
 * @date 2022/1/17 19:31
 */
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    // 创建锁对象
    private static final ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        // 定义线程任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // 加锁
                lock.lock();
                try {
                    // 打印执行线程的名字
                    System.out.println("线程:" + Thread.currentThread().getName());
                } finally {
                    // 释放锁
                    lock.unlock();
                }
            }
        };
        // 创建多个线程
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
