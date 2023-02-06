/**
 * 数据的隐式转换（自动转换）
 */
public class DataCast01 {
    public static void main(String[] args) {
        // 声明变量
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.0f;
        double d = 6.0;


        i = s + b;    //  int类型用来装byte+short
        double dd = s + b;  // short和byte的运算结果是int,但可以用double去装，因为小转大自动转
        d = b+d+i+l+f;  // 如果运算的结果值中,有数据的类型大于int 那么最后的结果值是以数据类型最大的那么数据类型

        char c = '我';
        int i1 = 1;
        int i2 = i1+c;
        System.out.println(i2);
        /*
        * 1. 如果表达式中所有数据的精度都小于int，最后表达式的精度会被自动提升为int
        * 2. 如果表达式中的数据精度大于int，最后结果的精度取决于表达式中最高精度的数据。
        * 3. 小的类型转大的数据类型是自动转换
        * */
    }
}
