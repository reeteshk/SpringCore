package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        ApplicationContext context= new ClassPathXmlApplicationContext("Stereoconfig.xml");
        Student student=(Student) context.getBean("ob");
        Student student2=(Student) context.getBean("ob");
//        student.setCity("Robertsganj");
//        student.setStudentName("Amarthyapatel");
        System.out.println(student);
//        System.out.println(student.hashCode());
//        System.out.println(student2.hashCode());
//
//        Teacher teacher=(Teacher) context.getBean("teacher");
//        Teacher teacher2=(Teacher) context.getBean("teacher");
//        System.out.println(teacher.hashCode());
//        System.out.println(teacher2.hashCode());


    }
}
