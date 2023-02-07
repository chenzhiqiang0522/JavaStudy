/**
 * 该类是while的相关例子
 * */
package Homework;

public class WhileTest {
    public static void main(String[] args) {
        int a=1;
        while (a < 6) {
            System.out.println("我爱Java");
            a++;        //打印5遍我爱java
        }
        System.out.println("----------分割线-----------");
        int a1=0;
        while (a1 < 10) {       // 打印1-10
            System.out.println(a1+1);
            a1++;
        }
        System.out.println("----------分割线-----------");
        int a3 = 1;
        while (a3 < 11) {       // 打印1-10之间的偶数
            if(a3%2==0){
                System.out.println(a3);
            }
            a3++;
        }
        System.out.println("----------分割线-----------");
        int a4=100;
        while (a4>=100 && a4<1000){         // 打印水仙花数
            int sum = 0;
            sum+=((a4/100)*(a4/100)*(a4/100));
            sum+=((a4%100/10)*(a4%100/10)*(a4%100/10));
            sum+=((a4%10)*(a4%10)*(a4%10));
            if (sum==a4)
                System.out.print(a4+"  ");
            a4++;
            sum=0;
        }
    }
}
