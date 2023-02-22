package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：StringBufferTest
 * Date：2023/2/20
 * Filename：StringBufferTest
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length());
        StringBuffer sb = new StringBuffer("abcd");
        System.out.println(sb);
        StringBuffer ss = sb.append("efgh").append("ijkl").append("mnopq");
        System.out.println(ss);
        // 插入
        System.out.println(sb.insert(3, "111"));
        // 删除
        System.out.println(sb.delete(3, 6));
        /*
            String 和 StringBuilder 和StringBuffer的区别
            String 底层是不可变数组 不适合做字符串拼接
            StringBuilder 底层是可变的数组  适合做大量的字符串拼接 但是 线程不安全 扩容 长度 * 2 + 2
            StringBuffer 底层是可变的数组  适合做大量的字符串拼接 且线程安全 扩容 长度 * 2 + 2
         */
    }
}
