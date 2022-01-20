package com.example.wmrmaven.JinterfaceExtend;

import com.example.wmrmaven.jinterface.TestInterfaceEat;
import com.example.wmrmaven.jinterface.TestInterfaceWalk;

/**
 * @author wumoran
 * @version 1.0
 * @description 实现类
 * @date 2021/11/10 11:14
 */
public class DogClass extends  AnimalClass implements OneTestInterfaceEat, OneTestInterfaceWalk {


    @Override
    public void eat() {
        System.out.println("dog eat!");

    }




}