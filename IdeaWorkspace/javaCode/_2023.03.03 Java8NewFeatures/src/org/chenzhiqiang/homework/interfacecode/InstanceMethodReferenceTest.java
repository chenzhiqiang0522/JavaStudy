package org.chenzhiqiang.homework.interfacecode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.interfacecode
 * Project：JAVA
 * name：InstanceMethodReferenceT
 * Date：2023/3/4
 * Filename：InstanceMethodReferenceT
 */

/**
 * 使用Lambda表达式对实例方法进行引用
 */
public class InstanceMethodReferenceTest {
    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        InstacneInterface instacneInterface = new InstacneInterface() {
            @Override
            public void outPut(String message) {
                instanceMethodReference.out(message);

            }
        };

        InstacneInterface instacneInterface1 = instanceMethodReference::out;   // 引用实例方法
        instacneInterface.outPut("sdfadfa");
        instacneInterface1.outPut("dddddddddddddddd");

    }
}
