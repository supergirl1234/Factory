package com;

/**
 * Author:Fanleilei
 * Created:2019/5/19 0019
 */

//接口定义工作能力
interface Usb{
    void setup();
    void work();

}

class computer{

    //按照接口去使用设备
    public void plugin(Usb usb){
        usb.setup();
        usb.work();

    }
}


class UDisk implements Usb{

    public void setup(){
            System.out.println("安装U盘的驱动程序");
     }

    public void work(){
            System.out.println("通过U盘与计算机之间进行数据传输");
    }
}

class KeyBoard implements Usb{
    public void setup(){

        System.out.println("安装键盘的驱动程序");
    }
    public void work(){

        System.out.println("通过键盘操作计算");
    }
}

public class InterfaceApplication {

    public static void main(String[] args) {
        Usb udisk=new UDisk();
        Usb keyboard=new KeyBoard();

        computer computer=new computer();

        computer.plugin(udisk);
        computer.plugin(keyboard);
    }
}


