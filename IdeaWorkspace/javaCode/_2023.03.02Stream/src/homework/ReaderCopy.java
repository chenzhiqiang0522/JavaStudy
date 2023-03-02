package homework;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：ReaderCopy
 * Date：2023/3/2
 * Filename：ReaderCopy
 */
public class ReaderCopy {
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\新建 文本文档.txt"));
            FileWriter fw = new FileWriter(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\字符流copy.txt"),Charset.forName("UTF-8"))
        ) {
            char[] ch =new char[1024];
            int resNum=-1;
            while ((resNum = fr.read(ch))!=-1){
                fw.write(ch, 0, resNum);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
