package comm;


/*抽象工厂模式*/
/*多个业务，一个工厂也要实现这几个多个业务*/

import com.sun.xml.internal.ws.api.Component;

import java.util.concurrent.ThreadPoolExecutor;

interface  Computer{

    void buyComputer();
}
class DELLComputer implements Computer{


    @Override
    public void buyComputer() {
        System.out.println("戴尔笔记本");
    }
}

class LevonComputer implements Computer{


    @Override
    public void buyComputer() {
        System.out.println("联想笔记本");
    }
}

interface Color{

    void print();
}

class YellowColor implements Color{


    @Override
    public void print() {
        System.out.println("黄色");
    }
}

class RedColor implements Color{


    @Override
    public void print() {
        System.out.println("红色");
    }
}

interface ComputerFactory{

    Computer buy();
    Color produce();
}

class DellFactory implements  ComputerFactory{


    @Override
    public Computer buy() {
        return new DELLComputer();
    }

    @Override
    public Color produce() {
        return new YellowColor();
    }
}

class LevonFactory implements  ComputerFactory{


    @Override
    public Computer buy() {
        return new LevonComputer();
    }

    @Override
    public Color produce() {
        return new RedColor();
    }
}
public class AbstractFatoryPattern {

    /*业务：买电脑和生产颜色*/
    public void buyComputer(Computer computer){

        computer.buyComputer();

    }
    public void selectColor(Color color){
        color.print();

    }

    public static void main(String[] args) {

        AbstractFatoryPattern client=new AbstractFatoryPattern();
        ComputerFactory factory=new DellFactory();
        Computer computer=factory.buy();
        Color color=factory.produce();
        client.buyComputer(computer);
        client.selectColor(color);
    }
}
