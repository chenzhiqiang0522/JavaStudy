package org.chenzhiqiang;

import java.security.DigestException;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：Cat
 * Date：2023/2/13
 * Filename：Cat
 */
public class Cat {
    private String name;    // 名字
    private int age;        // 年龄
    private boolean gender; // 性别
    private String species; // 种类

    // get和set方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }
    public boolean getGender(){
        return this.gender;
    }

    public void setSpecies(String species){
        this.species = species;
    }
    public String getSpecies(){
        return this.species;
    }

    // 有参构造函数
    public Cat(String name,int age,boolean gender,String species){
        setName(name);
        setAge(age);
        setGender(gender);
        setSpecies(species);
    }

    // 无参构造器
    public Cat(){
        setName("不详");
        setAge(0);
        setGender(true);
        setSpecies("不详");
    }
}
