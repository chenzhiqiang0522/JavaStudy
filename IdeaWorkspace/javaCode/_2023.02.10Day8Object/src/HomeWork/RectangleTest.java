package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：RectangleTest
 * Date：2023/2/10
 * Filename：RectangleTest
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,5);
        System.out.println(rect1.getArea());
        System.out.println("-------------分割线-----------");
        Rectangle rect2 = new Rectangle(100,5);
        System.out.println(rect2.getArea());
        System.out.println("-------------分割线-----------");

    }
}
