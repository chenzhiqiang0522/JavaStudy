package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：Pig
 * Date：2023/2/10
 * Filename：Pig
 */

/**
 * class 关键字
 * 通过class关键字定义一个类
 * 使用方法：
 *     [修饰符] class 方法名{
 *          类体
 *      }
 */
public class Pig {
    /*
        1、构造方法的名字和类名完全相同，包括大小写
        2、构造方法没有返回值类型
        3、构造方法不使用return语句
        4、其他的和普通方法类似 ，可以有修饰符（public、protected、private、默认）,
            可以有形参列表
        5、构造方法必须有方法体
        6、构造方法不能使用非访问修饰符（如static、final、synchronize、abstract等）
     */
    // 属性
    public double weight;
    public boolean gender;
    public String name;
    public int age;
    public Pig() {      // 无参构造器
        System.out.println("我是无参构造函数");
    }

    public Pig(String name){        // 有参构造器
        System.out.println("猪的名字为："+name);
    }
}
