package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：PackageTest
 * Date：2023/2/20
 * Filename：PackageTest
 */
public class PackageTest {
    public static void main(String[] args) {
        int a = 99;
        int b = 200;

        // 自动装箱 自动装箱拆箱只支持 基本数据类型和其对应的包装类
        Integer i1 = a;
        Integer i2 = b;
        // 自动拆箱
        System.out.println(Integer.max(i1, i2));
        System.out.println(Integer.min(i1, i2));

        // 手动装箱 自动装箱拆箱只支持 基本数据类型和其对应的包装类
        Integer i3 = new Integer(110);
        Integer i4 = new Integer("220");
        // 手动拆箱
        int a1 = i3.intValue();
        int a2 = i4.intValue();

        /*
            享元模式
        */
        Integer i5 = 127;
        Integer i6 = 127;
        Integer i7 = 128;
        Integer i8 = new Integer(128);
        System.out.println(i5 == i6);       // 在-128~127之间应用的是同一个地址，故为true
        System.out.println(i5 == i7);       // 超出范围后，缓存中没有值，则会自动创建一个对象
        System.out.println(i7 == i8);       // 使用new关键字会创建新对象，故为false

    }
}
