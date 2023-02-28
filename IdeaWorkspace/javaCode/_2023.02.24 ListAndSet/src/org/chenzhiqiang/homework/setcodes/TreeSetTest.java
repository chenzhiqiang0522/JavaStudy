package org.chenzhiqiang.homework.setcodes;

import org.chenzhiqiang.homework.Whale;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.setcodes
 * Project：JAVA
 * name：TreeSetTest
 * Date：2023/2/25
 * Filename：TreeSetTest
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nts = new TreeSet();    // 自然排序的TreeSet
        nts.add(9);
        nts.add(8);
        nts.add(7);
        nts.add(6);
        nts.add(5);
        System.out.println(nts);
        TreeSet tr1 = new TreeSet();
        tr1.add(new Whale("虎鲸", 6));
        tr1.add(new Whale("座头鲸", 10));
        tr1.add(new Whale("须鲸", 8));
        System.out.println(tr1);
        TreeSet tr2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Whale w1 = (Whale) o1;
                Whale w2 = (Whale) o2;
                if (w1.getCategory().length() > w2.getCategory().length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
