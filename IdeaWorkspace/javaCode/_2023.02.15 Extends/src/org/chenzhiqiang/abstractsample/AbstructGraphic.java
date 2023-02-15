package org.chenzhiqiang.abstractsample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.abstractsample
 * Project：JAVA
 * name：AbstructGraphic
 * Date：2023/2/15
 * Filename：AbstructGraphic
 */

/**
 *  抽象方法： 在子类中必须强制重写抽象方法
 *
 *  语法：
 *      1、使用abstract修饰
 *      2、抽象类不能使用new创建实例，
 *      3、抽象方法只能存在在抽象类中，抽象方法没有方法体
 *      4、子类不想重写父类抽象方法，可以将子类也定义为抽象类
 */
public abstract class AbstructGraphic {
    public abstract void getArea(double r);
    public abstract void getCircumstance(double r);
}
