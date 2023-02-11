/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：Fill方法
 * Date：2023/2/11
 * Filename：Fill方法
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Arrays.fill()方法初始化数组
 *  语法：
 *  Arrays.fill(数组名,初始化值)
 *
 *
 * Arrays.sort() 对数组排序,返回一个新数组
 *  语法：
 *  Arrays.sort(待排序数组名)
 *
 * copyOf() 复制数组，可以指定新数组的长度，故可以用来扩大数组的长度
 *  语法：
 *  Array.copyOf(被复制的数组名，复制长度)
 *
 * copyOfRange() 复制数组中的部分
 *  语法：
 *  Arrays.copyOfRange(被复制数组，开始索引，结束索引)
 *
 */
public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        Arrays.fill(arr, 11);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------");
        Arrays.fill(arr1, 1, 3, 55);
        System.out.print(Arrays.toString(arr1));
        System.out.println("---------------------------");

        // sort排序
        int[] sortTest = new int[]{5, 4, 8, 2, 6};
        Arrays.sort(sortTest);
        System.out.println(Arrays.toString(sortTest));
        System.out.println("----------------------------");

        // copyOf()复制数组
        char[] charArr = new char[]{'1', '2', '3', '4', '5'};
        char[] charCopy = Arrays.copyOf(charArr,10);
        System.out.println(Arrays.toString(charCopy));
        System.out.println("------------------------------");

        // copyOfRange() 复制数组中的部分,左开右闭
        char[] charCopyRange = Arrays.copyOfRange(charArr, 1, 4);
        System.out.println(Arrays.toString(charCopyRange));
        System.out.println("-----------------------------");

        // binarySearch() 二分查找（折半查找）
        /*
            语法：
                Arrays.binarySearch(搜索的数组，[开始查找位置]，[结束查找的方法]，查找的目标值)
            注意事项:
                1、 在调用binarySearch方法时，要先使用sort排序，这样才能得到正确的结果
         */
        int[] arrayOrigin = {9,58,4,7,66,5,1,4,2,5,4,1,25,4,15,4,6,2,1,5,1,1,5,74,8,8,5};
        Arrays.sort(arrayOrigin);
        System.out.println(Arrays.toString(arrayOrigin));
        int locate = Arrays.binarySearch(arrayOrigin, 99);
        int locate1 = Arrays.binarySearch(arrayOrigin,11,50, 99);
        System.out.println("9的位置是："+locate);
    }
}
