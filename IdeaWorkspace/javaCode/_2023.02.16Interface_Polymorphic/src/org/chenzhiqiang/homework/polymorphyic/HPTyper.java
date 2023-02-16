package org.chenzhiqiang.homework.polymorphyic;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.polymorphyic
 * Project：JAVA
 * name：HPTyper
 * Date：2023/2/16
 * Filename：HPTyper
 */
public class HPTyper implements Typer{
    @Override
    public void transmitData() {
        System.out.println("接口正在传输数据！！！！");
    }

    @Override
    public void output() {
        System.out.println("惠普打印机正在进行打印作业!!!!!");
    }
    public void printBrand(){
        System.out.println("惠普");
    }
}
