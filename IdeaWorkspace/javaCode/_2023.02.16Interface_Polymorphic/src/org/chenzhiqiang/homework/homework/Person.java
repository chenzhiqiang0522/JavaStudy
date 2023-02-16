package org.chenzhiqiang.homework.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.homework
 * Project：JAVA
 * name：PersonClass
 * Date：2023/2/16
 * Filename：Person
 */
public class Person implements IPerson {
    @Override
    public void drive(Car car) {
        car.run();
    }
}
