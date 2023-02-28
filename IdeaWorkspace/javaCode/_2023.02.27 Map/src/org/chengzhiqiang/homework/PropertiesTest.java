package org.chengzhiqiang.homework;

import java.util.Properties;
import java.util.TreeMap;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：PropertiesTest
 * Date：2023/2/27
 * Filename：PropertiesTest
 */

/**
 * Properties 类
 *      有线程安全
 *      key和value只能是String类型
*              public synchronized Object setProperty(String key, String value) {
*                  return put(key, value);
*              }
 *      key唯一
 *      key和value不能为空
 *
 *
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties pt = new Properties();
        pt.setProperty("Iron Man","Head iron");
        pt.setProperty("Spider-Man","Human cicada pupa");
        pt.setProperty("Black Panther","Super Cat");
        pt.setProperty("Raccoon","Cute");
        System.out.println(pt);

    }
}
