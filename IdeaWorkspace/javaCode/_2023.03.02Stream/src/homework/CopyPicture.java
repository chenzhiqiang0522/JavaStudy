package homework;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：CopyPicture
 * Date：2023/3/2
 * Filename：CopyPicture
 */
public class CopyPicture {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\OMEN Aero.png"));
            fileOutputStream = new FileOutputStream(new File("D:\\codeFile\\JAVA\\FileCreateFolder\\2222\\1111\\OMEN_copy.png"));
            byte[] b = new byte[1024];
            int resNum = -1;
            while ((resNum = fileInputStream.read(b)) != -1){
                fileOutputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
