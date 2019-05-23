package com.hu.设计原则.里氏替换;

import java.util.HashMap;

/**
 * @Auther: xupc
 * @Date: 2019/5/22 11:02
 * @Description:
 */
//Hashmap < Map
//当子类覆盖或实现父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松
    //并非重写了父类的方法，而是重载了父类的方法。
public class MainClass {
    public static void main(String args[]){
        HashMap map = new HashMap();
        Father a = new Father();
        a.run(map);//关于方法调用的问题
        //如果子类的方法参数<父类的方法参数
        //子类方法在调用类参数方法时会被强制缩小，就无法再调用父类的方法

        Son son = new Son();
        son.run(map);
    }
}
