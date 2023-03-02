package classCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：ByteCopyFile
 * Date：2023/3/2
 * Filename：ByteCopyFile
 */
public class ByteCopyFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int result = -1;
        try {
            fis = new FileInputStream("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\新建 文本文档.txt");
            fos = new FileOutputStream("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\新建 文本文档_copy.txt");
            byte[] s = new byte[1024];
            while ((result = fis.read(s))!=-1){
                fos.write(s, 0, result);
            }
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
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
