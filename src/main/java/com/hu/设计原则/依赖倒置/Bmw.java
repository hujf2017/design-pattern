package com.hu.设计原则.依赖倒置;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 11:17
 * @Description:
 */
public class Bmw implements Icar{
    @Override
    public void run() {
        System.out.println("BMW开车了");
    }
}
