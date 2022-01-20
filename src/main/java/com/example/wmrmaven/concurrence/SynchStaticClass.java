package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description synchronized 加锁在静态方法的应用
 * @date 2022/1/9 22:35
 */
public  class SynchStaticClass {

    public synchronized static  void  printA(){
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "进入printA()方法");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    "在" + System.currentTimeMillis() + "离开printA()方法");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public synchronized static void printB()
    {
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "进入printB()方法");
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "离开printB()方法");

    }
    public synchronized void printC()
    {
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "进入printC()方法");
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                "在" + System.currentTimeMillis() + "离开printC()方法");
    }
}