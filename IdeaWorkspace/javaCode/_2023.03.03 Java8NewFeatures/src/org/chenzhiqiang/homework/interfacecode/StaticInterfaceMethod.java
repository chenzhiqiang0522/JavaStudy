package org.chenzhiqiang.homework.interfacecode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：StaticInterfaceMethod
 * Date：2023/3/3
 * Filename：StaticInterfaceMethod
 */
public interface StaticInterfaceMethod {
    void run();
    static void run1(){
        System.out.println("向东跑");
    }
    default void run2(){
        System.out.println("向西跑");
    }
}
