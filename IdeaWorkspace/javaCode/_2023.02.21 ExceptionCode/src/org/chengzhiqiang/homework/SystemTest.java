package org.chengzhiqiang.homework;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SystemTest
 * Date：2023/2/21
 * Filename：SystemTest
 */
public class SystemTest {
    public static void main(String[] args) {
        /*
         * static arrayCopy();
         * src：源数组
         * srcPos：源位置
         * dest：目标数组
         * destPos：目标位置
         * length：拷贝的长度
         * System.arraycopy( src, srcPos, dest, destPos, length);
         */
        char[] arr1 = {'a','b','c','e','f','f','a','s','d','f'};
        char[] arr2 = new char[20];
        System.arraycopy(arr1, 2, arr2, 2, 4);
        System.out.println(Arrays.toString(arr2));

        /*
            获取当前时间的毫秒数 时间戳
         */
        System.out.println(System.currentTimeMillis());

        // 退出系统
        System.exit(0);

        // 垃圾回收
        System.gc();
    }
}
