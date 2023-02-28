package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：User
 * Date：2023/2/27
 * Filename：User
 */
public class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if(this.age>o.age)
            return 1;
        else if (this.age < o.age) {
            return - 1;
        }else {
            if (this.name.hashCode()>o.name.hashCode())
                return 1;
            else if (this.name.hashCode()>o.name.hashCode()){
                return - 1;
            }
        }
        return 0;
    }
}
