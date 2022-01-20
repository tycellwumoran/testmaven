package com.example.wmrmaven.concurrence;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wumoran
 * @version 1.0
 * @description cas
 * @date 2022/1/13 21:59
 */
public class CasClass {
    /**
     *
     */
    private synchronized void test(){
        System.out.println("121212");
    }


    public static void main(String[] args) {
        AtomicInteger atmotiInteget = new AtomicInteger();
        atmotiInteget.addAndGet(10000);

        System.out.println(atmotiInteget.get());
        for (int i = 0; i < 10000; i++) {
            atmotiInteget.decrementAndGet();
        }
        System.out.println(atmotiInteget.get());
    }
}