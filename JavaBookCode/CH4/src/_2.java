/**
 * Author：陈志强
 * Package：PACKAGE_NAME
 * Project：JavaBookCode
 * name：_2
 * Date：2023/2/8
 * Filename：_2
 */
public class _2 {
    public static void main(String[] args) {
        int lineCount = 17;
        int maxLine = (17 / 2) + 1;
        for (int i = 1; i <= maxLine; i++) { // 1-9行
            for (int j = 1; j <= maxLine - i; j++) {
                System.out.print("  ");
            }
            for (int start = 1; start <= (2 * i) - 1; start++)
                System.out.print("* ");
            System.out.println();
        }

        int descLine = lineCount - maxLine;
        for (int i = 1; i <= descLine; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int start = 1;start <= (descLine-i +1)*2-1; start++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
