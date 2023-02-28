package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：GenericClass
 * Date：2023/2/27
 * Filename：GenericClass
 */
public class GenericClass<T1,T2> {
    T2 var1;
    T1 var2;

    public GenericClass(T2 var1, T1 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}
