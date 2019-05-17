package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:53
 * @Description:
 */
public class discountImpl extends IbookImpl {
    private float price;
    public discountImpl(String name, String author, float price) {
        super(name, author, price);
        this.price = price;
    }
    public float getPrice(){
            return (float) (this.price*0.8);
    }
}
