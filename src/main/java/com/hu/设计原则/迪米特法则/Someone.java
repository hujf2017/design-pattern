package com.hu.设计原则.迪米特法则;

/**
 * @Auther: xupc
 * @Date: 2019/5/21 08:56
 * @Description:
 */
public class Someone {
    public void operation1(Friend friend){
        //违背迪米特法则
        Stranger stranger = friend.provide() ;
        stranger.operation3();


        //不违背的情况
        friend.forward();
    }
}
