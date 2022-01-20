package com.example.wmrmaven.classtemp;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/7 17:57
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//     //   try{
//        //    Class<DogClass> dogClass = DogClass.class;
//
//            DogClass a = (DogClass)Class.forName("com.example.wmrmaven.classtemp.DogClass").newInstance();
//
//
//            System.out.println("---1---");
//            System.out.println(DogClass.s1);
//            System.out.println("---2---");
//            System.out.println(DogClass.s2);
//            DogClass dogClass1 = new DogClass(12,34);
//            System.out.println(dogClass1);
////        }catch (Exception e){
////            System.out.println(e);
////        }
//        StaticClass staticClass = new StaticClass();
//        StaticClass staticClassT = new StaticClass();
        Manager boss = new Manager("wumoran",3.20,2021,12,27);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        boss.setBonus(2.5);
        System.out.println(boss.getSalary());
        System.out.println("==========================================");
        String[] strings = {"transactionId","transactionType"};
        for (String string : strings) {
            System.out.println(string);
        }


    }
}