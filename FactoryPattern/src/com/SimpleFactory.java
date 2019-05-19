package com;

/**
 * Author:Fanleilei
 * Created:2019/5/19 0019
 */
//简单工厂模式
//一个抽象类，多个具体产品继承抽象类，一个工厂类，

//抽象产品类
interface Computer{

    void print();
}
//多个具体产品类
class MacComputer implements Computer{


    @Override
    public void print() {
        System.out.println("我是一台MacComputer");
    }
}

class DellComputer implements Computer{


    @Override
    public void print() {
        System.out.println("我是一台DellComputer");
    }
}
//一个工厂类，用来生产产品
public class SimpleFactory {


    public static Computer Produce(String type){
        Computer computer=null;
       /* if(type.equals("Mac")){
            computer=new com.MacComputer();


        }else if(type.equals("Dell")){

             computer=new com.DellComputer();
        }else{

            computer=null;
        }*/
       switch(type){
           case "Mac":
               computer=new MacComputer();
               break;
           case "Dell":
               computer=new DellComputer();
               break;
           default:
               System.out.println("没有这种型号的电脑");

       }

        return computer;
    }

    public static void main(String[] args) {

        //com.Computer computer=com.SimpleFactory.Produce("Mac");
        Computer computer=SimpleFactory.Produce("df");
        computer.print();


    }
}
