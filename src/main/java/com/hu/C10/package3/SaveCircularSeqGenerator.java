package com.hu.C10.package3;

import com.hu.C10.package2.CircularSeqGenerator;

/**
 * @Auther: xupc
 * @Date: 2019/5/2 19:43
 * @Description:
 */
public class SaveCircularSeqGenerator implements CircularSeqGenerator {
    private short sequence = -1;

    @Override
    public short nextSequence() {
        synchronized (this){
            if (sequence >= 999) {
                sequence =0;
            }else {
                sequence++;
            }
         return sequence;
        }
    }
//    @Override
//    public synchronized short nextSequence() {
//        if(sequence>=999){
//            sequence =0;
//        }else {
//            sequence++;
//        }
//        return sequence;
//    }
}