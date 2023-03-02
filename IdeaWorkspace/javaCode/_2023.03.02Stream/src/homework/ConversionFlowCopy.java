package homework;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：ConversionFlowCopy
 * Date：2023/3/2
 * Filename：ConversionFlowCopy
 */
public class ConversionFlowCopy {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader =null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\新建 文本文档.txt")));
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.02Stream\\src\\fileFolder\\2222\\ConversionFlowCopy.txt")));
            char[] ch = new char[1024];
            int resNum = 0;
            while ((resNum=inputStreamReader.read(ch))!=-1){
                outputStreamWriter.write(ch, 0, resNum);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
