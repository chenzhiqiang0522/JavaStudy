package org.chenzhiqiang.homework.enumsamples;

import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：ConstantEnumTest
 * Date：2023/2/18
 * Filename：ConstantEnumTest
 */
public class ConstantEnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the month:");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println(ConstantEnum.SPRING);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(ConstantEnum.SUMMER);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(ConstantEnum.AUTUMN);
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(ConstantEnum.WINTER);
                break;
            default:
                System.out.println("输入月份不正确！！！！！");
        }
    }
}
