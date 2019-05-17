package com.hu.C10.package4;

import com.hu.C10.util.aa;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: xupc
 * @Date: 2019/5/15 20:57
 * @Description:
 */
public class ShutDowmTest {
    static volatile int index = 1;


    public static void main(String[] args) {
        int b=10;
        aa a = new aa();
        b >>>=10;
        long c = b;
        int k = (int) c;
        System.out.println(b);
        try {//设置线程池连接数3
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 5; i++) {
                executorService.submit(new AutoIncressNum()); //
            }
            Thread.sleep(2000);
            //他是停止正在运行的任务，返回空闲的线程，并且拒绝接受新的任务
            List<Runnable> list =  executorService.shutdownNow();
            System.out.println(executorService.isShutdown());
            System.out.println(executorService.isTerminated());
            for(Runnable l: list){
                System.out.println(l.toString());
            }
            for (int i = 0; i < 2; i++) {
                executorService.submit(new AutoIncressNum());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*
     * @Author xupc
     * @Date 2019/5/15 21:08
     * @return   runnable的一个线程任务
     **/
    static class AutoIncressNum implements  Runnable {
        @Override

        public void run() {
            try {
                Random random = new Random();
                Thread.sleep(5000L+random.nextInt(5000));
                System.out.println(Thread.currentThread().getName()+":"+index);
                index++;
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Interrupted!");
                e.printStackTrace();
            }
        }

    }
}
