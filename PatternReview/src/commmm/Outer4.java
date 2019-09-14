package commmm;


interface Enterprise {

    void name();
}

/*匿名内部类*/
public class Outer4 {

    private int num;
    private static int count = 20;

    public Outer4(int num) {
        this.num = num;
    }

    public void print() {

        System.out.println("hellp");
    }

    public static void say() {

        System.out.println("hrl");
    }

    public void test1() {

        new Enterprise() {/*匿名内部类，可以访问外部类的属性和方法，是能访问外部类的static属性和方法，还是非static的属性和方法，要看创建匿名内部类的的方法是static的还是非static的*/

            @Override
            public void name() {

                num++;
                System.out.println(num);
                System.out.println(count);
                print();
                say();
            }
        }.name();
    }
    public static void test2() {

        new Enterprise() {

            @Override
            public void name() {
                System.out.println(count);
                say();
            }
        }.name();
    }

    public static void main(String[] args) {


        Outer4 outer4=new Outer4(13);
        outer4.test1();
        System.out.println("++++++++++++++++");
        Outer4.test2();
    }
}
