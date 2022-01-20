package com.example.wmrmaven.concurrence;

import java.util.Calendar;

/**
 * @author wumoran
 * @version 1.0
 * @description 内存可见性和指令重排
 * @date 2022/1/12 21:45
 */
public class VolatileClass {

    private static volatile boolean tag = true;

    public static void main(String[] args) throws InterruptedException {

        Calendar today = Calendar.getInstance();
        today.set(Calendar.DAY_OF_YEAR, today.get(Calendar.DAY_OF_YEAR) - 1);
        System.out.println(today.getTime());


        new Thread(()->{
            while (tag){

            }
            System.out.println("end");
        }).start();
        Thread.sleep(1000);
        tag = false;
    }
}