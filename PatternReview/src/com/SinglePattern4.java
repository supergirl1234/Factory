package com;


/*懒汉式：什么时候用什么时候创建对象*/
public class SinglePattern4 {


    private static SinglePattern4 object=null;

    private SinglePattern4() {

    }


    private static  SinglePattern4 getObject(){/*这个只能在单线程下使用*/

        if(object==null){

            object=new SinglePattern4();
        }

        return  object;
    }

    private  void print(){

        System.out.println("hihi");
    }
    public static void main(String[] args) {
        SinglePattern4 object=SinglePattern4.getObject();
        object.print();
    }
}
