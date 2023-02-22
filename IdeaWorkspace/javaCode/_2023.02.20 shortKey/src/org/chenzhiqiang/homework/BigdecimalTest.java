package org.chenzhiqiang.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：BigdecimalTest
 * Date：2023/2/20
 * Filename：BigdecimalTest
 */
public class BigdecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(5.3332542514);
        BigDecimal b2 = new BigDecimal(62.0158425458);
        // add() 相加
        System.out.println(b1.add(b2));

        // substract() 相减
        System.out.println(b2.subtract(b1));

        // multiply() 相乘
        System.out.println(b1.multiply(b2));

        // divide() 相除
        System.out.println(b1.divide(b2,50,RoundingMode.HALF_UP));

    }
}
