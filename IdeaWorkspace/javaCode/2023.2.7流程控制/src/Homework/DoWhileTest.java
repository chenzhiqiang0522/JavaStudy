/**
 * do...while();循环
 * */


/*
    do{
        执行语句；
    }while(循环条件);
    do while 和 while的区别:
        do会无条件先执行一次 然后在判断条件
*/
package Homework;
public class DoWhileTest {
    public static void main(String[] args){
        int i=2;
        do {
            i++;
            System.out.println(i);
        }while (i < 0);
    }
}
