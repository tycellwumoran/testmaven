package com.example.wmrmaven.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author wumoran
 * @version 1.0
 * @description ceshi
 * @date 2021/11/22 14:14
 */
public class TestConsume {


    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(100,"三个人");
        map.put(110,"四个人");
        map.put(115,"五个人");
        map.put(120,"一群人");
        // 这个consumer 可以理解为一个函数，函数内容就是后面的lambda 表达式
        Consumer<Map> consumer = x -> {
            x.forEach((k, v) -> System.out.println("key:" + k + "value:" + v));
        };
       consumer.accept(map);

//        BiConsumer<Map,Consumer> biConsumer = (map1, consumer1) ->
//        {
//            consumer1.accept(map1);
//        };
//        biConsumer.accept(map,consumer);

    }



}