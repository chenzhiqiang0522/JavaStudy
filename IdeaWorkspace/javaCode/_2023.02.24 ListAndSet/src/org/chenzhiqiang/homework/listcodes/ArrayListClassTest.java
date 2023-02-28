package org.chenzhiqiang.homework.listcodes;

import org.chenzhiqiang.homework.Shark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.listcodes
 * Project：JAVA
 * name：ArrayListClass
 * Date：2023/2/24
 * Filename：ArrayListClass
 */
public class ArrayListClassTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Shark("大白鲨", 10));
        arrayList.add(new Shark("灰鲸鲨", 11));
        arrayList.add(new Shark("灰鲸鲨", 11));
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);

        System.out.println("初始："+arrayList);
        arrayList.remove(1);// 删除元素
        System.out.println("现在："+arrayList);
        arrayList.remove(4);// 删除元素
        System.out.println("现在："+arrayList);
        arrayList.remove(4);// 删除元素
        System.out.println("现在："+arrayList);
        System.out.println("-----------------------for-------------------------");
        arrayList.add(4);
        arrayList.add(4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-----------------------foreach-------------------------");
        for (Object j : arrayList) {
            System.out.println(j);
//            arrayList.remove(j);
        }
        System.out.println("-----------------------单向迭代器循环-------------------------");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());                // iterator.next() 返回迭代中的下一个元素
        }
        System.out.println("-----------------------双向迭代器循环-------------------------");
        ListIterator iterator1 = arrayList.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        while(iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }
    }
}
