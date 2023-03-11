package org.chenzhiqiang.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：MethodReflection
 * Date：2023/3/6
 * Filename：MethodReflection
 */
public class MethodReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("org.chenzhiqiang.homework.User");
        Method[] methods = aClass.getMethods(); // 获取全部示例方法
        System.out.println(methods);
        for (Method m: methods)
            System.out.println(m);
        System.out.println("======================================================================");
        Method[] declaredMethods = aClass.getDeclaredMethods();     // 获取全部的非继承的方法
        for (Method m: declaredMethods)
            System.out.println(m);
        System.out.println("======================================================================");
        Method method = aClass.getMethod("eat", String.class);      // 获取指定方法名和参数类型的方法
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class, String.class);
        Object o = constructor.newInstance("nick", 22, "man");      // 创建一个实例
        method.invoke(o,"空气");          // 调用实例方法
        System.out.println("======================================================================");
        // Constructor<?> constructor1 = aClass.getConstructor(String.class, Integer.class, String.class);
        Object o1 = constructor.newInstance("Lucy", 20, "woman");
        Method eat1 = aClass.getMethod("eat",String.class);
        eat1.invoke(o1,"pizza");
        System.out.println("======================================================================");
        Object o2 = constructor.newInstance("Wiber", 19, "MAN");
        Method eat11 = aClass.getDeclaredMethod("eat1", String.class);
        eat11.setAccessible(true);
        Object method1 = eat11.invoke(o2, "榴莲");

    }
}
