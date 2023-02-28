package org.chengzhiqiang.homework;

import java.util.TreeMap;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：TreeSetTest
 * Date：2023/2/27
 * Filename：TreeSetTest
 */

/**
 * TreeMap
 *      通过实现Comparable接口实现自然排序，重写compareTo方法，代码见User类，否则会报错
 *      有序
 *      没有线程安全
 *      key不允许有null
*       value可以为null
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new User("nick",20), 2003);
        treeMap.put(new User("nick",21), 2002);
        treeMap.put(new User("nick",22), 2001);
        treeMap.put(new User("nick",23), 2000);
        System.out.println(treeMap);


        // TreeMap 有序
        TreeMap treeMap1 = new TreeMap();
        treeMap1.put(1, 1);
        treeMap1.put(3, 3);
        treeMap1.put(2, 2);
        treeMap1.put(6, 6);
        treeMap1.put(9, 9);
//        treeMap1.put(null, 10);
        treeMap1.put(10,null);
        System.out.println(treeMap1);

        // 使用Comparator接口实现定制排序,重写代码见SuperHero
        TreeMap tm2 = new TreeMap(new SuperHeroComparator());
        tm2.put(new SuperHero("Iron Man","Head iron"),22222);
        tm2.put(new SuperHero("Spider-Man","Human cicada pupa"),222236);
        tm2.put(new SuperHero("Black Panther","Super Cat"),36215);
        tm2.put(new SuperHero("Raccoon","Cute"),321452);
        System.out.println(tm2);
    }
}
