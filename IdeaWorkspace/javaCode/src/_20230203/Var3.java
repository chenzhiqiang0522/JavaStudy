package _20230203;

/**
 * 变量
 * 存放值，方便运算
 */
public class Var3 {
    public static void main(String[] args) {
        // 声明变量
        byte b;
        short sh;
        int i;
        long l;
        float f;
        double d;
        String s;

        // 变量赋值,将=号右边的值赋值给左边的变量
        b = 127;
        sh = 3;
        i = 1000;
        l = 1000L;
        f = 3.0F;
        d = 3.1415;
        s= "Hello";

        // 取值，对变量进行输出
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println("-------------------------");       // 分割线
        // 可以在声明的同时进行赋值，数据类型 变量名 = 初始值;
        String name = "孙悟空";
        int age = 18;
        System.out.println(name);
        System.out.println(age);
        System.out.println("-------------------------");       // 分割线
        // 同时声明多个变量，数据类型 变量名1 = 值1，变量名2 = 值2，变量名3 = 值3;
        int var1 = 1, var2 = 2, var3 = 3;

    }
}
