package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：ArrayFor
 * Date：2023/2/8
 * Filename：ArrayFor
 */

/**
 * 遍历数组
 */
public class ArrayFor {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 22, 55};
        int sumUneven = 0;
        int sumUnevenIndex = 0;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {          // 数组中奇数的和
                sumUneven += arr[i];
            }
            if (i % 2 != 0) {               // 数组中奇数下标的和
                sumUnevenIndex += arr[i];
            }
            sum += arr[i];
            if (arr[i] < 44) {              // 数组中小于44的值
                num++;
            }
        }
        System.out.println("奇数和为" + sumUneven);
        System.out.println("下标为奇数的和为" + sumUnevenIndex);
        System.out.println("平均值为" + String.format("%.2f", (double) ((double) sum / arr.length)));
        System.out.println("小于44元素个数为" + num);
    }
}
