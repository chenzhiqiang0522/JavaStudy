package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：ArrAddress
 * Date：2023/2/8
 * Filename：ArrAddress
 */

/**
 * 修改数组变量的地址
 */
public class ArrAddress {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4,5};
        int[] a = new int[]{9,8,7,6,5,4};
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("--------地址变更--------");
        a = a1;
        System.out.println(a[2]);
        System.out.println(a[3]);
    }
}
