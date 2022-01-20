package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2022/1/8 19:00
 */
public class Singleton {
    static  volatile  Singleton instance;
    public  Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}