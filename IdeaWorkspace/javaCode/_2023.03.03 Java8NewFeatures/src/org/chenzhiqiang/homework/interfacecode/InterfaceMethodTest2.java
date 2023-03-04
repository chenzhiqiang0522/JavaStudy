package org.chenzhiqiang.homework.interfacecode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：InterfaceMethodTest2
 * Date：2023/3/3
 * Filename：InterfaceMethodTest2
 */
public class InterfaceMethodTest2 implements InterfaceExtend{
    @Override
    public void run() {     // 实现run方法
        System.out.println("子接口的run方法");
    }

    public static void main(String[] args) {
        new InterfaceMethodTest2().run2();  // default修饰的接口中的方法可以在实现类中重写或者直接调用
        new InterfaceMethodTest2().run();
    }
}
