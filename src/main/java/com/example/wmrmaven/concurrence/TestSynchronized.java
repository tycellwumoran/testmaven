package com.example.wmrmaven.concurrence;

import static sun.misc.PostVMInitHook.run;

/**
 * @author wumoran
 * @version 1.0
 * @description 类锁区别
 * @date 2022/1/13 9:43
 */
public class TestSynchronized {
    public static  synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
    public void test1(){
        test2();
    }
    public static void main(String[] args) {

        new Thread(()-> {
            TestSynchronized testSynchronizedOne = new TestSynchronized();
            testSynchronizedOne.test1();
            }, "thread--1").start();

        new Thread(()->{
            TestSynchronized testSynchronizedTwo = new TestSynchronized();
            testSynchronizedTwo.test1();
            },"thread--2").start();
    }
}