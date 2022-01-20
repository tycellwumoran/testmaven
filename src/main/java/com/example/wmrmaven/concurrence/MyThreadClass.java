package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2022/1/7 20:33
 */
public class MyThreadClass extends Thread{

    private int count =5;
    @Override
    public  void run(){
        count --;
        System.out.println(currentThread().getName() +"count =" +count);
    }

    public static void main(String[] args) {
        MyThreadClass myThreadClass = new MyThreadClass();
        Thread t1 =   new Thread(myThreadClass,"t1");
        Thread t2 =   new Thread(myThreadClass,"t2");
        Thread t3 =   new Thread(myThreadClass,"t3");
        Thread t4 =   new Thread(myThreadClass,"t4");
        Thread t5 =   new Thread(myThreadClass,"t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}