package org.chenzhiqiang.homework.innerclasssamples;

import org.w3c.dom.ls.LSOutput;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.innerclasssamples
 * Project：JAVA
 * name：ComputerTest
 * Date：2023/2/17
 * Filename：ComputerTest
 */

/**
 * 创建内部类对象：
 *      没有static修饰的内部类：外部类类名.内部类类名 对象名 = new 外部类类名().new 内部类类名()
 *      有static修饰的内部类：外部类类名.内部类类名 对象名 = = new 外部类类名().内部类类名()
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer pc = new Computer("HP","OMEN","WIFI6","SSD");
        System.out.println(pc);
        System.out.println("--------------------------------------------------");
        Computer.WIFI wifi = new Computer().new WIFI();
        System.out.println(wifi);
        System.out.println("--------------------------------------------------");
        Computer.HardDisk disk = new Computer.HardDisk();
        System.out.println(disk);
    }
}
