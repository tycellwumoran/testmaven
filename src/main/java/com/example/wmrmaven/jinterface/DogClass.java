package com.example.wmrmaven.jinterface;

import org.springframework.stereotype.Component;

/**
 * @author wumoran
 * @version 1.0
 * @description 实现类
 * @date 2021/11/10 11:14
 */
@Component
public class DogClass implements  TestInterfaceWalk{


    @Override
    public void walk() {
        System.out.println("DogClass walk");
    }




}