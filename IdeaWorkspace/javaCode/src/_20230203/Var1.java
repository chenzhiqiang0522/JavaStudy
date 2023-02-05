package _20230203;

/**
 * 变量
 * 存放值，方便运算
 */
public class Var1 {
    public static void main(String[] args) {
        // 声明变量
        byte varB;
        short varSh;
        int varI;
        long varL;
        float varF;
        double varD;
        String varS;

        // 变量赋值,将=号右边的值赋值给左边的变量
        varB = 127;
        varSh = 3;
        varI = 1000;
        varL = 1000;
        varF = 3.0f;
        varD = 3.1415;
        varS = "Hello";

        // 取值，对变量进行输出
        System.out.println(varB);
        System.out.println(varSh);
        System.out.println(varI);
        System.out.println(varL);
        System.out.println(varF);
        System.out.println(varD);
        System.out.println(varS);
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
