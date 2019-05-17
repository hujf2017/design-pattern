package com.hu.设计原则.单一职责;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 12:02
 * @Description:
 */
public class House implements Live,Work {

    @Override
    public void live() {
        System.out.println("you can live here");
    }

    @Override
    public void work() {
        System.out.println("you can work here and play");
    }
}
