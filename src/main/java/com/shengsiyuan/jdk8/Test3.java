package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

//        TheInterface i1 = () -> {};
//        System.out.println(i1.getClass().getInterfaces()[0]);
//
//        TheInterface2 i2 = () -> {};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> {
//            System.out.println("hello world");
//        }).start();


        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> System.out.println(item.toUpperCase()));

        List<String> list2 = new ArrayList<>();
        list.forEach(item -> list2.add(item.toUpperCase()));
        list2.forEach(System.out::println);
    }
}

@FunctionalInterface
interface TheInterface {
    void myMethod();
}

interface TheInterface2 {
    void myMethod();
}
