package org.chenzhiqiang.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：ConstructorReflection
 * Date：2023/3/6
 * Filename：ConstructorReflection
 */
public class ConstructorReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("org.chenzhiqiang.homework.User1");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor e: constructors)
            System.out.println(e);
        System.out.println("========================================================");
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class, String.class);
        Object o = constructor.newInstance("nick",22,"man");
        System.out.println(o);
        System.out.println("========================================================");
        Constructor<?> constructor1 = aClass.getDeclaredConstructor(String.class);
        System.out.println(constructor1);
        constructor1.setAccessible(true);
        Object nick = constructor1.newInstance("Nick1");
        System.out.println(nick);
        System.out.println("========================================================");
        Constructor<?> constructor2 = aClass.getConstructor();
        Object o1 = constructor2.newInstance();
        System.out.println(o1);
    }
}
