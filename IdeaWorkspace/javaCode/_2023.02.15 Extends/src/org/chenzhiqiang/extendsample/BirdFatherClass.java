package org.chenzhiqiang.extendsample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.extendsample
 * Project：JAVA
 * name：AnimalFatherClass
 * Date：2023/2/15
 * Filename：BirdFatherClass
 */

/**
 * 继承的特点
 *      1、java中只有单继承，一个类只能继承于一个父类，不能同时继承于多个类
 *      2、java中可以多重继承。
 */
public class BirdFatherClass {
    private int age;    // 年龄
    public String name;
    String color;
    protected boolean sex;

    public void fly(){
        System.out.println("冲出地球");
    }

    public void bark(){
        System.out.println("你看我咬不咬你就完了");
    }

    public BirdFatherClass() {
    }

    public BirdFatherClass(int age, String name, String color, boolean sex) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
