package org.chengzhiqiang.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：HashMapTest
 * Date：2023/2/27
 * Filename：HashMapTest
 */

/**
 * HashMap类
 *      无序
 *      没有线程安全
 *      key和value可以为null
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(4,4);
        hm.put(5,5);
        System.out.println(hm);
        System.out.println(hm.keySet());        // keySet()获取key的Set集合
        hm.put(null,5);             // 可以为null
        hm.put(5,null);
        hm.put(5,58);       // HashMap的key是唯一的，多个相同的键值，取最后一次赋值的结果
        System.out.println(hm);
        System.out.println(hm.get(3));      // get()获取对应key的值
        System.out.println(hm.get(33));     // 没有对应的key对应的值，则返回null
        System.out.println(hm.getOrDefault(33, "该key没有值的映射"));

        HashMap hm2 = new HashMap(100); // 创建带有初始容量的HashMap
        HashMap hm3 = new HashMap(100, 0.9f);  // 创建带有初始容量和负载因子的HashMap
        System.out.println(hm.size());      // size()返回映射值的数量
        System.out.println(hm2.isEmpty()? "该map为空":"该map不为空");
        hm.replace(null, 95);
        System.out.println(hm);
        System.out.println("=====================HashMap重点方法========================");
        Collection mapCollection = hm.values();         //  返回map的value集合[95, 1, 2, 3, 4, 58]
        System.out.println(mapCollection);
        Set mapEntrySet = hm.entrySet();    // 返回map的entry集合[null=95, 1=1, 2=2, 3=3, 4=4, 5=58]
        System.out.println(mapEntrySet);
    }
}
