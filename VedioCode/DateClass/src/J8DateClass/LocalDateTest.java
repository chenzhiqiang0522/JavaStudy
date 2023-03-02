package J8DateClass;

import java.time.LocalDate;

/**
 * Author：NickWiber(陈志强)
 * Package：J8DateClass
 * Project：JAVA
 * name：LocalDateTest
 * Date：2023/2/28
 * Filename：LocalDateTest
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.plusDays(1));
        System.out.println(date.withYear(2022));
    }
}
