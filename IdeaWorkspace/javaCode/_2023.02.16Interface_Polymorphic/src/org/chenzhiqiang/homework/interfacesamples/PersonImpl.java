package org.chenzhiqiang.homework.interfacesamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.interfacesamples
 * Project：JAVA
 * name：PersonImpl
 * Date：2023/2/16
 * Filename：PersonImpl
 */

/**
 * 实现接口
 */
public class PersonImpl implements ISwimable,IWalkable {
    @Override
    public void swim() {
        System.out.println("我游泳比走路快");
    }

    @Override
    public void walk() {
        System.out.println("我能在陆地上走路");
    }
}
