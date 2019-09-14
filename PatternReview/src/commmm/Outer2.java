package commmm;

public class Outer2 {

    public int num;
    public static  int count=20;



    public Outer2(int num) {
        this.num = num;
    }
    public void print(){

        System.out.println("hellp");
    }

    public static  void say(){

        System.out.println("hrl");
    }
    /*静态内部类*/
    static class inner2{
        /*静态内部类不能访问外部类的非static属性和方法*/


        public void produce(){
            System.out.println(count);
            say();
            System.out.println("静态内部类");
        }

    }
    public  void test(){
        inner2 inner2=new inner2();
        inner2.produce();

    }

    public static void main(String[] args) {

        Outer2.inner2 inner2=new Outer2.inner2();//静态内部类的创建不需要依赖外部类
        inner2.produce();

        Outer2 outer2=new Outer2(12);
        outer2.test();


    }
}
