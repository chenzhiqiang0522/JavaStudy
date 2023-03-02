package classCode;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：FileInputStreamTest
 * Date：2023/3/2
 * Filename：FileInputStreamTest
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * InputStream
 *      | FileInputStream
 *
 */
public class FileInputStreamTest {
    public static void main(String[] args){
        File file = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\新建 文本文档.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int s = -1;
            byte[] b = new byte[1024];
//            while ((s=fis.read())!= -1){
//                System.out.print(((char)s));
//            }
//            while ((s=fis.read(b)) != -1){
//                System.out.print(new String(b));
//            }
            while ((s= fis.readNBytes(b, 2, 100))!= 0){
                System.out.println(new String(b, 2, 100));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
