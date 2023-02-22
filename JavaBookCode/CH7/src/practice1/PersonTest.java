package practice1;

/**
 * Author：NickWiber(陈志强)
 * Package：practice13
 * Project：JAVA
 * name：PersonTest
 * Date：2023/2/18
 * Filename：PersonTest
 */
public class PersonTest {
    public static void out(Person person){
        if (person instanceof Teacher) {
            Teacher techer = (Teacher) person;
            techer.outTeacher();
        }else if (person instanceof Student) {
            Student student = (Student) person;
            student.outStudent();
        }
    }
    public static void main(String[] args) {
        out(new Teacher());
    }
}
