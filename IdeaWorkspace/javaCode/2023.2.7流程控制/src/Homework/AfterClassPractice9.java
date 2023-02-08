/**
 * 1-5的阶乘
 * */package Homework;
public class AfterClassPractice9 {
    public static void main(String[] args) {
        int jieChen = 0;
        for(int i = 1; i <= 5;i++){     // 使用一个for循环
            int temp = 1;
            int j = 1;
            while (j<=i){
                temp *= j;
                j++;
            }
            jieChen+=temp;
        }
        System.out.println(jieChen);
        System.out.println("==================");
        int jieChen1 = 1;                       // 使用双层for循环
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                jieChen1 += j;
            }
        }
        System.out.println(jieChen);
    }
}
