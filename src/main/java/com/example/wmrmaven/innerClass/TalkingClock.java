package com.example.wmrmaven.innerClass;

/**
 * @author wumoran
 * @version 1.0
 * @description 内部类例子
 * @date 2021/12/30 10:31
 */
public class TalkingClock {

    private int interval;
    private boolean beep;

     TalkingClock(int interval,boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    public void start(){
        System.out.println("start=====");
    }

}