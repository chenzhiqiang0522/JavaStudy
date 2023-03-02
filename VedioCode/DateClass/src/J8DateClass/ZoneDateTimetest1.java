package J8DateClass;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：Zoneidtest1
 * Date：2023/2/28
 * Filename：Zoneidtest1
 */
public class ZoneDateTimetest1 {
    public static void main(String[] args) {
        String time = "2023-02-28T17:19:19.149646+08:00[Asia/Chongqing]";
        System.out.println(ZonedDateTime.now().getZone());
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Chongqing")));
        System.out.println("---------------------------------------------");
        System.out.println(ZonedDateTime.parse(time).withDayOfMonth(15));
    }
}
