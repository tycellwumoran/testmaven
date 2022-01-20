package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description 可重入锁
 * @date 2022/1/18 22:03
 */
public class SynchDoubleClass {

    public synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + "test2:" + i);
        }
        test3();
    }
    public synchronized void test1() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + "test1:" + i);
        }
        test2();
    }
    public synchronized void test3() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + "test3:" + i);
        }
    }
    public static void main(String[] args) {
        new Thread(()->{
            SynchDoubleClass synchDoubleClass = new SynchDoubleClass();
            synchDoubleClass.test1();
        }).start();

    }
}