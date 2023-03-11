package addtional.trans_Record;

import java.io.File;
import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：addtional.trans_Record
 * Project：JAVA
 * name：Second
 * Date：2023/3/7
 * Filename：Second
 */
public class Second {
    public static void main(String[] args) {
        Integer num = countTimes(new File("D:\\桌面\\作业"), "第3组作业");

    }

    public static Integer countTimes(File f,String str){
        File[] files = f.listFiles();
        String[] list = f.list();
        int num = 0;
        for (String s:list){
            if (s.contains(str))
                num++;
        }
        System.out.println("出现了"+num+"次");
//        System.out.println(Arrays.toString(list));
        return num;
    }
}
