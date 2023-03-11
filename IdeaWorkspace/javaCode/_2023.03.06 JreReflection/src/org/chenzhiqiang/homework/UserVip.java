package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：Vip
 * Date：2023/3/6
 * Filename：Vip
 */
public class UserVip {
    private String name;
//    @SelfAnnotation
    private String id;
    private String gender;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserVip() {
    }

    public UserVip(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }
}
