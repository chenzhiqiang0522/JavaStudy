/**
 * 判断一个数是否是三的倍数
 * */
package Homework;
import java.util.Scanner;

public class IfCase {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        int a = scnner.nextInt();
        if (a%3 == 0) {         // 判断是否能被3整除
            System.out.println(a+"是3的倍数");
        }else {
            System.out.println(a+"不是3的倍数");
        }
    }
}
