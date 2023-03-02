package homework;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：StreamCopy
 * Date：2023/3/2
 * Filename：StreamCopy
 */
public class StreamCopy {
    public static void main(String[] args) {
        try(
            FileInputStream fileInputStream = new FileInputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\新建 文本文档.txt"));
            FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\StreamCopytxt"))
        ) {
            byte[] b = new byte[1024];
            int resNum = -1;
            while ((resNum=fileInputStream.read(b))!=-1){
                fileOutputStream.write(b, 0, resNum);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
