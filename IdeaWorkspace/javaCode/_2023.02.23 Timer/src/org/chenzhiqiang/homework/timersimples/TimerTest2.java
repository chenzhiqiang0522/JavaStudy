package org.chenzhiqiang.homework.timersimples;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：TimerTest2
 * Date：2023/2/23
 * Filename：TimerTest2
 */
public class TimerTest2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("干饭人，干饭魂！！！");
            }
        };
//        timer.schedule(tt, 5000);

        // 使用内部类实现
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("干饭人，干饭魂！！！");
            }
        }, 5000);


    }
}
