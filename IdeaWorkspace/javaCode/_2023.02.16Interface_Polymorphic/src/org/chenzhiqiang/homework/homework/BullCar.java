package org.chenzhiqiang.homework.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.homework
 * Project：JAVA
 * name：BullCar
 * Date：2023/2/16
 * Filename：BullCar
 */
public class BullCar implements Car {
    @Override
    public void run() {
        System.out.println("速度：10km/h");
    }

    public void transmition(){
        System.out.println("我能吃草！！！！");
    }
}
