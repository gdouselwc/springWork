package com.aop.Impl;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalcutorImp implements ArithmeticCalculator{

    public int add(int i, int j) {
        return i + j;
    }

    public int div(int i,int j){
        return i / j;
    }
}
