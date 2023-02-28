package org.chenzhiqiang.classcode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode
 * Project：JAVA
 * name：ArrayListTest
 * Date：2023/2/24
 * Filename：ArrayListTest
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        Iterator iterator = arrList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator);
            iterator.next();
        }

    }
}
