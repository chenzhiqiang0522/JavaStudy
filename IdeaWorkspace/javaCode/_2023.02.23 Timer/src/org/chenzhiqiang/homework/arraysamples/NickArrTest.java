package org.chenzhiqiang.homework.arraysamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.arraysamples
 * Project：JAVA
 * name：NickArrTest
 * Date：2023/2/23
 * Filename：NickArrTest
 */
public class NickArrTest {
    public static void main(String[] args) throws Exception {
        NickArray nickArray1 = new NickArray();
        nickArray1.increasement(16);        // 增加元素
        nickArray1.increasement(17);
        nickArray1.increasement(18);
        nickArray1.increasement(19);
        nickArray1.increasement(21);
        nickArray1.increasement(22);
        nickArray1.increasement(23);
        System.out.println(nickArray1.toString());
        System.out.println(nickArray1.curPos);
        System.out.println(nickArray1.search(17));      // 查找元素
        System.out.println(nickArray1.search(23));
        System.out.println(nickArray1.search(19));
        System.out.println(nickArray1.search(null));
        System.out.println(nickArray1.searchByIndex(5));    // 按照下标查找
        System.out.println(nickArray1.searchByIndex(3));
        nickArray1.modify(1,20);        // 修改元素
        nickArray1.modify(2,33);
        nickArray1.modify(3,34);
    }
}
