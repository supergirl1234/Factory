package com;


/*多例可以采用枚举的方式实现*/

enum  Animal{

    Cat("猫"),
    Dog("狗"),
    Bird("鸟");


    private String title;

    Animal(String title) {
        this.title = title;
    }


    public void say(){//是public，否则对象访问不到

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  this.title;
    }

    public static  Animal getObject(String name){
        switch (name){

            case "猫":
                 return  Cat;

            case "狗":
                return  Dog;

            case "鸟":
                return  Bird;

            default:
                    return null;
        }

    }

}
public class ProtoPattern2 {

    public static void main(String[] args) {
        Animal animal=Animal.getObject("猫");
        animal.say();

        Animal animal1=Animal.getObject("猫");
        animal1.say();

        Animal animal2=Animal.getObject("狗");
        animal2.say();

        Animal animal3=Animal.getObject("鸟");
        animal3.say();

    }
}
