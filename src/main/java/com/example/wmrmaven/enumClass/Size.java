package com.example.wmrmaven.enumClass;

/**
 * @author wumoran
 * @version 1.0
 * @description 枚举类
 * @date 2021/12/27 15:24
 */
public enum Size {

    SMALL("S"),
    MEDIUM("M"),
    ;
    private String s;
    Size(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
