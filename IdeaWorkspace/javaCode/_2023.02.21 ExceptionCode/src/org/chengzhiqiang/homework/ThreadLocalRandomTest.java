package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：ThreadLocalRandomTest
 * Date：2023/2/21
 * Filename：ThreadLocalRandomTest
 */

import java.util.concurrent.ThreadLocalRandom;

/**
 * ThreadLocalRandomTest
 * 创建对象:ThreadLocalRandom.current() （其中X是Int ， Long ，等）。
 */
public class ThreadLocalRandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        System.out.println(tlr.nextBoolean());
        System.out.println(tlr.nextFloat());
        System.out.println(tlr.nextInt(10));
    }
}
