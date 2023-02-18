package org.chenzhiqiang.homework.enumsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：MonthEnum
 * Date：2023/2/18
 * Filename：MonthEnum
 */
public enum MonthEnum {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DES(12);
    private int month;

    private MonthEnum() {
    }

    private MonthEnum(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return Integer.toString(month);
    }
}
