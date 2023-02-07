/**
 *  课后练习题6
 *
 * */
package Homework;

import java.util.Scanner;

public class AfterClassPractice6 {
    public static void main(String[] args) {
        System.out.print("请输入一个数:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input%2==0)     // 判断是否是偶数
            System.out.println(input+"为偶数");
        else                  // 判断是否是奇数
            System.out.println(input+"为奇数");
    }
}
