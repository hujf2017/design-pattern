package com.hu.设计原则.开闭原则;

/**
 * @Auther: xupc
 * @Date: 2019/5/16 18:01
 * @Description:
 */
public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("petter", 20,"mel");
        Person person2 = new Person("mery", 21,"fomel");
        ComparePerson person = new ComparePerson();
        person.setData(person1 ,person2);
        System.out.println(person.getMax().toString());


        Pig pig1 = new Pig(200,2);
        Pig pig2 = new Pig(250,3);
        ComparePig comparePig = new ComparePig();
        comparePig.setData(pig1,pig2);
        System.out.println(comparePig.getMax());
//        comparePig.setData(person1,person2);
//        System.out.println(comparePig.getMax());

        Ibook ibook = new IbookImpl("朝花夕拾","鲁迅",50);
        System.out.println(ibook.toString());

        System.out.println("今天全场8折");
        //现在我有一个打折的要求
        Ibook ibook2 = new discountImpl("朝花夕拾","鲁迅",50);
        ibook2 = new discountImpl("朝花夕拾","鲁迅",ibook2.getPrice());
        System.out.println(ibook2.toString());

    }
}
