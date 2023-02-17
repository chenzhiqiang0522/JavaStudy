package org.chenzhiqiang.homework.staticsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.staticsamples
 * Project：JAVA
 * name：PersonTest
 * Date：2023/2/17
 * Filename：PersonTest
 */
public class PersonTest {
    public static void main(String[] args) {
        Person.say();
        Person.name = "孙悟空";
        System.out.println("说话人的姓名是"+ Person.name);
    }
}
