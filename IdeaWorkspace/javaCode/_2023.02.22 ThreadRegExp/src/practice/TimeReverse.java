package practice;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Author：NickWiber(陈志强)
 * Package：practice
 * Project：JAVA
 * name：TimeReverse
 * Date：2023/2/23
 * Filename：TimeReverse
 */
public class TimeReverse {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        Button button = new Button();
        button.setFont(new Font("宋体", 66, 80));
        button.setForeground(Color.red);
        frame.add(button);
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年LL月dd日 HH:mm:ss");
        cal.set(2019, 3, 12, 12, 57,44);
        System.out.println(cal.getTime());
//②设置顶层窗体的大小
        frame.setSize(1000, 500);
//③设置顶层窗体的位置居中
        frame.setLocationRelativeTo(null);//居中
//④设置窗体可见
        frame.setVisible(true);
        for (int i = cal.get(Calendar.YEAR); i <=2999; i++) {
            cal.add(Calendar.SECOND, 1);
            String s = sdf.format(cal.getTime());
            System.out.println(s);
            button.setLabel(cal.get(Calendar.YEAR)+"年"+
                    cal.get(Calendar.MONTH)+"月"+
                    cal.get(Calendar.DAY_OF_MONTH)+"日  "+
                    cal.get(Calendar.HOUR)+"时"+
                    cal.get(Calendar.MINUTE)+"分"+
                    cal.get(Calendar.SECOND)+"秒");
            Thread.sleep(1000);
        }
    }
}
