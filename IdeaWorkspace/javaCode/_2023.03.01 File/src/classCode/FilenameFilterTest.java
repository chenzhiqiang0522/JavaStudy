package classCode;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：FilenameFilterTest
 * Date：2023/3/1
 * Filename：FilenameFilterTest
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\11111\\2222222");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return true;
            }
        });
        System.out.println(files.length);
        System.out.println("==============================================");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".pptx");
            }
        });
        System.out.println(list.toString());
        System.out.println("===============================================");
        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println(pathname);
                return pathname.getName().endsWith(".xlsx");
            }
        });
        System.out.println(files1.length);
        System.out.println(file.getParent());
        System.out.println(File.listRoots().toString());
    }
}
