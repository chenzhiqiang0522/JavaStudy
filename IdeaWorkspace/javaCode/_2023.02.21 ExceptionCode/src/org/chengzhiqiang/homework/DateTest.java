package org.chengzhiqiang.homework;

import java.util.Date;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：DateTest
 * Date：2023/2/21
 * Filename：DateTest
 */

/**
 * Date
 *  Date(long date) 分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，即1970年1月1日00:00:00 GMT
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        // 当前时间的毫秒数
        System.out.println(date.getTime());         //1676978169303 Tue Feb 21 19:16:09 CST 2023
        long d = 1676978169303l;
        Date date1 = new Date(d);
        System.out.println(date1);
        // 获取年
        System.out.println("年:"+(date1.getYear()-100));
        // 月
        System.out.println("月:"+(date1.getMonth()+1));
        // 日
        System.out.println("日:"+date1.getDate());
        // 时
        System.out.println("时:"+date1.getHours());
        // 分
        System.out.println("分:"+date1.getMinutes());
        // 秒
        System.out.println("秒:"+date1.getSeconds());
    }
}
