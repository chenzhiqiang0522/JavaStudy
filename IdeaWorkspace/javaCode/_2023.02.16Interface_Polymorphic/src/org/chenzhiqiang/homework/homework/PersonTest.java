package org.chenzhiqiang.homework.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.homework
 * Project：JAVA
 * name：PersonTest
 * Date：2023/2/16
 * Filename：PersonTest
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.drive(new Truck());
        person.drive(new BullCar());
    }
}
