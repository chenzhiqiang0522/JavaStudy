package org.chengzhiqiang.classcode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.classcode
 * Project：JAVA
 * name：DateFormat
 * Date：2023/2/21
 * Filename：DateFormat
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime());
        Date d1 = new Date(1676962898261l);
        Date d2 = new Date(1676962588491l);
        System.out.println(d1.after(d2));
        System.out.println(d1.before(d2));
        String d3 = "2023/02/21 03:01:38";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String dateString = dateFormat.format(d1);
        System.out.println(dateString);
        System.out.println(dateFormat.parse(dateString));
        System.out.println(dateFormat.parse(dateFormat.format(d2)));
    }
}
