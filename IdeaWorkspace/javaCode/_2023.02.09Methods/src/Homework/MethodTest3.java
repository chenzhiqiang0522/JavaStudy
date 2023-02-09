package Homework;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：MethodTest3
 * Date：2023/2/9
 * Filename：MethodTest3
 */
public class MethodTest3 {
    public static void main(String[] args) {
        int a= 1;
        System.out.println("修改前"+a);
        change(a);
        System.out.println("修改后"+a);
        int[] arr = {2,2,2};
        System.out.println("修改前数组"+Arrays.toString(arr));
        change1(arr);
        System.out.println("修改完成后数组"+Arrays.toString(arr));
    }

    public static void change(int a) {
        a = 99;                             // 修改变量值
        System.out.println("正在修改"+a);
    }
    public static void change1(int[] arr) {     // 修改数组中的第二个数
        arr[1] = 111;
        System.out.println("正在修改数组"+Arrays.toString(arr));
    }
}
