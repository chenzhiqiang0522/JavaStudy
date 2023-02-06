/**
 * 该类用于展示运算符 + - * / %
 * */
public class Cal01 {
    public static void main(String[] args) {
        double a=2;
        int b=5;
        System.out.println(a + b); // 7
        System.out.println(a - b); // 3
        System.out.println(a * b); // 10
        System.out.println(a / b); // 2.5
        System.out.println(a % b); // 1
        System.out.println("----------------分割线---------------------");
        System.out.println(6/10); // 0
        System.out.println(7/10); // 0
        System.out.println(8/10); // 0
        System.out.println(9/10); // 0
        System.out.println(10/10); // 1
        System.out.println("----------------分割线---------------------");
        System.out.println(6%10);// 6
        System.out.println(7%10);// 7
        System.out.println(8%10);// 8
        System.out.println(9%10);// 9
        System.out.println(10%10);// 0
        System.out.println("----------------分割线---------------------");
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(0.0/0.0);//  结果是NaN（Not a Number）不是数字
        System.out.println(1.0/0.0);// Infinity无穷大
    }
}
