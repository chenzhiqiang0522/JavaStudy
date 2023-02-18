package org.chenzhiqiang.homework.enumsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：ConstantEnum
 * Date：2023/2/18
 * Filename：ConstantEnum
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
