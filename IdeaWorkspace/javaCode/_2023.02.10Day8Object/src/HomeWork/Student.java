package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：Student
 * Date：2023/2/10
 * Filename：Student
 */

/**
 * 学生类
 *
 * 构造方法
 * 1、构造方法的名字和类名完全相同，包括大小写
 *         2、构造方法没有返回值类型
 *         3、构造方法不使用return语句
 *         4、其他的和普通方法类似 ，可以有修饰符（public、protected、private、默认）,
 *             可以有形参列表
 *         5、构造方法必须有方法体
 *         6、构造方法不能使用非访问修饰符（如static、final、synchronize、abstract等）
 */
public class Student {
    String name;
    boolean gender;
    int age;
    int grade;
    String password;
    public Student(){       // 无参构造
        // 方法体
    }

    public Student(String name,int age){
        this.name = name;
        this.age = 18;
    }

    public void login(String name,String password){
        System.out.println("登录成功");
    }
}
