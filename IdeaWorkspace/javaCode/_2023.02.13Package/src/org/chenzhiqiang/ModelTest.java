package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：ModelTest
 * Date：2023/2/13
 * Filename：ModelTest
 */
public class ModelTest {
    public static void main(String[] args) {
        Model model = new Model("玛卡巴卡");
        System.out.println(model.getName());
        System.out.println(model.getAge());
        System.out.println(model.isGender());
        System.out.println(model.getWaistline());
        System.out.println("==========================");
        Model model1 = new Model();
        System.out.println(model1.getName());
        System.out.println(model1.getAge());
        System.out.println(model1.isGender());
        System.out.println(model1.getWaistline());
    }
}
