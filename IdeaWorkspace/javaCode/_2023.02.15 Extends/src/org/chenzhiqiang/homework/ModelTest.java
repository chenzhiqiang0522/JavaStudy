package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：ModelTest
 * Date：2023/2/15
 * Filename：ModelTest
 */
/*
    模特测试类
 */
public class ModelTest {
    public static void main(String[] args) {
        TClass t1 = new TClass("nick1",33.3,33.3,33.3);
        TClass t2 = new TClass("nick1",34.4,34.4,34.4);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("-----------------------------------------------------");
        AdvertiseClass advertiseClas1 = new AdvertiseClass("nick2",35.4,35.4,35.4);
        AdvertiseClass advertiseClas2 = new AdvertiseClass("nick2",35.4,35.4,35.4);
        System.out.println(advertiseClas1.equals(advertiseClas2));
        System.out.println("-----------------------------------------------------");
        FlatClass flatClass1 = new FlatClass("nick3",36.0,36.0,36.0);
        FlatClass flatClass2 = new FlatClass("nick3",36.0,36.1,36.0);
        System.out.println(flatClass1.equals(flatClass2));
    }

}
