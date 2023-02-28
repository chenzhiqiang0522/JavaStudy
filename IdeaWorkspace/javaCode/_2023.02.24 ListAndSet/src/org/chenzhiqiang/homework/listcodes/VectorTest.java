package org.chenzhiqiang.homework.listcodes;

import org.chenzhiqiang.homework.Shark;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.listcodes
 * Project：JAVA
 * name：VectorTest
 * Date：2023/2/25
 * Filename：VectorTest
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Shark shark1 = new Shark("灰鲸鲨", 11);
        Shark shark2 = new Shark("灰鲸鲨", 11);
        vector.add(new Shark("大白鲨", 10));
        vector.add(shark1);
        vector.add(shark2);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(3);
        vector.add(4);
        System.out.println(vector.toString());
        System.out.println("-----------------------remove()-------------------------");
        vector.remove(new Integer(4));
        System.out.println(vector);
        System.out.println("-----------------------单向迭代器-------------------------");
        Iterator unidireationalIterator = vector.iterator();
        while (unidireationalIterator.hasNext()){
            System.out.println(unidireationalIterator.next());
        }
        System.out.println("-----------------------双向迭代器-------------------------");
        ListIterator bidirectionalIterator = vector.listIterator();
        while (bidirectionalIterator.hasNext()){
            System.out.println(bidirectionalIterator.next());
        }
        while (bidirectionalIterator.hasPrevious()) {
            System.out.println(bidirectionalIterator.previous());
        }
    }
}
