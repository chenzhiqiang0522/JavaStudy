/**
 * 水仙花数
 * */
package ClassPractice;

public class ShuiXianHuaShu {
    public static void main(String[] args) {
        int i=100;
        while (i>=100 && i<1000){
            int sum = 0;
            sum+=((i/100)*(i/100)*(i/100));
            sum+=((i%100/10)*(i%100/10)*(i%100/10));
            sum+=((i%10)*(i%10)*(i%10));
            if (sum==i)
                System.out.print(i+"  ");
            i++;
            sum=0;
        }
    }
}
