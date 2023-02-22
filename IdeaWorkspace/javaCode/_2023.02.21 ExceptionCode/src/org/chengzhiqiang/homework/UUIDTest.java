package org.chengzhiqiang.homework;

import java.util.UUID;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：UUIDTest
 * Date：2023/2/21
 * Filename：UUIDTest
 */

/**
 * public static UUID randomUUID()静态工厂检索一个类型4（伪随机生成）的UUID。 UUID是使用加密强伪随机数生成器生成的。
 */
public class UUIDTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();  // 产生UUID
        System.out.println(uuid);
        System.out.println(uuid.toString().replace("-", ""));   //  去除UUID中的-线

    }
}
