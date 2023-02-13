package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：AfterClassPractice
 * Date：2023/2/13
 * Filename：AfterClassPractice
 */

/**
 *  定义一个Model类，里面有姓名、性别、年龄、胸围、腰围 字段，请使用标准封装+this进行测试
 */
public class Model {
    private String name;        // 名字
    private boolean gender;     // 性别
    private int age;            // 年龄
    private float waistline;    // 腰围

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWaistline() {
        return this.waistline;
    }

    public void setWaistline(float waistline) {
        this.waistline = waistline;
    }

    public Model(String name, boolean gender, int age, float waistline) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.waistline = waistline;
    }

    public Model(String name){
        this(name,true,25,35.1f);
    }
    public Model(){
    }
}
