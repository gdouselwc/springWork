package com.aop.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class CalcProxy {
    //要代理的对象
    private ArithmeticCalculator target;

    public CalcProxy(ArithmeticCalculator target){
        this.target = target;
    }

    public ArithmeticCalculator GetProxy(){
        ArithmeticCalculator proxy = null;
        //代理对象由哪个类加载器负责
        ClassLoader loader = target.getClass().getClassLoader();

        //代理对象类型，即其中有哪些方法
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};

        //调用代理对象其中的方法时，该执行的代码
        InvocationHandler h = new InvocationHandler() {
            /*
            *  proxy:正在返回的代理对象，一般不使用
            *  method:正在被调用的方法
            *  args:调用方法是，传入的参数
            */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke...");

                Object result = method.invoke(target,args);

                return result;
            }
        };
        proxy = (ArithmeticCalculator)Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }
}

