package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：Student
 * Date：2023/2/13
 * Filename：Student
 */
public class Student {
    private String name;
    private int age;
    private String password;
    public void setName(String name){
        this.name = name;       // this表示当前对象
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student(String name,int age,String password){
        setName(name);
        setAge(age);
        setPassword(password);
    }
    // 使用this调用其他构造函数，可以通过参数设置默认值
    public Student(){
        this("小明",18,"987654321");
    }
}
