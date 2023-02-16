package org.chenzhiqiang.homework.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.homework
 * Project：JAVA
 * name：Truck
 * Date：2023/2/16
 * Filename：Truck
 */
public class Truck implements Car {
    @Override
    public void run() {
        System.out.println("速度：80km/h");
    }

    public void transmition(){
        System.out.println("货车能够运输货物！！！");
    }
}
