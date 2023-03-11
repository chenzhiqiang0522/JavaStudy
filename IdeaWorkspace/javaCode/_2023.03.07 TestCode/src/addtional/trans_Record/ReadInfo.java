package addtional.trans_Record;

import java.io.*;
import java.util.TreeMap;

/**
 * Author：NickWiber(陈志强)
 * Package：addtional.trans_Record
 * Project：JAVA
 * name：ReadInfo
 * Date：2023/3/7
 * Filename：ReadInfo
 */

/**
 * 读取信息并封装为TransRecord对象
 */
public class ReadInfo {
    public TreeMap readInfo(){
        BufferedReader bufferedReader = null;
        TransRecord tr = null;
        //TreeMap<String, TransRecord> treeMap = new TreeMap<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("E:\\TransRecord.txt"));     // 读取
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s);
                TransRecord transRecord = new TransRecord();
                tr = transRecord.enclose(s);        // 封装
                System.out.println(tr);
                DataContext.treeMap.put(tr.getId(),tr);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return DataContext.treeMap;
    }
}
