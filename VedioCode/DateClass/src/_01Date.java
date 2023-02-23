import java.util.Date;
import java.util.Random;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：_01Date
 * Date：2023/2/22
 * Filename：_01Date
 */
public class _01Date {
    public static void main(String[] args) {
        Date date = new Date();
        Random randomDate = new Random();
        long r = randomDate.nextLong();
        Date date1 = new Date(r);
        long time = date.getTime()+1000l*60*60+24+365;
        date.setTime(time);
        System.out.println(date);
        System.out.println(date.equals(date1));
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));
        System.out.println(date);
        System.out.println(date1);
    }
}
