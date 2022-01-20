package com.example.wmrmaven.abstractClasses;

/**
 * @author wumoran
 * @version 1.0
 * @description 子类  继承抽象类  可以不是抽象类（因为实现了父类的抽象方法）,也可以不实现抽象方法,但是类必须是抽象类
 * @date 2021/12/27 14:16
 */
public  class CarStudent extends Person {

    @Override
    protected String getDescription() {
        return null;
    }

    public CarStudent(String name) {
        super(name);
    }
}