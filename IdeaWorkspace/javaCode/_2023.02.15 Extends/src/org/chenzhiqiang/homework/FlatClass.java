package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：FlatClass
 * Date：2023/2/15
 * Filename：FlatClass
 */
/*
    平面模特类
 */
public class FlatClass extends Model {
    @Override
    public void changeClothes() {
        System.out.println("以方式二更换衣服！！！！");
    }

    public FlatClass() {
    }

    public FlatClass(String name, double waistline, double hipline, double brestline) {
        super(name, waistline, hipline, brestline);
    }
}
