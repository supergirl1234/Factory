package com;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface coreThing2{

    void sleep();
}
class  Person2 implements  coreThing2{


    @Override
    public void sleep() {
        System.out.println("我睡觉啦");
    }
}
/*动态代理，要实现一个特定的类*/
public class dynamicProxy implements InvocationHandler {

    /*可以动态实现任何对象，所以用object*/
    public  Object target;//真正的对象

    public dynamicProxy(Object target) {
        this.target = target;
    }

    /*帮助实现一个代理对象*/
    public  Object getProxyInstance(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /*代理新添的一个业务*/
    public void eat(){

        System.out.println("我要吃饭啦");
    }


    /*该函数是自动调用的*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        eat();
        Object object=method.invoke(target,args);
        return object;
    }

    public static void main(String[] args) {

        dynamicProxy proxy=new dynamicProxy(new Person2());
        coreThing2  object= (coreThing2) proxy.getProxyInstance();
        object.sleep();
    }
}
