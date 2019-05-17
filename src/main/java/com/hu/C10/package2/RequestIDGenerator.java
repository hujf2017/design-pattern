package com.hu.C10.package2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: xupc
 * @Date: 2019/4/28 12:53
 * @Description:
 */
public class RequestIDGenerator implements  CircularSeqGenerator {
    private final static RequestIDGenerator INSTANCE = new RequestIDGenerator();
    private final static short SEQ_UPPER_LIMIT = 999;
    private short sequence = -1;

    // 私有构造器
    private RequestIDGenerator() {
        // 什么也不做
    }
    /**
     * 返回该类的唯一实例
     *
     * @return
     */



    public synchronized short nextSequence() {
        if(sequence>=SEQ_UPPER_LIMIT){
            sequence=0;
        }else{
            sequence++;
        }
        return sequence;
    }

    public String nextID(){
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMddhhmmss");
        String timestamp = sdf.format(new Date());
    DecimalFormat df  = new DecimalFormat("000");
    short sequenceNo = nextSequence();

        return "0049" + timestamp + df.format(sequenceNo);
}

    public static RequestIDGenerator getInstance(){
        return INSTANCE;
    }
}
