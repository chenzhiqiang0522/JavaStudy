/**
 *  课后练习题2
 *
 * */
package Homework;
public class AfterClassPractice2 {
    public static void main(String[] args) {
        int num=0;  //  个数
        for (int i=0;i<=20;i++){
            if (i%3==0){
                num++;
                System.out.println(i);
            }
        }
        System.out.println("20以内3的倍数的数字个数为:"+num);
    }
}
