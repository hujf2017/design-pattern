package com.hu.C10.package1;

/**
 * @Auther: xupc
 * @Date: 2019/4/28 08:00
 * @Description:
 */
public class T1_6 {
    private  static int count;

    public static void main(String[] args){
        count =args.length>1?Integer.valueOf(args[0]):60;//>1 否则60
        int remaining;
        while(true){
            remaining = countDown();
            if(remaining ==0){
                break;
            }else{
                System.out.println("remaining:"+count );
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int countDown() {
        return count--;
    }
}
