package Homework;

import java.util.Scanner;

public class AfterClassPractice7 {
    public static void main(String[] args) {
        System.out.print("请输入年龄:");         // 输入年龄
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 0 && age < 18)            // 年龄判断
            System.out.println("父母负责");
        else if (age>=18 && age <= 60) {
            System.out.println("自己负责");
        }else if (age > 60)
            System.out.println("子女负责");
    }
}
