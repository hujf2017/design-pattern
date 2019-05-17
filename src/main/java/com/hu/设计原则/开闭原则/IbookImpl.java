package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:47
 * @Description:
 */
public class IbookImpl implements  Ibook {
    private String name ;
    private String author ;
    private float price;
    public IbookImpl(String name,String author,float price){
        this.name = name;
        this.author =author;
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "IbookImpl{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
