package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：ArrayIndexOutOfBoundsExceptionCode
 * Date：2023/3/7
 * Filename：ArrayIndexOutOfBoundsExceptionCode
 */

/**
 * 制造ArrayIndexOutOfBoundsException
 */
public class ArrayIndexOutOfBoundsExceptionCode {
    public static void main(String[] args) {
        try {
            Integer[] intArr = {1,2,3,4,5,6};       // 穿件数组
            System.out.println(intArr[intArr.length + 1]);  // 强制下标越界
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
