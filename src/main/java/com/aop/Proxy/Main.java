package com.aop.Proxy;

public class Main {

    public static void main(String[]args){

        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        ArithmeticCalculator proxy =  new CalcProxy(target).GetProxy();

        System.out.println(proxy.add(1,2));
    }
}
