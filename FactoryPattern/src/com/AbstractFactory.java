package com;

/**
 * Author:Fanleilei
 * Created:2019/5/19 0019
 */

//抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
//工厂方法模式和抽象工厂模式基本类似，可以这么理解：当工厂只生产一个产品的时候，即为工厂方法模式，而工
//厂如果生产两个或以上的商品即变为抽象工厂模式

 //多个抽象产品类，多个产品类，一个抽象工厂类（多个生产方法），多个工厂类（）；
//抽象产品类
interface Flower{
    void print();
}

//多个产品类
class StrawberryFlower implements Flower{


    @Override
    public void print() {
        System.out.println("我是草莓花");
    }
}

class AppleFlower implements Flower{


    @Override
    public void print() {
        System.out.println("我是苹果花");
    }
}
class BannerFlower implements Flower{


    @Override
     public void print() {
        System.out.println("我是香蕉花");
        }
}
//又一个抽象产品类
interface Tree{
    void plant();
}

//多个产品类
class StrawberryTree implements Tree{


    @Override
    public void plant() {
        System.out.println("我是草莓树");
    }
}

class AppleTree implements Tree{


    @Override
    public void plant() {
        System.out.println("我是苹果树");
    }
}
class BannerTree implements Tree{


    @Override
    public void plant() {
        System.out.println("我是香蕉树");
    }
}

//抽象工厂类（含有多个方法）
interface Factory{

    Flower produce();
    Tree   create();
}

//多个工厂类
class  StrawberryProduce implements Factory{


    @Override
    public Flower produce() {
        return new StrawberryFlower();
    }

    @Override
    public Tree create() {
        return new StrawberryTree();
    }
}
class AppleProduce implements Factory{


    @Override
    public Flower produce() {
        return new AppleFlower();
    }

    @Override
    public Tree create() {
        return new AppleTree();
    }
}
class BannerProduce implements Factory{


    @Override
    public Flower produce() {
        return new BannerFlower();
    }

    @Override
    public Tree create() {
        return new BannerTree();
    }
}

public class AbstractFactory {

    public static void main(String[] args) {

        //确定使用哪个工厂
        Factory factory=new AppleProduce();
        //确定使用工厂的哪个方法生产产品
        Tree  tree=factory.create();
        tree.plant();

        Flower flower=factory.produce();
        flower.print();

    }
}
