package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：StringCase
 * Date：2023/2/13
 * Filename：StringCase
 */

import java.util.Arrays;

/**
 * String API 练习
 */
public class StringCase {
    public static void main(String[] args) {
        String str = new String("This is practice string");
        // char charAt(int index) 返回 index索引处的char字符。
        System.out.println(str.charAt(5));
        System.out.println(str.endsWith("ing"));
        System.out.println(str.endsWith(".exe"));
        System.out.println(str.startsWith("Th"));
        System.out.println(str.startsWith("abc"));
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        // substring()中的参数左开右闭
        System.out.println(str.substring(1,5));
        // split() 将字符串按照规则分割为字符串数组
        System.out.println(Arrays.toString(str.split(" ")));

    }
}
