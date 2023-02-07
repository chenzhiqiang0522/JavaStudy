package ClassPractice;

public class Switch {
    public static void main(String[] args) {
        int a = 6;
        switch (a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天也好好好工作鸭！！！");
                break;
            case 6:
                System.out.println("送你一颗好想出去丸！！！");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
