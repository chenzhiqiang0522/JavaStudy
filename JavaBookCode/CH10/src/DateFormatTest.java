import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：FormatTest
 * Date：2023/3/3
 * Filename：FormatTest
 */
public class DateFormatTest {
    public static void main(String[] args) {
        /*
            使用String.format对日期的格式化
         */
        Date date = new Date();
        String s = String.format("%te", date);
        System.out.println(s);
        String s1 = String.format("%td", date);
        System.out.println(s1);
        String s2 = String.format("%tb", date);
        System.out.println(s2);
        String s3 = String.format("%tB", date);
        System.out.println(s3);
        String s4 = String.format("%ty", date);
        System.out.println(s4);
        String s5 = String.format("%ta", date);
        System.out.println(s5);
        String s6 = String.format("%ta", date);
        System.out.println(s6);
        String s7 = String.format("%tc", date);
        System.out.println(s7);
        String s8 = String.format("%tY", date);
        System.out.println(s8);
        String s9 = String.format("%tj", date);
        System.out.println(s9);
    }
}
