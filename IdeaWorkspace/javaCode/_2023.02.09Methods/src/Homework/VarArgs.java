package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：VarArgs
 * Date：2023/2/9
 * Filename：VarArgs
 */

/**
 * 
 */
public class VarArgs {
    public static void main(String[] args) {
        System.out.println("15、6、9的乘积为"+multiply(15,6,9));
    }

    public static int multiply(int... argInt){
        int result = 1;
        for (int e:argInt)
            result *= e;
        return result;
    }
}
