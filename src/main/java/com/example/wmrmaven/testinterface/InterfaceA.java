package com.example.wmrmaven.testinterface;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/10 11:41
 */
public interface InterfaceA {


    default void say(String name) {
        System.out.println( "hello " + name);
    }

    void eait();
}