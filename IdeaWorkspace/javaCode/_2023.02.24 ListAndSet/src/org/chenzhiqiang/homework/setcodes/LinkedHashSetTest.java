package org.chenzhiqiang.homework.setcodes;

import org.chenzhiqiang.homework.Whale;

import java.util.LinkedHashSet;
import java.util.ListIterator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.setcodes
 * Project：JAVA
 * name：LinkedHashSet
 * Date：2023/2/25
 * Filename：LinkedHashSet
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet lHashSet = new LinkedHashSet();
        lHashSet.add(1);
        lHashSet.add(2);
        lHashSet.add(3);
        lHashSet.add(4);
        lHashSet.add(5);
        lHashSet.add(new Whale("北大西洋露脊鲸", 5));
        lHashSet.add(new Whale("小须鲸", 4));
        lHashSet.add(new Whale("南极小须鲸", 9));
        System.out.println("-----------------------foreach-------------------------");
        for (Object o:lHashSet){
            System.out.println(o);
        }

    }
}
