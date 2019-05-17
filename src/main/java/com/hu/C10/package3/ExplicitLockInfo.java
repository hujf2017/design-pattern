package com.hu.C10.package3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: xupc
 * @Date: 2019/5/2 20:04
 * @Description:
 */
public class ExplicitLockInfo {
    private static final Lock lock = new ReentrantLock();
    private static int shareData = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t  = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    shareData = 1;
                }finally {
                    lock.unlock();
                }
            }
        });
        t.start();
        Thread.sleep(100);
        lock.lock();
        try {
            System.out.println("sharedata " + shareData);  //主綫程獲取到的的數據為子綫程跟新后的共享數據W
        }finally {
            lock.unlock();
        }
    }
}
