package classCode;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：classCode
 * Project：JAVA
 * name：FileInputStreamReader
 * Date：2023/3/2
 * Filename：FileInputStreamReader
 */
public class FileInputStreamReaderTest {
    public static void main(String[] args) {
        transformStream();
    }

    public static void transformStream(){
        InputStreamReader input = null;
        OutputStreamWriter out = null;
        try {
            input = new InputStreamReader(new FileInputStream(new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\新建 文本文档.txt")));
            out = new OutputStreamWriter(new FileOutputStream(new File("FileCreateFolder/2222/转换流copy.txt")));
            int res = -1;
            char[] ch = new char[1024];
            while ((res= input.read(ch))!=-1){
                System.out.println(new String(ch));
                out.write(ch, 0, res);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
