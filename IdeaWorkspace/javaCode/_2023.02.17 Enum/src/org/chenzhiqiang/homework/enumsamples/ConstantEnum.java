package org.chenzhiqiang.homework.enumsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：ConstantEnum
 * Date：2023/2/18
 * Filename：ConstantEnum
 */

/**
 * 使用enum定义枚举类型
 *      语法：
 *          public enum 枚举名{
 * 	            字段；
 * 	            属性；
 * 	            方法；
 *          }
 *      字段与字段之间使用逗号分割，字段与属性之间使用分号分隔，
 *      枚举类中的构造方法时私有的
 *      枚举继承于lang包中的Enum类
 *      每一个字段可以看做是一个枚举类型的实例
 */
public enum ConstantEnum {
    SPRING("spring"),
    SUMMER("summner"),
    AUTUMN("autumn"),
    WINTER("winter");
    private String  month;

    private ConstantEnum() {
        this.month = "spring";
    }

    private ConstantEnum(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return month;
    }
}
