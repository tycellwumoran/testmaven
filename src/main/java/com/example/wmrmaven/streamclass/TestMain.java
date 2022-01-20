package com.example.wmrmaven.streamclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author wumoran
 * @version 1.0
 * @description 启动类
 * @date 2021/11/10 17:06
 */
public class TestMain {



    public static void main(String[] args)  {

        List<StreamTest> streamTests = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            StreamTest streamTest = new StreamTest();
            streamTest.setAge(1);
            streamTests.add(streamTest);
            System.out.println(streamTest);
        }
        //.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(streamTests.stream().mapToInt(StreamTest::getAge).sum());
        System.out.println(streamTests.stream().map(StreamTest::getAge).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));


    }
}