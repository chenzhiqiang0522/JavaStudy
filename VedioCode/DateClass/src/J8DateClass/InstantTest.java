package J8DateClass;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：InstantTest
 * Date：2023/2/23
 * Filename：InstantTest
 */
public class InstantTest {
    public static void main(String[] args) {
        Instant ins = Instant.now();        // 获取当前标准时间
        Instant ins5 = Instant.parse("2023-02-23T12:20:54.618132300Z");        // 获取当前标准时间
        System.out.println(ins5);

        Instant ins2 = Instant.ofEpochMilli(1000L);
        System.out.println(ins2);
        Instant ins3 = Instant.ofEpochSecond(60L);
        System.out.println(ins3);
        Instant ins4 = Instant.ofEpochSecond(60L,1000000000L);
        System.out.println(ins4);

        System.out.println(ins3.isAfter(ins4));
        System.out.println(ins4.isBefore(ins3));

        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Aqtau"));
        System.out.println(zdt);

    }
}
