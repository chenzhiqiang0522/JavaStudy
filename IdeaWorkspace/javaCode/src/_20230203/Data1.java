package _20230203;

public class Data1 {
    public static void main(String[] args) {
        // 在计算机中，所有的整数默认都是int数据类型
        System.out.println(1);
        // System.out.println(10000000000);// 如果装不下了 就要报错
        System.out.println(10000000000L);// 要申明这个是long类型就要在数据的后面加上一个l或者L
        // 如果是小数类型默认是double
        System.out.println(3.0); // 是double
        System.out.println(2.3f);// 如果要表示数据类型是单精度float类型就在数据后面 + f或者F

        System.out.println('s'); // 表示一个字符s是char类型是基本数据类型
        System.out.println(true);
        System.out.println(false);
        System.out.println("sdfsdf");// 字符串用双引号

        char c = 65;// ASCII码65------A      97------a
        System.out.println(c);

        System.out.println("\\");// \ 是转义符

        String s = "Hello"; // 引用数据类型
        System.out.println(s);
    }
}
