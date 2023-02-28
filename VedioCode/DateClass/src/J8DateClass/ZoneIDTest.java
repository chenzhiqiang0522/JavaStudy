package J8DateClass;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：ZoneID
 * Date：2023/2/23
 * Filename：ZoneID
 */

import java.time.ZoneId;
import java.util.Set;

/**
 *  static Set<String> getAvailableZoneIds()    获取Java中支持的所有时区
 *  static ZoneId systemDefault()                获取系统默认时区
 *  static ZoneId of(String zoneId)              获取一个指定时区
 *
 */
public class ZoneIDTest {
    public static void main(String[] args) {
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        System.out.println(zoneId);
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Marigot"));
    }

}
