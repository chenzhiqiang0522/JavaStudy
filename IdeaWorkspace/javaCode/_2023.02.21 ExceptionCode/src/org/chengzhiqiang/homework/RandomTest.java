package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：RandomTest
 * Date：2023/2/21
 * Filename：RandomTest
 */

import java.util.Date;
import java.util.Random;

/**
 * Random类
 *  用于生成随机数
 */
public class RandomTest {
    public static void main(String[] args) {
        Date date = new Date(); // 创建一个Date对象
        System.out.println(date.getTime());
        Random random = new Random();   // 创建一个Random对象
        random.setSeed(date.getTime()); // 更新随机种子
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());

    }
}
