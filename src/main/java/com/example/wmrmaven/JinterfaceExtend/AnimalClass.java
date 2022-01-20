package com.example.wmrmaven.JinterfaceExtend;

import com.example.wmrmaven.jinterface.TestInterfaceEat;
import com.example.wmrmaven.jinterface.TestInterfaceWalk;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/10 11:21
 */
public class AnimalClass implements OneTestInterfaceEat, OneTestInterfaceWalk {


    @Override
    public void walk() {
        System.out.println("Animal walk!");
    }

    @Override
    public void eat(){
        System.out.println("Animal eat!");
    }

}