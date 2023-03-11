package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：ArithmeticExceptionCode
 * Date：2023/3/7
 * Filename：ArithmeticExceptionCode
 */
public class ArithmeticExceptionCode {
    public static void main(String[] args) {
        try {
            int result = 0;
            int dividened = 50;// 被除数
            int divisor = 0;
            result = dividened/divisor;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
