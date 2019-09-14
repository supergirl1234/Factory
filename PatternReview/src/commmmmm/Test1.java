package commmmmm;

/*优先级：静态代码块>构造块>构造方法  静态代码块只执行一次，每创建一个对象就调用一次构造块和构造方法*/
class Stu {
    {  //定义在类中，不加任何修饰符，构造块
        System.out.println("1.我是构造块");
    }//该大括号{}必须有，不能去掉哦

    /*构造方法*/
    public Stu() {
        System.out.println("2.我是构造方法");
    }

    static { //定义在类中的静态块
        System.out.println("3.我是静态块");
    }
}


public class Test1 {
    public static void main(String[] args) {
        System.out.println("--start--");
        new Stu();
        new Stu();
        System.out.println("--end--");
    }

}