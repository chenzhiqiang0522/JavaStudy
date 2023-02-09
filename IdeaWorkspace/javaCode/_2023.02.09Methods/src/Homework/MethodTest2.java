package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：MethodTest2
 * Date：2023/2/9
 * Filename：MethodTest2
 */

/**
 * 调用有static的方法：
 *      类名.方法名([参数列表])
*  调用没有static的方法:
 *      先创建对象 类名 对象名 = new 类名()；
 *      对象名.方法名([参数])
 */
public class MethodTest2 {
    public static void main(String[] args) {
        MethodTest2 methodTest2 = new MethodTest2();
        methodTest2.print();
    }
    public void print() {
        System.out.println("玛卡巴卡");
    }
}
