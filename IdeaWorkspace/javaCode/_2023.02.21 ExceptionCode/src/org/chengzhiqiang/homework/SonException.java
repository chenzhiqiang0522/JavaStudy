package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SonException
 * Date：2023/2/21
 * Filename：SonException
 */

/**
 * 子类重写父类方法时,子类的异常是小于或等于父类抛出的异常
 */
public class SonException extends RuntimeExceptionTest {
    @Override
    public void test1() throws RuntimeException {
        super.test1();
    }
}
