package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：BigIntegerTest
 * Date：2023/3/11
 * Filename：BigIntegerTest
 */

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * BigInteger 类代码
 *  BigInteger(String val, int radix) 将指定radix进制的字符串表示形式转换为BigInteger。
 *  BigInteger(String val) 将指定字符串转换为BigInteger。
 *  BigInteger(byte[] val) 将包含BigInteger的二进制补码表示的字节数组转换为BigInteger。
 *  bigInteger.add(BigInteger val)          加
 *  bigInteger1.subtract(BigInteger val)     减
 *  bigInteger1.multiply(BigInteger val)     乘
 *  bigInteger1.divide(BigInteger val)       除
 *  bigInteger1.divideAndRemainder(new BigInteger("23")) 返回一个数组，数组第一个元素为商，第二个元素为余数
 */
public class BigIntegerTest {
    @Test
    public void bigIntegerTest(){
        BigInteger bigInteger = new BigInteger("010", 2);   // BigInteger构造函数，
        BigInteger bigInteger1 = new BigInteger("80");
        System.out.println(bigInteger);
        System.out.println(bigInteger.add(new BigInteger("80")));
        System.out.println(bigInteger1.subtract(new BigInteger("1")));
        System.out.println(bigInteger1.multiply(new BigInteger("2")));
        System.out.println(bigInteger1.divide(new BigInteger("23")));
        System.out.println(Arrays.toString(bigInteger1.divideAndRemainder(new BigInteger("23"))));
    }
}
