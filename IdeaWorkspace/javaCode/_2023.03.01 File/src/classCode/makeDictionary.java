package classCode;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：makeDictionary
 * Date：2023/3/1
 * Filename：makeDictionary
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * mkdir()  创建夹
 *  
 */
public class makeDictionary {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\codeFile\\JAVA\\FileCreateFolder","test.java");
        file1.createNewFile();

        File folder1 = new File("D:\\codeFile\\JAVA\\FileCreateFolder","11111");
        folder1.mkdirs();

        File file2 = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\11111\\2222222");
        String[] fileList = file2.list();
        System.out.println(Arrays.toString(fileList));
        File[] filesList2 = file2.listFiles();
        System.out.println(file2.exists());


    }
}
