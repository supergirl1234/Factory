package comm;

/*简单工厂模式*/

interface  country{
    void go();
}

class HeNanCountry implements  country{


    @Override
    public void go() {
        System.out.println("河南");
    }
}
class ShanXiCountry implements country{


    @Override
    public void go() {
        System.out.println("陕西");
    }
}


//一个工厂，在这个工厂里创建对象
class  Factory{

    public static country getCountry(String type){
        country country=null;
        if(type.equals("河南")){
            country=new HeNanCountry();

        }
        if(type.equals("陕西")){

            country=new ShanXiCountry();
        }
        return country;

    }
}
public class SimpleFactory {

    public static void main(String[] args) {

        country country=Factory.getCountry("陕西");
        country.go();

    }
}
