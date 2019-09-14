package commmm;


/*方法内部类*/
public class Outer3 {

    private int num;
    private static  int count=20;



    public Outer3(int num) {
        this.num = num;
    }
    public void print(){

        System.out.println("hellp");
    }
    public static void listen(){

        System.out.println("listen");
    }

    public  void say(){

        /**/
       class inner3{//方法内部类可以访问外部类的属性和方法；如果该方法是非static的，则该方法内部类可以访问外部类的属性和方法（static和非static的）

           public void hello(){

               System.out.println(num++);
               System.out.println(count++);
               print();
               listen();
           }
       }

       /*在方法内创建该方法内部类对象，并调用该方法内部类的方法*/
       inner3 inner3=new inner3();
       inner3.hello();
    }
    public  static void tell(){

        class inner3{//如果该方法是static的，则该方法内部类只能访问外部类的static属性和方法

            public void hello(){


                System.out.println(count++);

                listen();
            }
        }

        inner3 inner3=new inner3();
        inner3.hello();
    }

    public static void main(String[] args) {


        Outer3 outer3=new Outer3(12);
        outer3.say();

        System.out.println("+++++++++++++++++++++");
        Outer3.tell();
    }

}
