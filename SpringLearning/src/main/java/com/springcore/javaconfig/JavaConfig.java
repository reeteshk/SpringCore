package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig  {

    @Bean(name = {"student","temp","con"})
    public Student getStudent(){

        //creation a new student object
        Student student=new Student(getSamosa() );
        return student;
    }

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }

}
