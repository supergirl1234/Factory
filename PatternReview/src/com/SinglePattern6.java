package com;

/*饿汉式*/
public class SinglePattern6 {

    private SinglePattern6() {
    }


    /*内部静态类*/
    private  static  class Single{
        private  static SinglePattern6 object=new SinglePattern6();
    }

    private static SinglePattern6 getInstance(){

        return  Single.object;
    }

    private   void say(){

        System.out.println("hello");
    }


    public static void main(String[] args) {

        SinglePattern6 object=SinglePattern6.getInstance();
        object.say();
        SinglePattern6 object1=SinglePattern6.getInstance();
        object1.say();
    }
}
