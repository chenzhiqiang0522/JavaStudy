package org.chenzhiqiang.homework.setcodes;

import org.chenzhiqiang.homework.Whale;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.setcodes
 * Project：JAVA
 * name：HashSetTest
 * Date：2023/2/25
 * Filename：HashSetTest
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        // 添加元素
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(new Whale("北大西洋露脊鲸",5));
        hashSet.add(new Whale("北大西洋露脊鲸",5));
        hashSet.add(new Whale("北太平洋露脊鲸 ",8));
        hashSet.add(new Whale("小须鲸",4));
        hashSet.add(new Whale("南极小须鲸",9));
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println("-----------------------foreach-------------------------");
        for (Object o:hashSet) {        // 增强for循环
            System.out.println(o);
        }
        System.out.println("-----------------------单向迭代器循环-------------------------");
        Iterator it = hashSet.iterator();   // 迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------remove（）-------------------------");
        hashSet.remove(new Whale("北大西洋露脊鲸",5));     // 删除元素
        System.out.println(hashSet);
    }
}
