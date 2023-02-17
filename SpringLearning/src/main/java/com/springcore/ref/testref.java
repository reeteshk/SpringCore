package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testref {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context= new ClassPathXmlApplicationContext("refconfig.xml");
        A a=(A) context.getBean("A");
        B b=(B) context.getBean("B");
        System.out.println(a);
        System.out.println(b);
    }
}
