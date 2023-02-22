package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：ExceptionTest
 * Date：2023/2/21
 * Filename：ExceptionTest
 */

/**
* 异常的处理方法一： 使用 try{
*       可能会报错的代码
*   }catch(抓到的异常类型 变量名){
*       处理方案
*   }catch(抓到的异常类型 变量名){
*       处理方案
*   }finally{
 *       最后执行的代码;
 *   }
 *
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("出现了ArithmeticException错误");
            e.printStackTrace();
        }finally {
            System.out.println("这是最后执行的代码!!!");
        }
    }
}
