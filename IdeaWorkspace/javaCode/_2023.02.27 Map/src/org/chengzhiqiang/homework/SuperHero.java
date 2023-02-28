package org.chengzhiqiang.homework;

import java.util.Comparator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SuperHero
 * Date：2023/2/27
 * Filename：SuperHero
 */

/**
 * SuperHero && 重写方法
 */
public class SuperHero{
    private String name;
    private String ability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public SuperHero() {
    }

    public SuperHero(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }



    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }
}
