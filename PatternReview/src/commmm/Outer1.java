package commmm;


/*成员内部类*/
public class Outer1 {

    private int num;
    private static  int count=20;



    public Outer1(int num) {
        this.num = num;
    }
    public void print(){

        System.out.println("hellp");
    }

    public static  void say(){

        System.out.println("hrl");
    }

    class inner1{//成员内部类可以访问外部类的属性和方法（static和非static都可以）
        /*成员内部类中不能创建static的变量和方法*/

       public  void test(){
           num++;
           System.out.println(num);
           count++;
           System.out.println(count);

           print();
           say();
       }
    }

    public static void main(String[] args) {
        Outer1.inner1 inner=new Outer1(12).new inner1();//成员内部类的创建依赖于外部类
        inner.test();
    }


}
