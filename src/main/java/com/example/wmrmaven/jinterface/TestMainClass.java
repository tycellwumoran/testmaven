package com.example.wmrmaven.jinterface;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/10 11:15
 */
@Component
public class TestMainClass {


    @Resource
    private TestInterfaceWalk testInterfaceWalk;


    public void testOne(){
        testInterfaceWalk.walk();
    }

//    public static void main(){
//
//    }



}