package _20230203;

public class VarCall2 {
    public static void main(String[] args) {
        // 声明一个，int类型的变量score并且赋值为90
        int score = 90;
        score = score+1;    // 将score的值加1，再赋值给score
        System.out.println(score);
        score = score - 10;  // 将score的值减10，再赋值给score
        System.out.println(score);
        int ss = score;     // 声明一个int型的变量ss，并将score的值赋值给ss
        System.out.println(ss);
    }
}
