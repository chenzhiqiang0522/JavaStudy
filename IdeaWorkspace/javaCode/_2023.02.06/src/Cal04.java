/**
* 逻辑运算
*      |
*      ||
*      &
*      &&
*      ^  相同为false，不同为ture
*      !
 * */
public class Cal04 {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(true&&false);
        System.out.println(false||true);
        int a = 6;
        // a 在10 和 3 之间  && 和 & 都是表示 and的意思   true && false
        System.out.println(a<10 && a>3);
        // a 在10 和 3 之间  && 和 & 都是表示 and的意思
        System.out.println(a<10 & a>3);
        int b = 23;
        // 不管是 && 还是 &  2边的结果都是true 的时候 最终的结果才是 true
        System.out.println(b>10 || b<6);
        // 判断一个变量b 大于10  或者  小于6
        System.out.println(b>10 | b<6);
        System.out.println("----------------分割线---------------------");
        int a1 = 1;
        System.out.println(false && 1 == a1++);// &&如果前面的结果是false那么就会短路不会执行&&后面的表达式了
        int a2 = 1;
        System.out.println(false & 1 == a2++);// &如果前面的结果是false，依旧会执行后面的代码
        System.out.println(a1);
        System.out.println(a2);
        int b1 = 1;
        int b2 = 2;
        System.out.println(true||1==b1++);  // ||如果前面的结果是true那么就会短路不会执行||后面的表达式了
        System.out.println(true | 1 == b2++);   // |如果前面的结果是true依旧会执行后面的代码
        System.out.println(b1);
        System.out.println(b2);


    }
}
