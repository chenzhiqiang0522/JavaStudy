package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：Array
 * Date：2023/2/8
 * Filename：Array
 */
public class Array {
    public static void main(String[] args) {
        // 定义数组方法一：
        // 语法： 数据类型[] 数组名;(推荐)
        byte[] byteArray;
        int[] intArr;
        short[] shortArr;
        long[] longArr;
        byteArray = new byte[]{1,2,3};      // 静态初始化 new这个关键字 就是开辟空间
        intArr = new int[]{4,5,6};
        shortArr = new short[]{7,8,9};
        longArr = new long[]{10,11,12};
        byte[] byteArray1;
        int[] intArr1;
        short[] shortArr1;
        long[] longArr1;
        byteArray1 = new byte[3];           // 动态初始化:系统赋默认值
        intArr1 = new int[3];
        shortArr1 = new short[3];
        longArr1 = new long[3];
        System.out.println("静态初始化"+byteArray[0]);   // 取值:  数组名[索引]
        System.out.println("静态初始化"+intArr[1]);
        System.out.println("静态初始化"+shortArr[2]);
        System.out.println("动态初始化"+byteArray1[0]);   // 取值:  数组名[索引]
        System.out.println("动态初始化"+shortArr1[1]);
        System.out.println("动态初始化"+longArr1[2]);
        System.out.println("-----------分割线-----------");
        //赋值  语法 数组名[索引] = 值；
        System.out.println(byteArray1[1]);
        byteArray1[1] = 22;
        System.out.println(byteArray1[1]);


    }
}
