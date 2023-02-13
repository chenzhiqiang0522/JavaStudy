package org.chenzhiqiang;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：StudentTest
 * Date：2023/2/13
 * Filename：StudentTest
 */
public class StudentTest {
    public static void main(String[] args) {
        Student studentTest = new Student();
        Student studentTest1 = new Student("NickWiber",20,"321456");
        System.out.println(studentTest.getName());
        System.out.println(studentTest.getAge());
        System.out.println("===============================");
        System.out.println(studentTest1.getName());
        System.out.println(studentTest1.getAge());
    }
}
