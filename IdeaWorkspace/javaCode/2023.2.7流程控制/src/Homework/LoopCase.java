/**
 * 1-10的阶乘
 * */
package Homework;

public class LoopCase {
    public static void main(String[] args) {
        //使用while实现
        int result= 1;
        int a = 1;
        while (a<11){
            result *= a;
            a++;
        }
        System.out.println(result);
        System.out.println("----------分割线-----------");

        // 使用for实现
        int result1 = 1;
        for (int b = 1;b<11;b++){
            result1 *= b;
        }
        System.out.println(result1);
    }

}



/*
* while do...while 和for的使用场景
*   while:不知道循环的次数
*   do...while():先执行一次再判断的情况
*   for:知道起始值和循环次数的情况下
* */
