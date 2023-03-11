package org.chenzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：Dog
 * Date：2023/3/6
 * Filename：Dog
 */

/**
 * 内置注解
 * @Override    重写
 * @Deprecated  过时的
 * @SuppressWarning    抑制编译器警告
 * @@SafeVarargs    抑制堆污染警告（单独警告）
 */
public class Dog {
    private String name;
    private String area;
    private Integer age;
    private String sex;

    @Deprecated
    public void out(){
        System.out.println("动物在叫！");
    }
    @Override       // 表示该方法已经过时了，以后的版本可以能会删除掉该方法
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog() {
    }

    public Dog(String name, String area, Integer age, String sex) {
        this.name = name;
        this.area = area;
        this.age = age;
        this.sex = sex;
    }
}
