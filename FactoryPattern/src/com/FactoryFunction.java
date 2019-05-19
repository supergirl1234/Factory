package com;

/**
 * Author:Fanleilei
 * Created:2019/5/19 0019
 */

//工厂方法模式是针对每个产品提供一个工厂类，在客户端中判断使用哪个工厂类去创建对象。

//一个抽象产品类，多个产品类；一个抽象工厂类，多个工厂类；
// 在每个工厂类中生产产品；再在客户端中判断使用哪个工厂类；

//抽象产品类
interface Fruit{
        void print();
}

//多个产品类
class Strawberry implements Fruit{


    @Override
    public void print() {
        System.out.println("我是草莓");
    }
}

class Apple implements Fruit{


    @Override
    public void print() {
        System.out.println("我是苹果");
    }
}
class Banner implements Fruit{


    @Override
    public void print() {
        System.out.println("我是香蕉");
    }
}

//抽象工厂类
interface FruitFactory{

    Fruit produce();
}

//多个工厂类
class  StrawberryFacory implements FruitFactory{


    @Override
    public Fruit produce() {
        return new Strawberry();
    }
}
 class AppleFactory implements FruitFactory{


     @Override
     public Fruit produce() {
         return new Apple();
     }
 }
 class BannarFactory implements FruitFactory{


     @Override
     public Fruit produce() {
         return new Banner();
     }
 }


public class FactoryFunction {

    //在客户端中判断使用哪个工厂类
    public static void main(String[] args) {

        FruitFactory client=new StrawberryFacory();//确定使用哪个工厂
        Fruit fruit=client.produce();//在工厂中生产产品
        fruit.print();



    }
}
