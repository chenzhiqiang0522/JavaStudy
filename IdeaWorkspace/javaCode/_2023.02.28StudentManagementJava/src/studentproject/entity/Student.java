package studentproject.entity;

import java.util.Objects;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.entity
 * Project：JAVA
 * name：Student
 * Date：2023/2/28
 * Filename：Student
 */
public class Student {
    private String stuId;
    private String name;
    private Boolean gender;
    private String sutTel;
    private String stuAddress;

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", sutTel='" + sutTel + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(stuId, student.stuId) && Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && Objects.equals(sutTel, student.sutTel) && Objects.equals(stuAddress, student.stuAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name, gender, sutTel, stuAddress);
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSutTel() {
        return sutTel;
    }

    public void setSutTel(String sutTel) {
        this.sutTel = sutTel;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public Student() {
    }

    public Student(String stuId, String name, Boolean gender, String sutTel, String stuAddress) {
        this.stuId = stuId;
        this.name = name;
        this.gender = gender;
        this.sutTel = sutTel;
        this.stuAddress = stuAddress;
    }
}
