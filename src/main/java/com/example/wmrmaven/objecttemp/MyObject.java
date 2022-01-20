package com.example.wmrmaven.objecttemp;

import lombok.Data;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2021/11/8 9:36
 */
@Data
public class MyObject {

    private int i;

    MyObject(){

    }
    MyObject(int i){
        this.i = i;
    }
}