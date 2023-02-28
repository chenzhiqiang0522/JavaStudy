package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：Shark
 * Date：2023/2/24
 * Filename：Shark
 */
public class Shark {
    private String category;
    private Integer age;

    @Override
    public String toString() {
        return "Shark{" +
                "category='" + category + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Shark() {
    }

    public Shark(String category, Integer age) {
        this.category = category;
        this.age = age;
    }
}
