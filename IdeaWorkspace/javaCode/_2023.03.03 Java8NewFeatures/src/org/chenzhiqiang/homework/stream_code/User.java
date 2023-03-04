package org.chenzhiqiang.homework.stream_code;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.stream_code
 * Project：JAVA
 * name：User
 * Date：2023/3/4
 * Filename：User
 */
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, Integer age) {
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
