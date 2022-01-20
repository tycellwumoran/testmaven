package com.example.wmrmaven.concurrence;

import lombok.SneakyThrows;
import org.junit.Test;

import static java.lang.Thread.sleep;

/**
 * @author wumoran
 * @version 1.0
 * @description synchronized
 * @date 2022/1/7 19:17
 */
public class SynchronizedClass implements Runnable {


    private int i ;

    SynchronizedClass(int i){
        this.i = i;
    }
    //开启2万个线程
    public static void main(String[] args) throws InterruptedException {
        SynchronizedClass commonSource = new SynchronizedClass(1);
        for (int i = 0; i < 10; i++) {
            new Thread(commonSource).start();
        }
        Thread.sleep(1000);
        System.out.println("i==="+commonSource.i);
    }
    @SneakyThrows
    @Override
    public  void run() {
        synchronized (this){
            i++;
        }
        System.out.println("name = "+Thread.currentThread().getName()+"=="+i);
    }
}