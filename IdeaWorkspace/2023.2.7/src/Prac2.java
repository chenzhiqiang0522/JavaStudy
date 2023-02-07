import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        if (var1 % 3 == 0)
            System.out.println("是3的倍数");
        else
            System.out.println("不是3的倍数");
    }
}
