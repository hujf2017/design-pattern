package com.hu.设计原则.依赖倒置;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 11:12
 * @Description:
 */
public class DriverImpl implements  IDriver{

    @Override
    public void driver(Icar car) {
        System.out.println("老司机开车了");
        car.run();
    }

    public void driver(String car) {
        System.out.println(car+"老司机开车了");
    }
}
