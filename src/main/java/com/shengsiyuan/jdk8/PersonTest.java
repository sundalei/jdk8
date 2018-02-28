package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> personList = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();

//        List<Person> personResult = test.getPersonListByUsername("zhangsan", personList);
//        personResult.forEach(person -> System.out.println(person.getUsername()));
//        personResult = test.getPersonListByAge(25, personList);
//        personResult.forEach(person -> System.out.println(person.getUsername()));

        List<Person> personResult = test.getPersonListByAge2(20, personList, (age, people) -> {
            return people.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personResult.forEach(person -> System.out.println(person.getUsername()));
        List<Person> personResult2 = test.getPersonListByAge2(20, personList, (age, people) -> {
            return people.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList());
        });
        System.out.println("-----------------------------------------");
        personResult2.forEach(person -> System.out.println(person.getUsername()));
    }

    public List<Person> getPersonListByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonListByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, people) -> {
            return people.stream().filter(person -> person.getAge() >= ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }

    public List<Person> getPersonListByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, personList);
    }
}
