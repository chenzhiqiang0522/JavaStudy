package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：CatTest
 * Date：2023/2/13
 * Filename：CatTest
 */

/**
 * Cat测试类
 */
public class CatTest {
    public static void main(String[] args) {
        // 调用无参构造器
        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getGender()? "雄性":"雌性");
        System.out.println(cat.getSpecies());
        System.out.println("=============================");
        Cat cat1 = new Cat("Tom",3,true,"Garfield");
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getGender()? "雄性":"雌性");
        System.out.println(cat1.getSpecies());
    }
}
