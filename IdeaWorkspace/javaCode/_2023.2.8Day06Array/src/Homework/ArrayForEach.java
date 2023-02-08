package Homework;

/**
 * Author：陈志强
 * Package：Homework
 * Project：javaCode
 * name：ArrayForEach
 * Date：2023/2/8
 * Filename：ArrayForEach
 */
public class ArrayForEach {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8};
        /*
            foreach() 加强for循环
            for(源中元素类型  e  ： 源 ){
                程序代码;
                }
         */
        for (int temp:intArray)
            System.out.print(temp+"  ");
    }
}
