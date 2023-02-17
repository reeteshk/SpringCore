package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context= new ClassPathXmlApplicationContext("standaloneCollectionconfig.xml");
        Person person=(Person)context.getBean("person1");
        System.out.println(person);
    }
}
