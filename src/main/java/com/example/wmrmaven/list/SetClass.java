package com.example.wmrmaven.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wumoran
 * @version 1.0
 * @description set 集合
 * @date 2022/1/18 13:54
 */
public class SetClass {

    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        ids.add(1);
        for (Integer id : ids) {
            System.out.println(id);
        }

    }
}