package org.chenzhiqiang.homework.staticsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.staticsamples
 * Project：JAVA
 * name：Person
 * Date：2023/2/17
 * Filename：Person
 */

/**
 * static修饰变量和方法
 */
public class Person {
    static String name; // 姓名属性
    /*
        静态属性，
        静态属性实属类的，可以通过   类名.属性名  来调用
        static修饰的属性会优先加载，并存放在静态存储区，该类共享
     */
    public static void say(){
        System.out.println("人在说话！！！！！");
    }

    public void run(){
        System.out.println("人在跑！！！！");
    }
}
