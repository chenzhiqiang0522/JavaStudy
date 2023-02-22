package org.chengzhiqiang.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：DateFormatTest
 * Date：2023/2/21
 * Filename：DateFormatTest
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(); // Tue Feb 21 19:31:40 CST 2023
        System.out.println(date);
        System.out.println(df.format(date));
        String time = "2022/12/5 15:45:60";
        System.out.println(df.parse(time));     // Mon Dec 05 15:46:00 CST 2022

    }
}
