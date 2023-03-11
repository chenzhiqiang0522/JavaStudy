package addtional.trans_Record;

import java.util.*;

/**
 * Author：NickWiber(陈志强)
 * Package：addtional.trans_Record
 * Project：JAVA
 * name：TransRecordTest
 * Date：2023/3/7
 * Filename：TransRecordTest
 */
public class TransRecordTest {
    public static void main(String[] args) {
        ReadInfo readInfo = new ReadInfo();
        readInfo.readInfo();
        TreeMap tr = DataContext.treeMap;
        Collection values = tr.values();
        System.out.println("==================打印map====================");
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("======================查询=======================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查询的客户号：");
        String id = scanner.next();
        TransRecord.searchOrder(id.trim());
    }
}
