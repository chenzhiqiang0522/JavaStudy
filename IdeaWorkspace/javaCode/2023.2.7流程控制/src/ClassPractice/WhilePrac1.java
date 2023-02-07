/**
 * 打印1-10之间的偶数
 * */
package ClassPractice;

public class WhilePrac1 {
    public static void main(String[] args) {
        int i =1;
        while(i<11){            //循环
            if (i%2==0)         //  判断是否是偶数
                System.out.println(i);
            i++;
        }
    }
}
