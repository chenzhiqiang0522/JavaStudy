import java.io.File;
import java.time.LocalDate;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：CreateFile
 * Date：2023/3/2
 * Filename：CreateFile
 */

/**
 * 创建作业文件夹
 */
public class CreateFile {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String[] members = {"陈志强","冯练","钟正涛","吴峰"};
        String url="";
        url=url.concat(date.toString()).concat("第3组作业");
        File file = new File("D:\\桌面\\作业\\".concat(url));
        if (!file.exists()) {
            file.mkdir();
        }
        for (int i = 0; i < members.length; i++) {
            File file1 = new File(file,members[i]);
            file1.mkdirs();
        }
    }
}
