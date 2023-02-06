/**
 * 该类展示强制数据类型转换
 * */
public class DataCast02 {
    public static void main(String[] args) {
        int i = 50;
        // 数据类型 变量名 = （需要转换的数据类型）值
        short s = (short)i;
        System.out.println(s);
        int s1 = 51;
        short s2 = (short)(s1+i);   // 如果要强转，需要强转的是最后的结果值
        int s3 = 129;
        // 大的数据类型值转小的数据类型，需要强转
        // 语法：数据类型 变量名 = (目标数据类型)值;
        byte b = (byte) s3;
        System.out.println("byte:"+b);
    }
}
