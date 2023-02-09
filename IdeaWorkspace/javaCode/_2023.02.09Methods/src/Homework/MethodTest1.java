package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：MethodTest1
 * Date：2023/2/9
 * Filename：MethodTest1
 */
public class MethodTest1 {
    public static void main(String[] args) {
        sum(11, 11);
    }
    /*
    * 有static修饰则通过  类名.方法名([参数])调用
    */
    public static void sum(int a,int b) {       // 求两个数的和
        System.out.println(a+"+"+b+"的和为"+(a+b));
    }
    /*
    *
    * public：修饰符，表示公共的
    * static：静态的，可以审阅
    * void：返回值类型
    */
}
