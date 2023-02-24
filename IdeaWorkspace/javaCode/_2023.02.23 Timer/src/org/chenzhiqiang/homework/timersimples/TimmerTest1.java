package org.chenzhiqiang.homework.timersimples;

import java.util.*;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：TimmerTest1
 * Date：2023/2/23
 * Filename：TimmerTest1
 */

/**
 * 定时器 Timer类
 *      构造方法：
 *      Timer timer = new Timer();
 *      timer.schedule（）
 */
public class TimmerTest1 {
    public static void main(String[] args) {
        Timer timer = new Timer();              //
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());
        cal.add(Calendar.SECOND, 5);
        Date date = cal.getTime();
        System.out.println(date);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("该干饭了，干饭人！！！！");
            }
        }, date);

    }
}
