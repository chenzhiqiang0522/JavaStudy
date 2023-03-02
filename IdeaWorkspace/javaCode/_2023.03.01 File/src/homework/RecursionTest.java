package homework;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：RecursionTest
 * Date：2023/3/1
 * Filename：RecursionTest
 */
public class RecursionTest {
    public static void main(String[] args) {
        Integer[] original = new Integer[20];
        Integer[] original1 = new Integer[20];
        fibolacci(original,2);
        System.out.println(Arrays.toString(original));
        System.out.println(factorial1(10));
    }

    public static void fibolacci (Integer[] arr,int i) {    //  打印斐波拉契数列
        arr[0] = 0;
        arr[1]=1;
        if (i<=8){
            arr[i]=arr[i-2]+arr[i-1];
            i++;
            fibolacci(arr,i);
        }
    }

    public static Integer factorial1(Integer n){    // 计算阶乘
        if (n<=1)
            return 1;
        return n*factorial1(n-1);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
