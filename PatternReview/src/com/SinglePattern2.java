package com;



/*饿汉式*/
public class SinglePattern2 {

    private  static  SinglePattern2 object=null;

    /*静态块，类一加载，就会被执行*/
   static{
        object=new SinglePattern2();
   }

    private SinglePattern2() {
    }

    public   static SinglePattern2 getInstance(){
       return   object;
    }
    private   void say(){

        System.out.println("hello");
    }


    public static void main(String[] args) {

       SinglePattern2 object=SinglePattern2.getInstance();
       object.say();

    }
}
