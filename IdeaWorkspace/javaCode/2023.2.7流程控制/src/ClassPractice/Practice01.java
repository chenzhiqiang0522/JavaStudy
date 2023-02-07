package ClassPractice;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        if (var1 > var2)
            System.out.println("the max is " + var1);
        else
            System.out.println("the max is " + var2);
    }
}
