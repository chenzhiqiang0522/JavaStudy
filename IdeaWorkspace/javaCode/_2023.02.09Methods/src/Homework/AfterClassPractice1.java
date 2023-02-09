package Homework;

/**
 * Author：NickWiber(陈志强)
 * Package：Homework
 * Project：javaCode
 * name：getMax
 * Date：2023/2/9
 * Filename：getMax
 */

/**
 * 定义一个方法getMax，接收两个int参数，返回较大的一个数。
 */
public class AfterClassPractice1 {
    public static void main(String[] args) {
        AfterClassPractice1 afterClassPractice1 = new AfterClassPractice1();
        System.out.println("两个数中较大的是:"+ afterClassPractice1.max(-111,-220));
        System.out.println("----------分隔符-------------");
        System.out.println("两个数中较大的是:"+maxStatic(99,11));
    }

    public int max(int num1,int num2){          // 没有static修饰符
        if (num1 > num2)                        // 判断大小
            return num1;
        else
            return num2;
    }

    public static int maxStatic(int num1, int num2) {       // // 没有static修饰符
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
