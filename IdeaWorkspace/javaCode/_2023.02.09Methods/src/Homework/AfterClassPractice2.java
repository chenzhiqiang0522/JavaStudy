package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：AfterClassPractice2
 * Date：2023/2/9
 * Filename：AfterClassPractice2
 */

import java.util.Arrays;

/**
 * 定义一个方法，接受三个int参数，返回最小的一个数。
 */
public class AfterClassPractice2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,9,6,5,2,4,3,6,8,2};
        min(arr);
    }

    public static int[] min(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
