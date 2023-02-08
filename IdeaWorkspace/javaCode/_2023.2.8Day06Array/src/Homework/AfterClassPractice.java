package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：AfterClassPractice
 * Date：2023/2/8
 * Filename：AfterClassPractice
 */
public class AfterClassPractice {
    public static void main(String[] args) {
        int[] a = {5,4,23,5,65,87,66,77};
        for (int i = 0; i < a.length; i++) {        // 冒泡排序
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    a[j] = a[j]+a[j+1];
                    a[j+1] = a[j]-a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int min = a[0];
        int max = a[a.length-1];
        System.out.println("数组总和"+sum);     // 数组总和
        System.out.println("数组最大值"+max);    // 最大值为数组最后一个值
        System.out.println("数组最小值"+min);    // 最小值为数组第一个值
    }
}
