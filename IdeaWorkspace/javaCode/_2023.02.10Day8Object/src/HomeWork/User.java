package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：User
 * Date：2023/2/10
 * Filename：User
 */
public class User {
    // 对象属性
    public String userName;     // 用户名
    public int age;             // 用户年龄

    public User(String userName, int age) {     // 有参构造
        this.userName = userName;
        this.age = age;
    }

    public User(){      // 无参构造
        this.userName= "user";
        this.age = 10;
    }

    public void eat(String food) {
        System.out.println("用户正在吃" + food);
    }

}
