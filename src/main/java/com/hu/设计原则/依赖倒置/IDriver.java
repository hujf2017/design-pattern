package com.hu.设计原则.依赖倒置;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 11:08
 * @Description:
 */
public interface IDriver {
    void driver(Icar car);
    void driver(String car);
}
