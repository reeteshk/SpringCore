package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context= new ClassPathXmlApplicationContext("cconfig.xml");
        Emp emp1=(Emp) context.getBean("Emp");
        System.out.println(emp1);

    }
}
