package org.chenzhiqiang.homework.polymorphyic;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.polymorphyic
 * Project：JAVA
 * name：SumsungTyper
 * Date：2023/2/16
 * Filename：SumsungTyper
 */
public class SumsungTyper implements Typer{
    @Override
    public void transmitData() {
        System.out.println("接口正在传输数据！！！！");
    }

    @Override
    public void output() {
        System.out.println("打印机正在打印目标内容!!!");
    }
    public void printBrand(){
        System.out.println("Sumsang");
    }
}
