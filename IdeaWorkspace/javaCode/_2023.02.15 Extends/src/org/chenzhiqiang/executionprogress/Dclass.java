package org.chenzhiqiang.executionprogress;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.executionprogress
 * Project：JAVA
 * name：Dclass
 * Date：2023/2/15
 * Filename：Dclass
 */

/**
 * 子类的构造函数中会先调用父类的构造函数，隐式的调用super
 */
public class Dclass extends Cclass {
    public Dclass() {
        System.out.println("D..........");
    }
}
