package com.aop.Impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;

@Order(1)
@Aspect
@Component
public class ValidAspect {

    //@Before("execution(* com.aop.Impl.*.*(..))")
    @Before("LogginAspect.declareJoinPoitExpress()")
    public void beforeValid(JoinPoint joinPoint){

        System.out.println("beforeValid>>>");
    }
}
