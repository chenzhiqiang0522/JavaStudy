package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SelfDefineException
 * Date：2023/2/21
 * Filename：SelfDefineException
 */
public class SelfDefineException {

    // 使用非自定义异常
    public static void login(){
        String account = "19982023";
        String password = "123456";
        if (account.equals(password))
            System.out.println("登录成功!");
        else
            throw new RuntimeException("密码错误");
    }
    // 使用自定义异常
    public static void login1() throws SelfException {
        String account = "19982023";
        String password = "123456";
        if (account.equals(password))
            System.out.println("登录成功!");
        else
            throw new SelfException();
    }

    public static void main(String[] args) throws SelfException {
        login1();
    }
}
