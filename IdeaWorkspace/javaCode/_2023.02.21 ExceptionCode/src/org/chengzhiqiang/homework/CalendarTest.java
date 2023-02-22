package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：CalenderTest
 * Date：2023/2/21
 * Filename：CalenderTest
 */

import java.util.Calendar;

/**
 *
 * Calendar:
 *   Calendar提供了一种类方法getInstance ，用于获取此类型的一般有用的对象。
 * GregorianCalendar:
 *   void add(int field, int amount) 根据日历的规则，将指定的（已签名的）时间添加到给定的日历字段。
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println(date);
        System.out.println("年"+(date.get(Calendar.YEAR)));
        System.out.println("月"+(date.get(Calendar.MONTH)));
        System.out.println("日"+(date.get(Calendar.DAY_OF_MONTH)));
        System.out.println("时"+(date.get(Calendar.HOUR_OF_DAY)));
        System.out.println("分"+(date.get(Calendar.MINUTE)));
        System.out.println("秒"+(date.get(Calendar.SECOND)));
        System.out.println("--------------------------------------------------");
        /*
            add(int field, int amount) 根据日历的规则，将指定的（已签名的）时间添加到给定的日历字段。
         */
        date.add(Calendar.YEAR, 2);
        System.out.println("年"+(date.get(Calendar.YEAR)));
        date.add(Calendar.YEAR, -4);
        System.out.println("年"+(date.get(Calendar.YEAR)));

    }
}
