package org.chenzhiqiang.homework.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.homework
 * Project：JAVA
 * name：MiCar
 * Date：2023/2/16
 * Filename：MiCar
 */
public class MiCar implements Car {
    @Override
    public void run() {
        System.out.println("速度：150km/h");
    }
    public void transmition(){
        System.out.println("我能放炮打你哦！");
    }
}
