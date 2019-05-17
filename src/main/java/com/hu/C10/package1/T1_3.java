package com.hu.C10.package1;

/**
 * @Auther: xupc
 * @Date: 2019/4/27 15:12
 * @Description:
 */
public class T1_3 {
    public static void main(String []args) throws InterruptedException {
        Thread welcome = new Thread(new WelcomeThread() );
        welcome.start();
        Thread.sleep(1);
        System.out.println("1.welcome,"+Thread.currentThread().getName());
    }


}
