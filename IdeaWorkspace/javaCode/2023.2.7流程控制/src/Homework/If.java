/**
 * if 选择结构
 */
package Homework;

public class If {
    public static void main(String[] args) {
        /*
         * if(判断条件){
         *    执行语句;
         * }
         * if如果判断条件是true就进去到后面的执行语句,如果false就不会进入后面的执行语句
         */
        // java 考试分数 > 90 分打印非常棒
        int score = 91;
        if (score > 90) {
            System.out.println("非常棒");
        }

        System.out.println("----------分割线-----------");

        /*
         基本语法：
            if(判断条件){
                执行语句;
            }else{
                执行语句;
            }
        * */
        int score1 = 100;
        if (score1 > 90){
            System.out.println("真的很棒");
        }
        if (score1 <= 90){
            System.out.println("继续努力哟~");
        }
        System.out.println("----------分割线-----------");
        /*
        * 基本语法：
            if(判断条件1){
                执行语句;
            }else if(判断条件2){
                 执行语句;
            }else if(判断条件3){
                执行语句;
            }
        */

        int score2 = 78;
        if (score2 >= 90 && score2<=100)
            System.out.println("excellent");
        else if (score2 < 90 && score2 >=80)
            System.out.println("good");
        else if (score2 >= 70 && score2 <80)
            System.out.println("middle");
        else if (score2>=60 && score2 <= 70)
            System.out.println("pass");
        else if (score2 < 60)
            System.out.println("fail");
        System.out.println("----------分割线-----------");
        /*
            if(判断条件1){
                语句1;
            }else if(判断条件2){
                语句2;
            }else if(判断条件3){
                语句3;
            }
            ....
            else if(判断条件n){
                语句n;
            }else{
                不满足所有条件的时候执行；
            }
       */
        int score3 = -99;
        if (score3 >= 90 && score3<=100)
            System.out.println("excellent");
        else if (score3 < 90 && score3 >=80)
            System.out.println("good");
        else if (score3 >= 70 && score3 <80)
            System.out.println("middle");
        else if (score3>=60 && score3 <= 70)
            System.out.println("pass");
        else if (score3>0 && score3 < 60)
            System.out.println("fail");
        else
            System.out.println("Input is error");
    }
}
