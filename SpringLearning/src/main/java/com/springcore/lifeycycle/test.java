package com.springcore.lifeycycle;

import com.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.spec.ECField;
import java.security.spec.PKCS8EncodedKeySpec;

public class test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycleconfig.xml");
      //Samosa s1=(Samosa) context.getBean("s1");
      //  Pepsi p1=(Pepsi) context.getBean("p1");
        Example example=(Example) context.getBean("example");
        System.out.println(example);
       //System.out.println(s1);
        context.registerShutdownHook();
    }
}
