package J8DateClass;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：DateTimeFormatter
 * Date：2023/2/28
 * Filename：DateTimeFormatter
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("uuuu年MM月dd日 HH时mm分ss秒 EE G");
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Chongqing"));
        System.out.println(dateTimeFormatter.format(time));
        System.out.println();
    }
}
