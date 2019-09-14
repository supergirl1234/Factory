package com;

/*单例模式的构造方法是私有的*/

/*饿汉式：在类加载的时候就创建了对象*/
public class SinglePattern1 {

    private static SinglePattern1 object=new SinglePattern1();

    private SinglePattern1() {//构造方法一定要是私有的
    }

    private static SinglePattern1 getInstance(){

        return  object;
    }

    private   void say(){

        System.out.println("hello");
    }

    public static void main(String[] args) {
        SinglePattern1 object=SinglePattern1.getInstance();
        object.say();
    }

}
