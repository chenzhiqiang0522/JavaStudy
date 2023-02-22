package org.chengzhiqiang.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：RuntimeExceptionTest
 * Date：2023/2/21
 * Filename：RuntimeExceptionTest
 */

/**
 * 非运行时异常需要手动抛出,而运行时异常则不需要通过手动抛出
 */
public class RuntimeExceptionTest {
    public static void main(String[] args) throws ParseException {
        //test1();
        test2();
    }
    // RuntimeException Sample

    public void test1(){
        int[] a = new int[5];
        System.out.println(a[5]);
    }

    // Exception Sample
    public static void test2() throws ParseException {  // 抛出异常
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sf.parse("2023-02-21 14:52:30");
    }
}
