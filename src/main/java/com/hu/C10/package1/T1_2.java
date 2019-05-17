package com.hu.C10.package1;

/**
 * @Auther: xupc
 * @Date: 2019/4/27 15:05
 * @Description:
 */
public class T1_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread welcome = new WelcomeThread();
        welcome.start();
        Thread.sleep(100);
        System.out.println("1.welcome,"+Thread.currentThread().getName());
    }
    static class WelcomeThread extends Thread{

        public void run(){
            System.out.println("2.welcome,"+Thread.currentThread().getName());
        }
    }
}
