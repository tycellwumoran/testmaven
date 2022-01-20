package com.example.wmrmaven.StringBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wumoran
 * @version 1.0
 * @description STRING
 * @date 2021/11/29 10:27
 */
public class StringBufferClass {


    public static void main(String[] args) {

        try {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOne = simpleDateFormat.parse("2021-11-28 00:00:00");

            Date dateTwo = simpleDateFormat.parse("2021-11-30 00:00:00");


            Long before = dateOne.getTime();
            Long after = dateTwo.getTime();
            int re = (int) ((after - before) / (1000*3600*24));
            System.out.println(re);
            System.out.println("==========s============");

            System.out.println(simpleDateFormat.format(new Date()));

            Date temp =  new Date();
            System.out.println(temp.getTime());

        }catch (Exception e){
            System.out.println(e);
        }


    }
}