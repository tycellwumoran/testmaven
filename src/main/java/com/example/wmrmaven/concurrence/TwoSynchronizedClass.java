package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description TwoSynchronizedClass
 * @date 2022/1/7 20:20
 */
public class TwoSynchronizedClass {


    public synchronized  void test(){
//        synchronized(this){
//            System.out.println("12121");
//        }
        System.out.println(1212);
    }

    public static void main(String[] args) {

    }
}