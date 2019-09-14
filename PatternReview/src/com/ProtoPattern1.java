package com;

/*多例模式*/



class Stu{

    private Stu() {
    }

    private static  Stu MaleStu=new Stu();
    private static  Stu FemaleStu=new Stu();

    public static Stu getStu(String str){
        if(str.equals("男")){

            return MaleStu;
        }
        if(str.equals("女")){

            return FemaleStu;
        }

        return null;
    }
    public  void say(){

        System.out.println("hello，我是"+this.toString());
    }
}
public class ProtoPattern1 {

    public static void main(String[] args) {

        Stu stu=Stu.getStu("男");
        stu.say();
        Stu stu1=Stu.getStu("男");
        stu1.say();
        Stu stu2=Stu.getStu("女");
        stu2.say();
    }
}
