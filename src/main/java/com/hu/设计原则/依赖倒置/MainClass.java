package com.hu.设计原则.依赖倒置;


/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:01
 * @Description:
 *
 * 上层模块不应该依赖底层模块，它们都应该依赖于抽象。
 * 抽象不应该依赖于细节，
 * 细节应该依赖于抽象。
 *
 * SOLID
 *
 * 以汽车控制系统为例
 *
 *不可分割的原子逻辑就是低层逻辑（接口，抽象类）
 * 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的
 * 接口或抽象类不依赖于实现类
 * 实现类依赖于接口或抽象类
 *
 * 更为精简的定义：面向接口编程(Object-Oriented Design, OOD)
 *
 *
 * 一句话：依赖倒置原则的核心就是面向抽象(抽象类或者接口)编程
 */
public class MainClass {
    public static void main(String[] args) {
        IDriver hujf = new DriverImpl();
        Icar car = new Bmw();
        hujf.driver(car);

        Icar  benzi= new Benzi();
        hujf.driver(benzi);
    }
}
