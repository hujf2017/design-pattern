package com.hu.ThinkInJava.Construct;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 09:28
 * @Description:
 */

class  Art {
    Art(int i) {
        System.out.println("art");
    }
}

class sing extends Art{
    sing(int i) {
        super(i);  //调用构造器
    }
}

public class Cartoon extends  sing{
    int i=2;
    Cartoon(int i) {
        super(i);
        this.i = i;
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon(3);
        System.out.println(x.i);
    }
}
