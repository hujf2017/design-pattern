package com.hu.C10.package1;

/**
 * @Auther: xupc
 * @Date: 2019/4/27 15:18
 * @Description:
 */
public class WelcomeThread implements  Runnable {
    public void run(){
        System.out.println("2.welcome,"+Thread.currentThread().getName());
    }
}
