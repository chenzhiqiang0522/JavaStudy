package classCode;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：FileOutputStreamTest
 * Date：2023/3/2
 * Filename：FileOutputStreamTest
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        File file = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\test1.txt");
        // 创建输出流
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file,true);
            System.out.println(fos);
//            fos.write(65);
            fos.write("玛卡巴卡".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
