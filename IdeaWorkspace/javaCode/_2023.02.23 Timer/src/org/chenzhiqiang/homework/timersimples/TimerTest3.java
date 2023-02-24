package org.chenzhiqiang.homework.timersimples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：TimerTest3
 * Date：2023/2/23
 * Filename：TimerTest3
 */

/**
 *  scheduleAtFixedRate(TimerTask task, Date firstTime, long period)
 *      从指定 的时间开始 ，对指定的任务执行重复的 固定延迟执行 。
 */
public class TimerTest3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(date.getTime());
        long dateTime = date.getTime()+2000;
        date.setTime(dateTime);
        //timer.schedule();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("干饭不积极，做人有问题！！！！！嘻嘻！！！！！！");
            }
        },date,2000);


    }
}
