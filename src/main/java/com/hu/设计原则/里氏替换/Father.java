package com.hu.设计原则.里氏替换;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xupc
 * @Date: 2019/5/22 11:00
 * @Description:
 */
public class Father {
    public void run(HashMap map ){
        System.out.println("父类被调用了");
    }
}
