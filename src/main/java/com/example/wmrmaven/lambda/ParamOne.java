package com.example.wmrmaven.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wumoran
 * @version 1.0
 * @description paramOne
 * @date 2021/11/24 13:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamOne {


    private Integer oneInter;
    private String oneString;

    public ParamOne(int oneInter, String i) {
        this.oneInter = oneInter;
        this.oneString = i;
    }
}