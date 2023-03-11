package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：NullPointerExceptionCode
 * Date：2023/3/7
 * Filename：NullPointerExceptionCode
 */

import java.util.Arrays;

/**
 * 制造NullPointerException
 */
public class NullPointerExceptionCode {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
