package com.springcore.ci;

import com.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context= new ClassPathXmlApplicationContext("constructor.xml");
        Person person=(Person) context.getBean("Person");
        Addition addition=(Addition)context.getBean("add");
        addition.dosum();
        System.out.println(person);
    }
}
