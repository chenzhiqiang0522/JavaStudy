package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：TClass
 * Date：2023/2/15
 * Filename：TClass
 */
/*
    T台模特
 */
public class TClass extends Model {
    @Override
    public void changeClothes() {
        System.out.println("以方式一更换衣服！！！！");
    }

    public TClass(String name, double waistline, double hipline, double brestline) {
        super(name, waistline, hipline, brestline);
    }

    public TClass() {
    }
}
