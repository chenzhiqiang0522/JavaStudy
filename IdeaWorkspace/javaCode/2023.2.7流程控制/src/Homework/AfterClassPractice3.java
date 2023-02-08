/**
 *  课后练习题3
 *
 * */
package Homework;
public class AfterClassPractice3 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=10;i<=30;i++){
            if (i%2!=0)         // 不是偶数则相加
                sum+=i;
        }
        System.out.println("10到30之间所有奇数的和:"+sum);
    }
}
