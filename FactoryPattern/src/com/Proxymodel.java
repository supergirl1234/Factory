package com;

import java.lang.reflect.Proxy;

/**
 * Author:Fanleilei
 * Created:2019/5/19 0019
 */
public class Proxymodel {

    public static void main(String[] args) {

        //真正的对象
        BoyFriendSend boyfriend=new BoyFriendSend("李华","小明");
        //代理对象
        ProxySend proxy=new ProxySend(boyfriend);
        proxy.send();
        System.out.println();
        System.out.println("真正的业务逻辑：");
        boyfriend.send();


    }
}

//业务接口
interface SendGift{

    void send();
}

//真正的业务接口
class BoyFriendSend implements SendGift{
    private String boyFirendName;
    private String grilFirendName;

    public BoyFriendSend(String boyFirendName, String grilFirendName){
        this.boyFirendName = boyFirendName;
        this.grilFirendName =grilFirendName;
    }


    @Override
    public void send() {
        System.out.println(this.boyFirendName+"送花给"+this.grilFirendName);

    }
}

//代理类

class ProxySend implements SendGift{
    private final SendGift boyFriend;

    public ProxySend(SendGift boyFriend) {
        this.boyFriend = boyFriend;
    }

    @Override
    public void send() {
        System.out.println("男朋友打电话给快递员");
        this.boyFriend.send();
        System.out.println("女朋友签收");

    }
}
