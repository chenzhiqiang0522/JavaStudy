package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：StringIndexOutOfBoundsExceptionCode
 * Date：2023/3/7
 * Filename：StringIndexOutOfBoundsExceptionCode
 */

/**
 * 制造StringIndexOutOfBoundsException
 */
public class StringIndexOutOfBoundsExceptionCode {
    public static void main(String[] args) {
        try {
            String str = "makabaka";
            String subString = str.substring(2, 10).trim(); // 子串结尾强制越界
            System.out.println(subString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
