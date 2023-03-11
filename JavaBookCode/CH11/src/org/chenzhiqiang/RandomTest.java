package org.chenzhiqiang;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：RandomTest
 * Date：2023/3/11
 * Filename：RandomTest
 */

/**
 * Random() 类练习
 */
public class RandomTest {
    @Test
    public void randomTest(){
        Random random = new Random();      // 创建random类
        long seedValue = System.nanoTime();     // 随机数生成器的种子
        Random random1 = new Random(seedValue);
        System.out.println("==========nextInt()============");
        System.out.println(random.nextInt());       // 随机int类型的整数
        System.out.println(random1.nextInt());
        System.out.println("==9========nextLong()============");
        System.out.println(random.nextLong());      // 随机Long类型的整数
        System.out.println(random1.nextLong());
        System.out.println("==========nextBoolean()============");
        System.out.println(random.nextBoolean());       // 随机Boolean
        System.out.println(random1.nextBoolean());
        System.out.println("==========nextFloat()============");
        System.out.println(random.nextFloat());     // 随机float类型
        System.out.println(random1.nextFloat());
        System.out.println("==========nextDouble()============");
        System.out.println(random.nextDouble());     // 随机float类型
        System.out.println(random1.nextDouble());
    }
}
