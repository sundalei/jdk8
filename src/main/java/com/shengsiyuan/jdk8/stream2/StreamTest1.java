package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class StreamTest1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        List<Student> students1 = students.stream().collect(toList());
        students1.forEach(System.out::println);

        System.out.println("------------");

        System.out.println("count: " + students.stream().collect(counting()));
        System.out.println("count: " + students.stream().count());
    }
}
