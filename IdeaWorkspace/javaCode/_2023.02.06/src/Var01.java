/**
 *  该文件为变量相关文件
 *  变量的分类
 * */
public class Var01 {
    int a = 5;
    int b;

    static int c = 6; // 成员变量，在类体中申明的变量叫做
    static int d;
    static byte  bb;
    static short  ss;
    static long ll;
    static float  ff;
    static double  dd;
    static char  cc;
    static boolean  boo;
    public static void main(String[] args) {
        //  定义一个年龄变量，赋值为23
        int age = 23;   /*  局部变量，因为它申明在main方法中，他的作用域只在main方法中
                        并且要申明才能用 */
        double weight;  //  定义一个体重
        //  输出
        System.out.println(age);
        System.out.println(c);
        System.out.println(d);
        System.out.println("数据类型和默认值===============");
        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ll);
        System.out.println(dd);
        System.out.println(ff);
        System.out.println(cc);
        System.out.println(boo);
    }
    /*
    * 成员变量&全部变量的区别
    *   成员变量：
    *       在类体重声明，在整个类中起作用，整个类都可以访问到，如果没有初始化，系统会
    *       根据类型赋初始值。
    *   局部变量：
    *       在方法体中声明，从声明的下面到方法的结束起作用，如果没有初始化，就不能够使用。
    *   在main方法中使用成员变量，该成员变量必须有static修饰
    * */
}
