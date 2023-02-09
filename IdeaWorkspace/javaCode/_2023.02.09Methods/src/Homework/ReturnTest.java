package Homework;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：ReturnTest
 * Date：2023/2/9
 * Filename：ReturnTest
 */

/*
    return 返回语句
        用于返回函数处理的最后结果，并将其返回到main函数
 */
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest returnTest = new ReturnTest();
        System.out.println(Arrays.toString(returnTest.returnAarray()));
    }

    public int[] returnAarray(){
        int[] arr = {9,8,7,6,5,4};
        Arrays.sort(arr);
        return arr;
    }
}
