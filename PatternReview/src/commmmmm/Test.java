package commmmmm;

class Person {
    public void print() {
        System.out.println("[PRINT]方法：" + this);//this代表当前对象
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("main方法：" + p1);
        p1.print();
        System.out.println("++++++++++++++++++==");
        Person p2 = new Person();
        System.out.println("main方法：" + p2);
        p2.print();
    }
}