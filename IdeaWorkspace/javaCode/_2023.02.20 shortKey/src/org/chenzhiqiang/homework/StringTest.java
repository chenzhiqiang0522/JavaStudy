package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：StringTest
 * Date：2023/2/20
 * Filename：StringTest
 */
public class StringTest {
    public static void main(String[] args) {
        /*
            str2 = "222" 这句话 会先检查常量池中 是否有222 这个字符串 如果有 就直接引用地址
           true 因为没有使用new 所以比较的是 常量池中的地址
         */
        String str = "222";
        String str1 = "222";
        System.out.println(str==str1);
        /*
            str3  是用 new  所以在 堆中开辟了新的空间  所以比较地址是 false
         */
        String str2 = new String("222");
        System.out.println(str == str2);
        System.out.println("===============================");

        // 表示str1没有引用地址 没有引用地址不能调用方法 会报空指针异常


        // 表示str2对象引用了在常量池中创建了一个空字符串常量
        String str4 = "";
        String str5 = "";
        String str6=new String("");// 表示str3对象引用了在堆中创建了一个空字符串常量
        System.out.println(str4 == str5);
        System.out.println(str4 == str6);
        System.out.println("====================================");

        // 如果是true 证明常量拼接 会检测常量池
        // 如果是false 证明变量拼接 不会检测常量池 会创建一个新的放进去
        String str7 = "AABB";
        String str8 = "AA"+"BB";
        String str9 = "AA";
        String str10 = str9+"BB";
        System.out.println(str7 == str8);
        System.out.println(str1 == str10);


    }
}
