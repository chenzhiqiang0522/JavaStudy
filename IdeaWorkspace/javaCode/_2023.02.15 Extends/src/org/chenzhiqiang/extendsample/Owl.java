package org.chenzhiqiang.extendsample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.extendsample
 * Project：JAVA
 * name：Owl
 * Date：2023/2/15
 * Filename：Owl
 */
public class Owl extends BirdFatherClass{
    public Owl(String name){
        super(3,name,"brown",false);        // 使用super调用父类的构造函数，一定要放在代码作用域的第一行
    }
    @Override           //      使用父类相同的方法签名，实现对父类方法的重写，@override注解可以对代码进行校验
    public void fly() {     //  方法重写
        System.out.println("这只猫头鹰想上天！！！！");
    }

    @Override
    public void bark() {
        super.bark();               //  使用super调用父类中的方法
        System.out.println("咕呱咕呱咕呱咕呱！！！！！");
    }
}
