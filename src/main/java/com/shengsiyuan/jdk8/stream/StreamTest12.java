package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        List list = list1.stream().flatMap(item -> list2.stream().map(value -> item + " " + value))
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);
    }
}
