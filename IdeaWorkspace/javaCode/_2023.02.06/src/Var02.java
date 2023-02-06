/**
 *  该类用来表示变量的就近原则
 * */
public class Var02 {
    static int a = 50;  // 声明一个静态变量
    public static void main(String[] args) {
        int a = 40; //  声明一个局部变量
        System.out.println(a);  //  使用栈中的变量a
    }
}
