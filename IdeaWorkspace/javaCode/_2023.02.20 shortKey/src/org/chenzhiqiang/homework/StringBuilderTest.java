package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：StringBuilder
 * Date：2023/2/20
 * Filename：StringBuilder
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        StringBuilder sb1 = new StringBuilder("bcd");
        System.out.println(sb1);
        System.out.println(sb1.append("a"));    // 添加字符
        System.out.println(sb1.insert(1, "dddd")); // 插入
        System.out.println(sb1.delete(0, 1));   // 删除
    }
}
