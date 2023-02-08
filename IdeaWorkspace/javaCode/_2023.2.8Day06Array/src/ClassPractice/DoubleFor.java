/**
 * 双层for循环
 */
package ClassPractice;

public class DoubleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
