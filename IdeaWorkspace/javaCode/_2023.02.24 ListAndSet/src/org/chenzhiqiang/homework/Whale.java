package org.chenzhiqiang.homework;

import java.util.Objects;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：Whale
 * Date：2023/2/25
 * Filename：Whale
 */
public class Whale implements Comparable {
    private String category;
    private Integer age;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Whale() {
    }

    public Whale(String category, Integer age) {
        this.category = category;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "category='" + category + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Whale whale = (Whale) o;
        return category.equals(whale.category) && age.equals(whale.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, age);
    }

    @Override
    public int compareTo(Object o) {
        Whale whale = (Whale)o;
        if (this.age>whale.age){
            return 1;
        }
        else if (this.age<whale.age){
            return -1;
        }else {
            if (this.category.length()>whale.category.length()){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
