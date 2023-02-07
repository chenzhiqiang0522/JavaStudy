/**
 * 2-4月显示春天，5-7月显示夏天，8-10月显示秋天，11-1月显示冬天
* */
package Homework;

import java.util.Scanner;

public class AfterClassPractice11 {
    public static void main(String[] args) {
        System.out.print("请输入月份:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 2:     // 判断春天
            case 3:
            case 4:
                System.out.println("春天");
                break;
            case 5:     // 判断夏天
            case 6:
            case 7:
                System.out.println("夏天");
                break;
            case 8:     // 判断秋天
            case 9:
            case 10:
                System.out.println("秋天");
                break;
            case 11:        // 判断冬天
            case 12:
            case 1:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误!!!!!!");
                break;
        }
    }
}
