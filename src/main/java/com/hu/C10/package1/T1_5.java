package com.hu.C10.package1;

/**
 * @Auther: xupc
 * @Date: 2019/4/27 15:49
 * @Description:
 */
public class T1_5 {
    public static void main(String []args) throws InterruptedException {
        Thread t;
        CountTask ct = new CountTask();
        //        //获取当前处理器
        final int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);
        for(int i=0;i<2*num;i++){
            t = new Thread(ct);//創建多綫程
            t.start();
        }

    }

    static  class Counter{
        private int count=0;

        public void increment(){
            count++;
        }
        public int vaule(){
            return count;
        }
    }

    static class CountTask implements Runnable{
        private Counter counter = new Counter();
        public void run() {
            for(int i=0;i<100;i++) {
                dosomething(); //休眠一會
                counter.increment();//數量+1
            }
            System.out.println("CT:"+counter.vaule());
        }

        private void dosomething() {
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
