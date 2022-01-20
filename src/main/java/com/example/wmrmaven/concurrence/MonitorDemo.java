package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description 监视器 happens-before
 * @date 2022/1/13 10:26
 */
public class MonitorDemo {

    private int a = 0;

    public synchronized void write(){
        a++;
    }
    public synchronized void reader(){
        int i = a;
        System.out.println(i);
    }

    public static void main(String[] args) {
        MonitorDemo monitorDemo = new MonitorDemo();
        new Thread(()->{
            System.out.println("demo1----start");
            monitorDemo.write();

            System.out.println("demo1 ---- end ");
        },"demo1").start();
        new Thread(()->{
            System.out.println("demo2 ----start");
            monitorDemo.reader();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("demo2 ----end ");
        },"demo2").start();
        MonitorDemo monitorDemo1 = new MonitorDemo();
        new Thread(()->{
            System.out.println("demo3 ----start");
            monitorDemo1.reader();
            System.out.println("demo3 ----end ");
        },"demo3").start();

    }
}