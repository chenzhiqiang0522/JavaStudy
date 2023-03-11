package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：LEVE
 * Date：2023/3/6
 * Filename：LEVE
 */
public enum LEVE {
    ONE(1),
    TWO(2),
    THREE(3),
    FORE(4),
    FIVE(5),
    SIX(6);
    private Integer leve;

    LEVE(Integer leve) {
        this.leve = leve;
    }

    @Override
    public String toString() {
        return "LEVE{" +
                "leve=" + leve +
                '}';
    }
}
