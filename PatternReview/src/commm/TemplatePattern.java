package commm;


/*模板设计模式*/
/*开闭原则(OCP): 一个软件实体如类、模块和函数应该对扩展开放、对修改关闭。*/

/*在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中*/

abstract class Active {

    final void all() {//这个是整个一个流程

        play();
        eat();
        wash();
        sleep();

    }

    /*这两个方法是，对象不同，执行的内容也不一样*/
    abstract  void play();
    abstract  void eat();

    /*这两个方法是不管对象是谁，执行的内容都一样*/
    void wash() {
        System.out.println("洗漱");
    }

    void sleep() {
        System.out.println("睡觉");
    }
}

class Stu extends  Active{


    @Override
    void play() {
        System.out.println("跳皮筋");
    }

    @Override
    void eat() {

        System.out.println("吃饭堂的饭");
    }
}

class Adult extends  Active{


    @Override
    void play() {
        System.out.println("工作");
    }

    @Override
    void eat() {

        System.out.println("自己做饭吃");
    }
}

public class TemplatePattern {

    public static void main(String[] args) {
        Stu stu=new Stu();
        stu.all();

        System.out.println("+++++++++++++++++++++");
        Adult adult=new Adult();
        adult.all();
    }


}
