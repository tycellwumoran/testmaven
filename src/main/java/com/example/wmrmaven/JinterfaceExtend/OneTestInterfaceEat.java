package com.example.wmrmaven.JinterfaceExtend;

/**
 * @author wumoran
 * @version 1.0
 * @description 接口
 * @date 2021/11/10 11:12
 */
public interface OneTestInterfaceEat {

    default void eat() {
        System.out.println("12121");
    }
}