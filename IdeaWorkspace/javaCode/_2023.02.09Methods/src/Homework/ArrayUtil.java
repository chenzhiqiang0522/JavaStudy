package Homework;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：ArrayUtil
 * Date：2023/2/9
 * Filename：ArrayUtil
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr1 = {222,999,888,111,666,1587};
        int[] arr2 = new int[5];
        // Arrays工具类
        // 使用Arrays.toString打印整个数组
        System.out.println(Arrays.toString(arr1));

        // 使用Arrays.sort()排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
