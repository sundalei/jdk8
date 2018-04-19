package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().forEach(System.out::println);
    }
}
