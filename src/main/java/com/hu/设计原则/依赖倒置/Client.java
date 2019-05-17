package com.hu.设计原则.依赖倒置;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 10:53
 * @Description:
 * 一个司机类：包括开方法
 * 一个奔驰车类：包括跑方法
 *
 *
 */
/*
 * @Author xupc
 * @Date 2019/5/17 11:04
 * @return   这种设计就存在问题：client模块想要开宝马，就依赖于Driver模块
 * 而Driver模块能不能开又依赖于Benz类。而Benz类是一个比较明细的类，所以
 *
 **/
class Driver{
    public void driver(Benz benz){
        System.out.println("司机启动汽车");
        benz.run();
    }
}
class Benz {
    public void run(){
        System.out.println("奔驰车跑起来了");
    }
}

public class Client {
    public  static void main(String[] args){
        Driver xiaoli = new Driver();
        Benz benz = new Benz();
        xiaoli.driver(benz);
    }
}
