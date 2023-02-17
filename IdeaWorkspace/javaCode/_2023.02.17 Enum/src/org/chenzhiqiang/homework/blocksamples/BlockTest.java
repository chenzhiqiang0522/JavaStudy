package org.chenzhiqiang.homework.blocksamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.blocksamples
 * Project：JAVA
 * name：BlockTest
 * Date：2023/2/17
 * Filename：BlockTest
 */

/**
 * 代码块有三种：
 *      1、局部代码块：
 *          没有作用
 *      2、静态代码块：
 *          语法：
 *              static{
 *
 *              }
 *          作用：
 *              数据初始化（只要加载static代码块所在的类，那么该类static代码块会优先加载，
 *              main方法的static代码块优先于main方法）
 *      3、构造代码块：
 *              在调用构造方法的时候，会在将代码块中的代码添加在构造方法的第一行。
 */
public class BlockTest {
    public static int a;
    public static int b;
    static{
        a = 1111;
        b = 1000;
        System.out.println("正在执行static代码块中的代码");
    }
    {
        System.out.println("这是构造代码块中的代码");
    }
    public void sum(){
        System.out.println(a+b);
        System.out.println("正在执行sum方法中的代码");
    }

    public BlockTest() {
    }

}

class BlockMain{
    static {
        System.out.println("正在执行main函数中static代码块的代码");
    }
    public static void main(String[] args) {
        BlockTest bt = new BlockTest();
        bt.sum();
        System.out.println("正在执行main方法中的代码");
    }
}
