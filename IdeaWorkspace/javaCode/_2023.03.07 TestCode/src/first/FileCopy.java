package first;

import java.io.*;

/**
 * Author：NickWiber(陈志强)
 * Package：first
 * Project：JAVA
 * name：FileCopy
 * Date：2023/3/7
 * Filename：FileCopy
 */
public class FileCopy {
    private String path;

    public FileCopy() {
    }

    public FileCopy(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public void fileCopy(String dest){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(path));
            fileOutputStream = new FileOutputStream(new File(dest));
            byte[] bytes = new byte[1024];
            int result = -1;
            while ((result = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, result);
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
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("文件复制成功");
        }
    }
}
