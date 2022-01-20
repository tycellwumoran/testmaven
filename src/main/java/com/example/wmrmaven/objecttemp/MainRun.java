package com.example.wmrmaven.objecttemp;

import com.sun.jna.IntegerType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/8 9:37
 */
public class MainRun {

    public static void main(String[] args) {





        List<Integer>  ids = new ArrayList<>();
        ids.add(2);
        ids.add(1);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        ids.sort(Integer::compareTo);

        //第0页 每页 3条
        System.out.println("====================ssss======================");
        List<Integer> reOne =  PageUtil.getPageList(1,5,ids);
        System.out.println(reOne);
        List<Integer> reTwo =  PageUtil.getPageList(2,5,ids);
        System.out.println(reTwo);

        System.out.println("====================eeeee======================");



        MyObject myObject = new MyObject(12);

        System.out.println(myObject.getI());
        test(myObject);
        System.out.println(myObject.getI());
        Object temp =new Date();
        Date tp =(Date)temp;
        System.out.println(tp.toLocaleString());
        System.out.println(Integer.TYPE);


        System.out.println(System.getProperty("user.dir"));
//        MyObject myObject = new MyObject();
//        MyObject myObject1 = new MyObject();
//        System.out.println(myObject);
//        System.out.println(myObject1);
//        int i = 0;
//        MyObject myObject2;
//        myObject2 = new MyObject();
//        System.out.println(myObject2);
    }
    public static void test(MyObject myObject){
        myObject.setI(520);
    }
}