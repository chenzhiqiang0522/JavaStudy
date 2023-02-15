package org.chenzhiqiang.objectclass;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.objectclass
 * Project：JAVA
 * name：Person
 * Date：2023/2/15
 * Filename：Person
 */
public class Person {
    private String name;
    private int age;
    private boolean gender;
    private String id;

    @Override
    public String toString() {      // 重写toString方法
        return "Person["+name+","+
                age+","+gender+","+
                id+"]";
    }

    @Override
    public boolean equals(Object o) {       // 重写equals方法
        Person p = (Person) o;
        return p.id == id &&
                p.age == age &&
                p.gender == gender &&
                p.id == id;
    }

    public Person() {
    }

    public Person(String name, int age, boolean gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
