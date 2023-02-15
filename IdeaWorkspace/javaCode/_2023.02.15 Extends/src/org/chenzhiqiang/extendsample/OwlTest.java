package org.chenzhiqiang.extendsample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.extendsample
 * Project：JAVA
 * name：OwlTest
 * Date：2023/2/15
 * Filename：OwlTest
 */
public class OwlTest {
    public static void main(String[] args) {
        Owl owl = new Owl("nick");
        owl.fly();
        owl.bark();
        System.out.println(owl.getName());
    }
}
