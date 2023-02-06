/**
 * 键盘输入
 * */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.print("请输入相关内容："); // 输入提示语
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();              // 输入整数
        System.out.println("输入的内容："+a);     // 输出
    }
}
