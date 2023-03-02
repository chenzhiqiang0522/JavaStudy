package homework;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：FileTest
 * Date：2023/3/1
 * Filename：FileTest
 */

/**
 * File类
 *      构造方法：
 *          new File(String pathname)
 *          new File(String parentsPath,String child)
 *          new File(File parent,String child)
 *          new File(URL url)
 *      基本方法：
 *          delete()    删除由此抽象路径名表示的文件或目录。
 *          deleteOnExit()  在虚拟机终止时删除由此抽象路径名表示的文件或目录。
 *          exists()    测试此抽象路径名表示的文件或目录是否存在。
 *          getName()   获取文件或者目录的名称。
 *          getParent() 返回路径的父目录
 *          getParentFile() 同上
 *          isDirectory()   是否是文件夹
 *          isFile()    是否是文件
 *          isHidden()  是否是隐藏文件
 *          mkdir()     创建文件夹，只能创建一个文件夹
 *          mkdirs()    创建多层目录
 *          listRoots() 获取可用的盘符
 *          list()      获取目录下全部的文件和文件夹
 *          list(FilenameFilter filter) 返回目录下符合过滤器中要求的文件名称数组
 *          listFiles(FilenameFilter filter)    返回目录下符合过滤器中要求的文件名称File数组
 *          listFiles(FileFilter filter)    返回目录下符合过滤器中要求的文件名称File数组
 */
public class FileTest {
    public static void main(String[] args) {
        File file1 = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\11111\\2222222");
        String[] list1 = file1.list();      // 返回一个包含对应目录下中的文件名和子目录
        for (String e:list1) {
            System.out.println(e);
        }

        String[] list2 = file1.list(new FilenameFilter() {  // FilenameFilter过滤器返回String数组
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xlsx");
            }
        });
        System.out.println(Arrays.toString(list2));
        System.out.println(list2.length);
        System.out.println("====================================================");
        File[] files1 = file1.listFiles(new FilenameFilter() {      // 返回File类型的数组
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("新建");
            }
        });
        System.out.println(Arrays.toString(files1));
        System.out.println(files1.length);
        System.out.println("====================================================");
        File[] files2 = file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        });
        System.out.println(Arrays.toString(files2));
        System.out.println(files2.length);
        System.out.println("====================================================");
        System.out.println(Arrays.toString(File.listRoots()));
    }
}
