package com.hu.C10.package3;

import com.hu.C10.package2.CircularSeqGenerator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: xupc
 * @Date: 2019/5/2 19:56
 * @Description:
 */
public class LockbasedCircularSeqGenerator implements CircularSeqGenerator {
    private short seq = -1;
    private final Lock lock  = new ReentrantLock();
    @Override
    public short nextSequence() {
        lock.lock();
        try {
            if (seq >= 999) {  //
                seq = 0;
            } else {
                seq++;
            }
            return seq;  //如果過程報錯
        }finally {
            lock.unlock();   //直接使用會導致鎖泄露
                                //用finally 實現 防守出現泄露的情況
        }

    }
}
