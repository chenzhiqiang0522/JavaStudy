package org.chenzhiqiang.abstractsample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.abstractsample
 * Project：JAVA
 * name：Circle
 * Date：2023/2/15
 * Filename：Circle
 */
public class Circle extends AbstructGraphic{        // 重写AbstructGraphic类中的方法
    double PI = 3.14;
    @Override
    public void getArea(double r) {
        System.out.println("圆的面积为:"+(PI*r*r));
    }

    @Override
    public void getCircumstance(double r) {
        System.out.println("圆的周长为:"+(2*PI*r));
    }
}
