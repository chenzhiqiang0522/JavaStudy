package _20230203;

/**
 * 变量
 * 存放值，方便运算
 */
public class Var2 {
    public static void main(String[] args) {
        // 声明变量
        byte B;
        short Sh;
        int I;
        long L;
        float F;
        double D;
        String S;

        // 变量赋值,将=号右边的值赋值给左边的变量
        B = 127;
        Sh = 3;
        I = 10;
        L = 1000l;
        F = 3.0f;
        D = 3.1415;
        S = "Hello";

        // 取值，对变量进行输出
        System.out.println(B);
        System.out.println(Sh);
        System.out.println(I);
        System.out.println(L);
        System.out.println(F);
        System.out.println(D);
        System.out.println(S);
        System.out.println("-------------------------");       // 分割线
        // 可以在声明的同时进行赋值，数据类型 变量名 = 初始值;
        String name = "猪八戒";
        int age = 18;
        System.out.println(name);
        System.out.println(age);
        System.out.println("-------------------------");       // 分割线
        // 同时声明多个变量，数据类型 变量名1 = 值1，变量名2 = 值2，变量名3 = 值3;
        int var1 = 1, var2 = 2, var3 = 3;

    }
}
