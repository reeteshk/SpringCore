package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo=(Demo) context.getBean("demo");
        System.out.println(demo);
        SpelExpressionParser temp=new SpelExpressionParser();
        Expression expression=temp.parseExpression("44+90");
        System.out.println(expression.getValue());
    }
}
