package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 17:55
 * @Description:
 */
public abstract class CompareObject {
    protected Object object1;
    protected Object object2;

    public void setData(Object arg1, Object arg2){

        if (isAccept(arg1,arg2)) {
            object1 = arg1;
            object2 = arg2;
        }else {
            throw new RuntimeException( arg1 + " and " + arg2 + " isn't the them type ");
        }

    }

    //有抽象方法 类必须抽象
    protected abstract boolean isAccept(Object arg1, Object arg2) ;

    public abstract Object getMax();

    public abstract Object getMin();


}
