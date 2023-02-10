package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：UserTest
 * Date：2023/2/10
 * Filename：UserTest
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.userName);
        System.out.println(user.age);
        System.out.println("-------------分割线-----------");

        User user1 = new User("Nick",22);
        System.out.println(user1.userName);
        System.out.println(user1.age);
        System.out.println("-------------分割线-----------");

    }
}
