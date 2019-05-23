package com.hu.设计原则.单一职责;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 16:30
 * @Description:
 */
public class WorkImpladdplay implements   Work {

    @Override
    public void work() {
        System.out.println("you can work here and play");
    }
}
