package ClassPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        System.out.println(var%3==0? "可以被3整除":"不可以被3整除");
    }
}
