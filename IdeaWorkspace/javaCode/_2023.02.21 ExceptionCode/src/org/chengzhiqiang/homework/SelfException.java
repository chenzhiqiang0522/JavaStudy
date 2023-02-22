package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SelfException
 * Date：2023/2/21
 * Filename：SelfException
 */

/**
 * 自定义异常需要继承于Exception或其子类并在构造函数中调用父类的构造方法.
 */
public class SelfException extends Exception{
    public SelfException(){
        super("登录异常");
    }
}
