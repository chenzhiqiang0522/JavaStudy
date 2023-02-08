package ClassPractice;

/**
 * Author：陈志强
 * Package：ClassPractice
 * Project：javaCode
 * name：BreakPractice
 * Date：2023/2/8
 * Filename：BreakPractice
 */
public class BreakPractice {
    public static void main(String[] args) {
        Loop:for (int i = 0; i < 50; i++) {
            System.out.println("第一层循环");
            for (int j = 2; j < 50; j += 2) {
                if (j==20) {
                    continue Loop;
                }
            }
        }
    }
}
