package comm;


/*工厂模式*/
interface Flower{

    void printName();

}

class SunFlower implements Flower{

    @Override
    public void printName() {
        System.out.println("我是太阳花");
    }
}
class RoseFlower implements Flower{

    @Override
    public void printName() {
        System.out.println("我是玫瑰花");
    }
}

interface  FlowerFactory{

    Flower select();

}

class SunFlowerFactory implements  FlowerFactory{


    @Override
    public Flower select() {
        return new SunFlower();
    }
}
class RoseFlowerFactory implements  FlowerFactory{


    @Override
    public Flower select() {
        return new RoseFlower();
    }
}


public class FactoryPattern {

    /*业务是买花*/
    public void buyFlower(Flower flower){

        flower.printName();
    }
    public static void main(String[] args) {

        FactoryPattern client=new FactoryPattern();
        FlowerFactory factory=new SunFlowerFactory();
        client.buyFlower(factory.select());


    }
}
