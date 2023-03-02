package homework;

import java.io.File;

/**
 * Author：NickWiber(陈志强)
 * Package：homework
 * Project：JAVA
 * name：delFile
 * Date：2023/3/1
 * Filename：delFile
 */
public class delFile {
    public static void main(String[] args) {
        File file = new File("D:\\codeFile\\JAVA\\FileCreateFolder\\11111\\2222222");
        System.out.println(deleteFile(file));
    }
    public static boolean deleteFile(File file){
        if (file.isDirectory()){
            for (File e: file.listFiles()){
                deleteFile(e);  //  递归删除
            }
//            return(file.delete());
        }
        return file.delete();
    }
}
