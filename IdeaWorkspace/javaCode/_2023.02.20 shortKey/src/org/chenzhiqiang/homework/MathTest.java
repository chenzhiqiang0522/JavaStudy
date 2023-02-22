package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：MathTest
 * Date：2023/2/20
 * Filename：MathTest
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // abs()
        System.out.println(Math.abs(-111));
        System.out.println(Math.abs(-11.2354));
        // ceil() 取不小于参数的最小数
        System.out.println(Math.ceil(5.2));
        // floor()  取不大于参数的最大数
        System.out.println(Math.floor(5.2));

        // round() 四舍五入
        System.out.println(Math.round(6.53));
        // max() 求较大值
        System.out.println(Math.max(6.53,-11.2));
        // min() 求较小值
        System.out.println(Math.max(6.53,-11.2));

    }
}
