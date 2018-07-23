package com.aop.Impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/*
*   @Order指定切面优先级，值越小，优先级越高
* */
@Order(2)
@Aspect
@Component
public class LogginAspect {

    //声明切入点表达式
    @Pointcut("execution(* com.aop.Impl.*.*(..))")
    public void declareJoinPoitExpress(){}

    //声明该方法为前置通知
    //@Before("execution(* com.aop.Impl.*.*(..))")
    @Before("declareJoinPoitExpress()")
    public void beforeMethod(JoinPoint joinPoint){

        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before:" + args);
    }

    //后置通知
    //@After("execution(* com.aop.Impl.*.*(..))")
    @After("declareJoinPoitExpress()")
    public void afterMethod(JoinPoint joinPoint){

        System.out.println("After...");
    }

    //异常通知
//    @AfterThrowing(value = "execution(* com.aop.Impl.*.*(..))",
//    throwing = "ex")
    @AfterThrowing(value = "declareJoinPoitExpress()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){

        System.out.println("afterThrowing..." + ex);
    }
}
