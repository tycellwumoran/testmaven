package com.example.wmrmaven.testfinal;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/6 16:27
 */
public class TestClass {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();



        //System.out.println(myClass1.i);
        //final 针对同一个对象而说，一个对象内 不能再次复制了
        //static 是对所有的实例共享
        System.out.println(MyClass.j);
        //System.out.println(myClass2.i);
        System.out.println(MyClass.j);
        MyClass.j =1212;
        System.out.println(MyClass.j);



    }
}
