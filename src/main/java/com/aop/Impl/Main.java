package com.aop.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArithmeticCalculator calc = ctx.getBean(ArithmeticCalculator.class);

        //System.out.println(calc.add(3,1));
        System.out.println(calc.div(3,1));
    }
}
