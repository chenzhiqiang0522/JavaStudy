/**
 * 循环控制:break,continue和return
 */
package Homework;

public class LoopControl {
    public static void main(String[] args) {
        // 循环1-10的数,当i = 6 的时候就不循环
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i==6)
                break;
        }
        System.out.println("----------分割线-----------");

        // 循环1-10的数,当 i = 6 的时候 就不输出
        for (int j = 1;j<=10;j++){
            if (j==6)
                continue;   // 结束本次循环,开始下次循环
            System.out.println(j);
        }
        System.out.println("----------分割线-----------");

        // 循环1-10的数 当 i = 6 的时候 结束方法
        for (int k = 1; k <= 10; k++) {
            if (k==6)
                return;
            System.out.println(k);
        }
        System.out.println("玛卡巴卡,唔西迪西,依古比古,汤姆布利柏");



    }
}
