package com.beans.annotation;

import com.beans.annotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

        TestObject to = (TestObject)ctx.getBean("testObject");
        System.out.println(to);

        UserController uc = (UserController)ctx.getBean("userController");
        System.out.println(uc);
    }
}
