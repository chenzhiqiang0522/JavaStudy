package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：AdvertiseClass
 * Date：2023/2/15
 * Filename：AdvertiseClass
 */
/*
    广告模特
 */
public class AdvertiseClass extends Model{
    @Override
    public void changeClothes() {
        System.out.println("以方式三更换衣服！！！！！");
    }

    public AdvertiseClass() {
    }

    public AdvertiseClass(String name, double waistline, double hipline, double brestline) {
        super(name, waistline, hipline, brestline);
    }
}
