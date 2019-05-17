package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:07
 * @Description:
 */
public class Pig {

    public Pig(int weight,int age){
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "pig{" +
                "weight=" + weight +
                ", age=" + age +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int weight;
    int age;

}
