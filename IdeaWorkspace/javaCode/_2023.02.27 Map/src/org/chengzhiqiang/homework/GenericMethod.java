package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：GenericMethod
 * Date：2023/2/27
 * Filename：GenericMethod
 */
public class GenericMethod<T1,T2> {
    T1 var1;
    T2 var2;

    public void add(T1 var1, T2 var2) {
        if (var1 instanceof Integer&& var2.getClass()==Integer.class)
            System.out.println(((Integer) var1)+((Integer)var2));
        else
            System.out.println(((String)var1).concat(((String)var2)));
    }

    public GenericMethod(T1 var1, T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public GenericMethod() {
    }

    public T1 getVar1() {
        return var1;
    }

    public void setVar1(T1 var1) {
        this.var1 = var1;
    }

    public T2 getVar2() {
        return var2;
    }

    public void setVar2(T2 var2) {
        this.var2 = var2;
    }
}
