package org.chenzhiqiang.homework.polymorphyic;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.polymorphyic
 * Project：JAVA
 * name：MotherBoard
 * Date：2023/2/16
 * Filename：MotherBoard
 */
public class MotherBoard {
    // 装载插件
    public void plugin(Typer typer){        // 向上转型，使用父类对象接收子类对象
        typer.transmitData();
        typer.output();

        /*
            向下转型，为了调用子类中特有的方法
         */
        // 解决ClassCastException方法一
//        if (typer instanceof HPTyper){
//            HPTyper hpTyper = (HPTyper) typer;
//            hpTyper.printBrand();
//        }else if (typer instanceof SumsungTyper){
//            SumsungTyper sumsungTyper = (SumsungTyper) typer;
//            sumsungTyper.printBrand();
//        }else{
//            System.out.println("传入的参数不正确!!!!!");
//        }

        // 解决ClassCastException方法二
        if (typer.getClass()==HPTyper.class){
            HPTyper hpTyper = (HPTyper) typer;
            hpTyper.printBrand();
        }else if (typer.getClass() ==SumsungTyper.class){
            SumsungTyper sumsungTyper = (SumsungTyper) typer;
            sumsungTyper.printBrand();
        }
    }
}
