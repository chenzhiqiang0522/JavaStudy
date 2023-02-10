package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：StudentTest
 * Date：2023/2/10
 * Filename：StudentTest
 */

/**
 * Student 的测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
        System.out.println(student.grade);
        System.out.println(student.password);
        System.out.println("------------分割线------------");
        Student s1 = new Student("NickWiber",20);
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s1.password);
        System.out.println("------------分割线------------");

    }
}
