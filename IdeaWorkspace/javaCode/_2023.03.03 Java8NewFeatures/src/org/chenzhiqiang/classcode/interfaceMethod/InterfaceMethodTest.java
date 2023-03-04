package org.chenzhiqiang.classcode.interfaceMethod;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode.interfaceMethod
 * Project：JAVA
 * name：InterfaceMethodTest
 * Date：2023/3/3
 * Filename：InterfaceMethodTest
 */
public class InterfaceMethodTest implements MethodInInterface {
    public static void main(String[] args) {
        MethodInInterface.Imethod();
        new InterfaceMethodTest().defaultRun();
    }

    @Override
    public void run() {

    }
}
