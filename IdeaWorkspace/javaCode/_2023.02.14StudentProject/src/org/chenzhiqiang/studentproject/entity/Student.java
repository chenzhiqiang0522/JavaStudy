package org.chenzhiqiang.studentproject.entity;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.studentproject
 * Project：JAVA
 * name：student
 * Date：2023/2/14
 * Filename：Student
 */
public class Student {
    private String stuAccount;
    private String stuName;
    private boolean stuGender;
    private String stuTel;
    private String stuAddress;
    private static int stuNum = 0;

    public Student() {
    }

    public Student(String stuAccount, String stuName, boolean stuGender, String stuTel, String stuAddress) {
        this.stuAccount = stuAccount;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuTel = stuTel;
        this.stuAddress = stuAddress;
    }

    public String getStuAccount() {
        return stuAccount;
    }

    public void setStuAccount(String stuAccount) {
        this.stuAccount = stuAccount;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public boolean isStuGender() {
        return stuGender;
    }

    public void setStuGender(boolean stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}
