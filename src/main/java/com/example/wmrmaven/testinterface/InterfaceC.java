package com.example.wmrmaven.testinterface;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/10 11:42
 */
public interface InterfaceC  extends InterfaceB,InterfaceA{


    @Override
    default void say(String name) {

    }
}