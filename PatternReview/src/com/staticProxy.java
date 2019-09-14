package com;



interface  coreThing{//真正的核心业务


    void sleep();
}
class Person implements coreThing{//真正实现业务的类

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void sleep() {
        System.out.println("我要睡觉了");
    }
}
public class staticProxy implements  coreThing{//代理类

    public Person person;//真正的业务实现者

    public staticProxy(Person person) {
        this.person = person;
    }

    /*代理额外添加的业务*/
    public void eat(){
        System.out.println("我要吃饭了");
    }
    @Override
    public void sleep() {

        eat();//实现了代理对象额外添加的业务
         person.sleep();//实现了真正对象的业务

    }//代理

    public static void main(String[] args) {
        staticProxy proxy=new staticProxy(new Person());
        proxy.sleep();
    }


}
