package com;

/*饿汉式*/
public class SinglePattern3 {

    /*因为只希望产生一个对象，所以在前面加上final比较好*/

    private final static SinglePattern3 singlePattern3=new SinglePattern3();

    private SinglePattern3() {

    }

    private static SinglePattern3 getInstance(){

        return  singlePattern3;
    }

    private   void say(){

        System.out.println("hello");
    }



    public static void main(String[] args) {

        SinglePattern3 object=SinglePattern3.getInstance();
        object.say();
    }
}
