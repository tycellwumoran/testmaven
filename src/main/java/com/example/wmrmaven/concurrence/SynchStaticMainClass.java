package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2022/1/9 22:38
 */
public class SynchStaticMainClass {

    public static void main(String[] args) {
        SynchStaticClass synchStaticClass = new SynchStaticClass();

        new Thread(()->{
            SynchStaticClass.printA();
        }).start();

        new Thread(()->{
            synchStaticClass.printC();
        }).start();


        new Thread(()->{
            SynchStaticClass.printB();
        }).start();
    }
}