/**
 * 自增自减
 * */
public class Cal02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        //如果符号在变量前那么表达式的结果是先自加或自减在赋值
        System.out.println(a++);    //  a++等价于a = a + 1
        System.out.println(b--);    //  b--等价于b = b - 1
        System.out.println("----------------分割线---------------------");
        int c = 5;
        int d = 6;
        //如果符号在变量后那么表达式的结果是先赋值在变量自加或自减1
        System.out.println(--a);
        System.out.println(--d);
        System.out.println("----------------分割线---------------------");
        int a1 = 2;
        int b1 = 3;
        int c1 = a1++ + ++a1 + --b1;
        int d1 = c1-- - a1++ + ++b1;
        System.out.println(a1);// 5
        System.out.println(b1);// 3
        System.out.println(c1);// 7
        System.out.println(d1);// 7
    }
}
