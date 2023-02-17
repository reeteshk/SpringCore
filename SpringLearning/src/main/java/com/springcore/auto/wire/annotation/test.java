package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Autoconfig2.xml");
        Emp emp=(Emp) context.getBean("emp");
        System.out.println(emp);

    }
}
