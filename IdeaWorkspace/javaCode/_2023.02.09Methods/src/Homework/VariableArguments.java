package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：VariableArguments
 * Date：2023/2/9
 * Filename：VariableArguments
 */

/**
 * 可变参数
 */
public class VariableArguments {
    /*
        语法：
            数据类型...参数名
     */
    public static void main(String[] args) {
        sum(99,1,11);
        sum1("this is a test case", 1,1,1,1);
    }

    public static void sum(int... n) {
        int sum = 0;
        for (int e:n ) {        // 可变参数可以看作一个数组
            sum += e;
        }
        System.out.println(sum);
    }

    public static void sum1(String s,int... n) {
        int sum = 0;
        for (int e:n ) {        // 可变参数只能放在形参的最后位置，
                                // 不能在形参的其他地方，也只能有一个可变参数
            sum += e;
        }
        System.out.println(s+sum);
    }
}
