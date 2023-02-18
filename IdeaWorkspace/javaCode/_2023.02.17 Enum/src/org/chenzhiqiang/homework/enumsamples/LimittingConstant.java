package org.chenzhiqiang.homework.enumsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：LimittingConstant
 * Date：2023/2/18
 * Filename：LimittingConstant
 */

/**
 * 枚举类的使用
 * 该类用传统方法定义指定变量的取值范围
 */
public class LimittingConstant {
    public static final LimittingConstant SPRING =new LimittingConstant("spring");      // 春天
    public static final LimittingConstant SUMMER = new LimittingConstant("summer");     // 夏天
    public static final LimittingConstant AUTUMN = new LimittingConstant("autumn");     // 秋天
    public static final LimittingConstant WINTER = new LimittingConstant("winter");     // 冬天

    private String season;

    private LimittingConstant() {
        this.season="spring";
    }

    private LimittingConstant(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return season;
    }
}


