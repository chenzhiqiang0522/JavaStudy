
/**
*   for循环
 * */
package Homework;

public class ForTest {
    public static void main(String[] args) {
        /*
             基本语法：
            for(初始条件A;判断条件B;变量更新){
                循环语句D;
            }
        */
        for (int i = 1; i < 11; i++) {
            System.out.println(i);  // 用for打印1-10之间的数
        }
        System.out.println("----------分割线-----------");

        for (int b = 20;b<60;b++){      //打印20-60之间的偶数
            if (b%2==0)
                System.out.print(b+"  ");
        }
    }
}
