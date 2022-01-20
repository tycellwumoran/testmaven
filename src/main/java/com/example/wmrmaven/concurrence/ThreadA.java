package com.example.wmrmaven.concurrence;

import lombok.Synchronized;

/**
 * @author
 * @version 1.0
 * @description
 * @date 2022/1/11 17:31
 */
public class ThreadA {

    public synchronized void test(){
        synchronized(this){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ThreadA threadOne = new ThreadA();
        threadOne.test();
    }
}
