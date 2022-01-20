package com.example.wmrmaven.lambda;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.function.Consumer;

import com.google.common.collect.Lists;

/**
 * @author wumoran
 * @version 1.0
 * @description 测试 BeanUtils.copyProperties()
 * @date 2021/11/23 9:55
 */
public class TestlambdaClass {

    public static void main(String[] args) {

//        List<ParamOne> paramOneList = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            ParamOne paramOne = new ParamOne();
//            paramOne.setOneInter(i);
//            paramOne.setOneString("param"+i);
//            paramOneList.add(paramOne);
//        }
//        System.out.println(paramOneList.toString());
//        List<ParamTwo>  paramTwoList = new ArrayList<>();
//        for (ParamOne paramOne : paramOneList) {
//            ParamTwo paramTwo = new ParamTwo();
//            BeanUtils.copyProperties(paramOne,paramTwo);
//            paramTwoList.add(paramTwo);
//        }
//        System.out.println(paramTwoList.toString());

//        String  str = "RT"+123456;
//        System.out.println(str);
//        String[]  re = str.split("RT");
//        for (String s : re) {
//            if(!s.isEmpty()){
//                System.out.println(Long.valueOf(s));
//            }
//        }
    }
    List<Integer> intes = Arrays.asList(12,34,56);

    List<ParamOne> paramOnes = Arrays.asList(
            new ParamOne(12,"aa"),
            new ParamOne(34,"bb"),
            new ParamOne(56,"cc")
    );
    @Test
    public void test1() {
        Integer re = getIntegerV(12, t -> t*2);
        System.out.println(re);
    }
    @Test
    public void test2(){
        Collections.sort(paramOnes, new Comparator<ParamOne>() {
            //这个不负责排序 只是比较器  ,如何排序是由排序器
            @Override
            public int compare(ParamOne o1, ParamOne o2) {
                return o1.getOneInter() - o2.getOneInter();
            }
        });
        for (ParamOne paramOne : paramOnes) {
            System.out.println(paramOne);
        }
    }
    /**
     * 这里 为什么 第一行不行呢，第二行可以呢  因为包装类 实现了 comparable
     */
    @Test
    public void test3(){
      //  Collections.sort(paramOnes);
        Collections.sort(intes);
    }
    public Integer getIntegerV(Integer x, MyFuncTest myFuncTest) {
        return myFuncTest.getValue(x);
    }
    @Test
    public void comparable(){
        Comparator<Integer> com = (x,y)->{

            return Integer.compare(x,y);
        };
        int re = com.compare(3,4);
        System.out.println(re);

        Collections.sort(paramOnes,(x,y)->{
            return x.getOneInter() - y.getOneInter();
        });
    }

    @Test
    public void staticCom(){
        Collections.sort(paramOnes,Comparator.comparing(ParamOne::getOneInter));
        for (ParamOne paramOne : paramOnes) {
            System.out.println(paramOne);
        }
        long needThreads = 5/3;
        System.out.println(needThreads);
    }


}