package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {

    public static void main(String[] args) {
//        IntStream.of(new int[] {5, 6, 7}).forEach(System.out::println);
//        System.out.println("------------");
//        IntStream.range(3, 8).forEach(System.out::println);
//        System.out.println("-----------");
//        IntStream.rangeClosed(3, 8).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));
    }
}
