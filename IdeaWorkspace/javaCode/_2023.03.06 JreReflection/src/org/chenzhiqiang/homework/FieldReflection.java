package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：FieldReflection
 * Date：2023/3/6
 * Filename：FieldReflection
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射获取属性相关操作
 */
public class FieldReflection {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("org.chenzhiqiang.homework.User");
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class, String.class);
        Object o = constructor.newInstance("Nick", 18, "MAN");
        Field[] fields = aClass.getFields();        // 获取公有字段
        for (Field field: fields)
            System.out.println(field);
        System.out.println("=============================================================================");
        Field[] declaredFields = aClass.getDeclaredFields();    // 获取全部属性
        for (Field declaredField: declaredFields)
            System.out.println(declaredField);
        System.out.println("=============================================================================");
        Field name = aClass.getField("name");       // 获取指定属性
        name.setAccessible(true);
        name.set(o,"NickWiber");            // 设置指定对象的指定属性
        System.out.println(o);
    }
}
