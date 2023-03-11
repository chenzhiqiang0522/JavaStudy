/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：TimeFormatTest
 * Date：2023/3/5
 * Filename：TimeFormatTest
 */

import java.util.Date;

/**
 * 使用String.format对时间格式化
 */
public class TimeFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("两位数表示小时"+String.format("%tH", date));
        System.out.println("一位数表示小时"+String.format("%tk", date));
        System.out.println("12小时制"+String.format("%tI", date));
        System.out.println("获取上下午标识符"+String.format("%tp", date));
    }
}
