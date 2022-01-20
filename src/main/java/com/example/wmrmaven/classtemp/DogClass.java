package com.example.wmrmaven.classtemp;

import java.util.List;

/**
 * @author wumoran
 * @version 1.0
 * @description 字面常量
 * @date 2021/11/7 17:55
 */
public class DogClass {

    private int i;
    private int j;

    DogClass(){
        System.out.println(1212121);
    }

    DogClass(int i,int j){
        this.i = i;
        this.j = j;

    }
    static final String s1 = "Dog_s1";
    static  String s2 = "Dog_s2";
    static {
        System.out.println("Loading Dog");
    }

    public void setNameI(int vale){
        this.i = vale;
    }
    public int getNameI(){
        return this.i;
    }
    @Override
    public String toString() {
        return "DogClass{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

}