package homework;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：BufferedStreamCopy
 * Date：2023/3/2
 * Filename：BufferedStreamCopy
 */
public class BufferedStreamCopy {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\新建 文本文档.txt")));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\缓冲流复制.txt")));
            byte[] buffer = new byte[1024];
            int resNum = -1;
            while ((resNum = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer,0,resNum);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
