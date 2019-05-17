package com.hu.C10.package2;

import com.hu.C10.util.Tools;

/**
 * @Auther: xupc
 * @Date: 2019/4/28 13:04
 * @Description:
 */
public class RaceConditionDemo {
    public static void main(String [] args){
        int numberofThreads = args.length>0?Short.valueOf(args[0]): 4;

        Thread [] workerThread = new Thread[numberofThreads];
        for(int i=0;i<numberofThreads;i++){
            workerThread[i] = new WorkThread(i,10);
        }
        for(Thread ct : workerThread){
            ct.start();
        }
    }

    private static class WorkThread extends Thread {
        private final int requestCount;

            public WorkThread(int id, int requestCount) {
            super("work-"+id);
            this.requestCount = requestCount;
        }
        public void run(){
            int i=requestCount;
            String requestID;
            RequestIDGenerator requestIDGenerator = RequestIDGenerator.getInstance();
            while(i-- >0){
                requestID = requestIDGenerator.nextID();
                processRequest(requestID);
            }
        }
        //模拟请求处理
        private void processRequest(String requestID) {
            Tools.randomPause(50);
            System.out.printf("%s got requestID: %s %n", Thread.currentThread().getName(), requestID);
        }
    }
}
