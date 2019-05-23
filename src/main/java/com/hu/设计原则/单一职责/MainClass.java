package com.hu.设计原则.单一职责;

/**
 * @Auther: xupc
 * @Date: 2019/5/17 11:52
 * @Description:
 * 单一职责，简化每个类的功能，使其职责单一。
 * 用显示例子：有一台手机，有摄像和播放mp3两个功能。过了一段时间，需求改变，我需要播放器能播放其他格式的英语
 * 那么此时有两种方法：
 * 1.换一台手机，连着摄像头一起换
 * 2.更换手机的播放器。
 * 很明显，换播放器更优。
 * 对于java开发也是一样
 * 如果存在一个类包含两个职责。
 * 那么当某一个类职责发生变化时，就需要吧两个都进行改变了。
 * 所以要采用单一职责
 *
 *  其实就是 一般不直接继承两个功能不相关的接口
 */
public class MainClass {
    public static void main(String args[]) {
        //第一种不满足单一职责的设计
        House house = new House();  //不把他划分为到一起
        Live live = house;
        Work work = house;
        live.live();
        work.work();
        //此时我需要在work里面做修改，就要修改house

        //第二种，以单一职责设计
        Live live2 = new LiveImpl();
        Work work2 = new WorkImpl();
        Work work3 = new WorkImpl();
        live2.live();
        work2.work();

    }

}
