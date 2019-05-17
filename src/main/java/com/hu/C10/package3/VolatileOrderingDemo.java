package com.hu.C10.package3;

/**
 * @Auther: xupc
 * @Date: 2019/5/4 19:24
 * @Description:
 */

public class VolatileOrderingDemo {
    private int dateA =0;
    private long dateB=0L;
    private String dateC= null;

    private volatile  boolean ready = false;

    public void Write(){
        dateA =1;
        long dateB=10000L;
        String dateC= "content..";
        ready =true;
    }

    public int Reader(){
        int result =0;
        boolean allISOK;
        if(ready){
            allISOK = (1==dateA)&&(10000L ==dateB)&&"content..".equals(dateC);
            result  = allISOK?1:2;
        }else{
            result = 3;
        }
        return result;
    }

    public static void main(String[] args){
    //    TestRunner.run(VolatileOrderingDemo.class);
    }
}












