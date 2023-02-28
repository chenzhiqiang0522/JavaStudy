package org.chenzhiqiang.homework.listcodes;

import org.chenzhiqiang.homework.Shark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.listcodes
 * Project：JAVA
 * name：LinkListTest
 * Date：2023/2/24
 * Filename：LinkListTest
 */

/**
 * LinedList
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(new Shark("大白鲨", 10));
        linkedList.add(new Shark("灰鲸鲨", 11));
        linkedList.add(new Shark("灰鲸鲨", 11));
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        System.out.println("-----------------------getLast()-------------------------");
        System.out.println(linkedList.getLast());
        System.out.println("-----------------------remove-------------------------");
        linkedList.remove(new Integer(3));
        System.out.println(linkedList);
        System.out.println("-----------------------单向迭代器-------------------------");
        Iterator iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------双向迭代器-------------------------");
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext())
            listIterator.next();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
