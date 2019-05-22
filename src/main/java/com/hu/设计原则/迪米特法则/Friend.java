package com.hu.设计原则.迪米特法则;

/**
 * @Auther: xupc
 * @Date: 2019/5/21 08:57
 * @Description:
 */
public class Friend {
    private   Stranger stranger = new Stranger();
    public void operation2(){}
    public Stranger provide(){
        return stranger;
    }
    public void forward()
    {
        stranger.operation3() ;
    }
}
