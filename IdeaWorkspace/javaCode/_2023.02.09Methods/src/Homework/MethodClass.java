package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：MethodClass
 * Date：2023/2/9
 * Filename：MethodClass
 */

/**
 * 方法的调用
 */
public class MethodClass {
    public static void main(String[] args) {
        MethodTest1.sum(99, 1);
    }

    /*
    *   注意事项:
            同一个类中：静态方法不能调用非静态的方法
            同一个类中：非静态方法可以调用静态方法
    * */
}
