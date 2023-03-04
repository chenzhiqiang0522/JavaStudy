package org.chenzhiqiang.homework.optional;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.optional
 * Project：JAVA
 * name：User
 * Date：2023/3/4
 * Filename：User
 */
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
