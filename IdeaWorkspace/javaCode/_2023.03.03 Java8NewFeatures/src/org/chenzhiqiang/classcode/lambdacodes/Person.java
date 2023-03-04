package org.chenzhiqiang.classcode.lambdacodes;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode.lambdacodes
 * Project：JAVA
 * name：Person
 * Date：2023/3/3
 * Filename：Person
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
    public static void say(String s){
        System.out.println("请问你在狗叫什么!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
