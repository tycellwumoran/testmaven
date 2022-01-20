package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description synchronized 锁在非静态方法的应用
 * @date 2022/1/9 22:58
 */
public class SynchNoStaticClass {
    public synchronized void test2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
    public static void main(String[] args) {
        SynchNoStaticClass synchNoStaticClass = new SynchNoStaticClass();
//        new Thread(()->{
//            synchNoStaticClass.test2();
//        },"thread--1").start();
//        new Thread(()->{
//            synchNoStaticClass.test2();
//        },"thread--2").start();

        new Thread(() -> {
            synchNoStaticClass.test3();
        }, "test3").start();

        new Thread(() -> {
            synchNoStaticClass.test3();
        }, "test4").start();
    }

    //同一个对象里面 不同的方法 加了同一把锁 ,虽然线程不同 但是也要有顺序执行
    // 当锁定静态代码块时候 同一把锁
//锁类 那么对类实例化出来的对象 都会有方法限制
    public void test1() {
        synchronized (this) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }

    public void test3() {
        synchronized (SynchNoStaticClass.class) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }
}