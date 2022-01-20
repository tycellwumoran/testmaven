package com.example.wmrmaven.comparatorandcomparable;

import com.example.wmrmaven.lambda.ParamOne;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wumoran
 * @version 1.0
 * @description 排序接口和比较器
 * @date 2021/12/29 19:39
 */
public class ComparatorBle {



    List<ParamOne> paramOnes = Arrays.asList(
            new ParamOne(102,"aa"),
            new ParamOne(34,"bb"),
            new ParamOne(56,"cc")
    );



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
    @Test
    public void test3(){
        paramOnes.sort(Comparator.comparing(ParamOne::getOneInter));
        for (ParamOne paramOne : paramOnes) {
            System.out.println(paramOne.getOneInter());
        }
    }
    @Test
    public void test4(){
        List<Integer> ids = Lists.newArrayList(120,34,565);
        Collections.sort(ids);
        System.out.println(ids.get(0));
    }
}