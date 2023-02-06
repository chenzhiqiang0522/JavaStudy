/**
 * 三目运算符
 * */
public class Cal05 {
    public static void main(String[] args) {
        System.out.println(3<5 ? "3小于5" : 3<5);
        // Y和Z都是表达式，就可以接受Y和Z的值
        int a = 3>5 ? 3:5; // 保存最后的值的时候，变量类型要和Y和Z的数据类型就要相同
        System.out.println(a);
        // 1. 例如小明学习java考试成绩>=60显示非常优秀否则输出还有很大的提升空间。
        int score = 60;
        System.out.println(score>=60?"非常优秀":"还有很大的提升空间");
    }
}
