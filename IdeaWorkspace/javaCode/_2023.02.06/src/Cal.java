/**
 * 该类显示+=   -=  *=  /=  %=
 * */
public class Cal {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(a+=5); // 10
        System.out.println(a -= 6); // a -= 6 等价于  a = a - 6;
        System.out.println(a *= 2);// a *= 2 等价于 a = a * 2;
        System.out.println(a /= 3);// a /= 3 等价于 a = a / 3;
        System.out.println(a %= 3);// a %= 3 等价于 a = a % 3;

    }
}
