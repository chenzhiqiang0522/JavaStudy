package org.chenzhiqiang.homework.interfacecode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：InterfaceTest
 * Date：2023/3/3
 * Filename：InterfaceTest
 */

/**
 * 接口中的static修饰的方法不能被被继承，而default方法可以被继承
 *
 */
public class InterfaceTest implements StaticInterfaceMethod {
    @Override
    public void run() {
        System.out.println("11111111111111111");
    }

    @Override
    public void run2() {
        StaticInterfaceMethod.super.run2();
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        StaticInterfaceMethod.run1();       // static修饰的方法可以在接口中调用
        interfaceTest.run();
        interfaceTest.run2();               // default修饰的方法不能在本接口中调用，只能在实现类或者子类中调用
    }
}
