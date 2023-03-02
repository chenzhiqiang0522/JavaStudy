package homework;

import java.io.File;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：FileTest2
 * Date：2023/3/1
 * Filename：FileTest2
 */

/**
 * mkdir() 不能创建多层目录
 * mkdirs() 可以创建多层目录
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file1 = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\1111");
        System.out.println(file1.mkdir()); // 不存在1111这一层目录
        System.out.println(file1.mkdirs()); // 可以创建多层目录
    }
}
