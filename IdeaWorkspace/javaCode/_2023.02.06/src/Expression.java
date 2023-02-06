/**
 * 表达式：
 *      一系列的常量、变量、运算符和括号按照一定的规律计算出结果值的算式就成为表达式
 * */
public class Expression {
    public static void main(String[] args) {
        byte b=1;
        byte b1 = 2;
        int i1 = b+b1;  //  表达式的数据精度都小于int，最后表达式的精度会自动提升到int。
        long l = 1L;    //  表达式的数据精度有大于int，最后表达式的精度取决于精度最高的类型。
        long l1 = b + 1;
    }
}
