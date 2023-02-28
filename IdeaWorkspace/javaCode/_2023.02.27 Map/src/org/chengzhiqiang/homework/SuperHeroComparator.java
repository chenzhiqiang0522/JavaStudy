package org.chengzhiqiang.homework;

import java.util.Comparator;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：SuperHeroComparator
 * Date：2023/2/27
 * Filename：SuperHeroComparator
 */
public class SuperHeroComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        SuperHero sh1 = (SuperHero) o1;
        SuperHero sh2 = (SuperHero) o2;
        return sh1.getName().compareTo(sh2.getName());
    }
}
