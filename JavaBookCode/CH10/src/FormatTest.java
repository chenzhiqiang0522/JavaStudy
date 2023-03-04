import java.time.Instant;
import java.time.ZoneId;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：FormatTest
 * Date：2023/3/3
 * Filename：FormatTest
 */
public class FormatTest {
    public static void main(String[] args) {
        Instant time = Instant.now();
        Instantstime.atZone(ZoneId.of("Asia/Chongqing"));
        System.out.println();
    }
}
