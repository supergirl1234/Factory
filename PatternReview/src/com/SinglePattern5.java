package com;

public class SinglePattern5 {

    private static  SinglePattern5 object;

    private SinglePattern5() {
    }

    private   static SinglePattern5 getObject(){


        /*双重检测*/
        if(object==null){
            synchronized (SinglePattern5.class){ /*可以在多线程下使用，更安全*/

                if(object==null){
                    object=new SinglePattern5();

                }
            }

        }
        return  object;
    }

    private void print(){
        System.out.println("双重检测");
    }
    public static void main(String[] args) {
        SinglePattern5 object=SinglePattern5.getObject();
        object.print();
        SinglePattern5 object1=SinglePattern5.getObject();
        object1.print();

    }
}
