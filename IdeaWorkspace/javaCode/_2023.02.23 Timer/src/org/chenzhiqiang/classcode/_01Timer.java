package org.chenzhiqiang.classcode;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode
 * Project：JAVA
 * name：_01Timer
 * Date：2023/2/23
 * Filename：_01Timer
 */
public class _01Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();

        Date date = new Date();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime().getTime());
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("该醒了兄弟！！！");
            }
        }, 10000);

    }
}
