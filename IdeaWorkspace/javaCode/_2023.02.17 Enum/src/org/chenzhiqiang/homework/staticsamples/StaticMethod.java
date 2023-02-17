package org.chenzhiqiang.homework.staticsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.staticsamples
 * Project：JAVA
 * name：StaticMethod
 * Date：2023/2/17
 * Filename：StaticMethod
 */

/**
 * 使用static修饰的方法无法重写
 * 使用static修饰的方法可以被其他类调用，通过 类名.方法名() 的方式调用
 * 优先加载
 */

/**
 * static 不能修饰外部类，但可以修饰内部类
 * static   不能修饰局部变量，但可以修饰成员变量
 * static   不能否修饰构造方法，但可以修饰普通方法
 */
public class StaticMethod extends Person {
    public static void main(String[] args) {
        Person.say();

    }
    @Override
    public void run() {
        System.out.println("这个奔跑的方法重写于Person父类");
    }
}
