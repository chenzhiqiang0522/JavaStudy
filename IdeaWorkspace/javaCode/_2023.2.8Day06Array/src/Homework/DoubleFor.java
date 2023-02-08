package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：DoubleFor
 * Date：2023/2/8
 * Filename：DoubleFor
 */

/**
 * 打印5行3列的*
 */
public class DoubleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++) {        // 控制行
            for (int j = 0;j<3;j++){        //控制一行打印的*个数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
