package J8DateClass;

import java.time.Instant;
import java.time.ZoneId;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：Instant1
 * Date：2023/2/28
 * Filename：Instant1
 */
public class Instant1 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
//        System.out.println(ZoneId.getAvailableZoneIds());



        Instant ins = Instant.parse("2023-02-28T08:45:00.479699100Z");
        System.out.println(ins.plusSeconds(60));
    }
}
