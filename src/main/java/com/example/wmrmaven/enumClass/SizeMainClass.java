package com.example.wmrmaven.enumClass;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wumoran
 * @version 1.0
 * @description 主main
 * @date 2021/12/27 15:27
 */
public class SizeMainClass {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("SMALL,MEDIUM");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println(size.getS());

        System.out.println(size.toString());

    }




}