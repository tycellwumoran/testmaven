package com.example.wmrmaven.jinterface;

/**
 * @author wumoran
 * @version 1.0
 * @description 接口
 * @date 2021/11/10 11:12
 */
public interface TestInterfaceEat{

    default void eat() {
        System.out.println("12121");
    }
}