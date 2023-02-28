package J8DateClass;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：ZoneDateTimeTest
 * Date：2023/2/24
 * Filename：ZoneDateTimeTest
 */
public class ZoneDateTimeTest {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        ZonedDateTime zdt1  = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Asia/Chongqing"));
//        ZonedDateTime zdt3 = ZonedDateTime.now(Instant.parse(""));
        ZonedDateTime zdt4 = ZonedDateTime.of(2023,2,24,11,11,30,500,ZoneId.of("Asia/Chongqing"));
        zdt4.plusDays(1l);
        ZonedDateTime zdt5 = zdt4.plusDays(1l);
        System.out.println(zdt4);
        System.out.println(zdt5);
        System.out.println("------------------------------------------------------------");

        Clock system = Clock.system(ZoneId.of("Asia/Chongqing"));
        System.out.println(ZonedDateTime.now(system));
        System.out.println(system);
    }
}
