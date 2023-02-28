package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：HashtableTest
 * Date：2023/2/27
 * Filename：HashtableTest
 */

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

/**
 * HashTable类
 *      具有线程安全
 *      key和value都不允许为null
 *      无序
 *
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, 1);
        ht.put(2, 2);
        ht.put(3, 3);
        ht.put(4, 4);
        ht.put(5, 5);
        System.out.println(ht);
        System.out.println(ht.keySet());        // keySet()获取key的Set集合
//        ht.put(null, 5);             // key不可以为null
//        ht.put(5, null);                // value 不可以为null
        ht.put(5, 58);       // Hashtable的key是唯一的，多个相同的键值，取最后一次赋值的结果
        System.out.println(ht);
        System.out.println(ht.get(3));      // get()获取对应key的值
        System.out.println(ht.get(33));     // 没有对应的key对应的值，则返回null
        System.out.println(ht.getOrDefault(33, "该key没有值的映射"));

        Hashtable ht2 = new Hashtable(100); // 创建带有初始容量的Hashtable
        Hashtable ht3 = new Hashtable(100, 0.9f);  // 创建带有初始容量和负载因子的Hashtable
        System.out.println(ht2.size());      // size()返回映射值的数量
        System.out.println(ht2.isEmpty() ? "该map为空" : "该map不为空");
        System.out.println(ht2);
        System.out.println("=====================HashTable重点方法========================");
        Collection mapCollection = ht.values();         //  返回map的value集合[95, 1, 2, 3, 4, 58]
        System.out.println(mapCollection);
        Set mapEntrySet = ht.entrySet();    // 返回map的entry集合[null=95, 1=1, 2=2, 3=3, 4=4, 5=58]
        System.out.println(mapEntrySet);
    }
}
