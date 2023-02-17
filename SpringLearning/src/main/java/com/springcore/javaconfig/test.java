package com.springcore.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
    public static void main(String[] args) {
       // ApplicationContext context= new ClassPathXmlApplicationContext("javaconfig.xml");
//        Student student1=(Student)context.getBean("student");
//        System.out.println(student1);
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student=context.getBean("student",Student.class);
        Student student2=context.getBean("temp",Student.class);
        student.study();
        student2.study();
    }
}
