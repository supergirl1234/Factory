package commm;

interface Fruit{

    void print();
}

class APPLE implements Fruit{


    @Override
    public void print() {
        System.out.println("苹果");
    }
}
class BANANER implements Fruit{


    @Override
    public void print() {
        System.out.println("香蕉");
    }
}

class FruitFactory {

    public static Fruit getInstance(String type){
        Fruit  fruit=null;
        try {

            Class<Fruit> cls= (Class<Fruit>) Class.forName(type);

             fruit =  cls.newInstance();


        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return fruit;
    }

}
public class FactoryByReflect {

    public static void main(String[] args) {

        Fruit fruit=FruitFactory.getInstance("commm.APPLE");//要加上包名，否则会找不到该类
        if(fruit!=null) {
            fruit.print();
        }else{

            System.out.println("不想买水果");
        }
    }
}




