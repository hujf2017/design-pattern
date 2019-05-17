package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:11
 * @Description:
 */
public class ComparePig extends CompareObject{

    @Override
    protected boolean isAccept(Object arg1, Object arg2) {
        if((arg1 instanceof  Pig)&& (arg2 instanceof Pig)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object getMax() {
        if(((Pig) object1).getWeight()>((Pig)object2).getWeight()) {
            return object1;
    }
        return object2;
    }

    @Override
    public Object getMin() {
        return null;
    }
}
