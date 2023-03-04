package org.chenzhiqiang.classcode.interfaceMethod;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode
 * Project：JAVA
 * name：MethodInInterface
 * Date：2023/3/3
 * Filename：MethodInInterface
 */

/**
 * JDK8 中可以在接口中写static静态方法
 *      1. 在接口中的静态方法必须要有方法体
 *      2. 在接口中的方法只能在接口中调用
 *      3.不能被子接口继承
 *      4.不能在实现类中重写覆盖和直接调用
 *  还可以写default默认方法
 *      1. 必须有方法体
 *      2. 接口的default方法不能够被接口本身调用，需要接口的实例（实现类对象）来调用；
 *      3. 可以被子接口继承、重写
 *      4. 可以在实现类中重写覆盖和直接调用
 */
public interface MethodInInterface {

    void run();
    public static void Imethod(){

    }

    default void defaultRun() {

    }
}
