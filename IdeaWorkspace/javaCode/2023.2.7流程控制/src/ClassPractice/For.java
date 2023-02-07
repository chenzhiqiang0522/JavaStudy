/**
 * 阶乘
 * */
package ClassPractice;

public class For {
    public static void main(String[] args) {
        int jieChen = 1;
        for (int i = 1; i <= 10; i++) {
            jieChen *= i;
        }
        System.out.println(jieChen);
    }
}
