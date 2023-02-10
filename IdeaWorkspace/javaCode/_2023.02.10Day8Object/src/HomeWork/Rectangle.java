package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：AfterClassPracitce1
 * Date：2023/2/10
 * Filename：AfterClassPracitce1
 */

/**
 * 定义一个长方形的类（Rectangle）
 */
public class Rectangle {
    double height;  // 长
    double width;   // 宽

    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this.height=1.0;
        this.width = 1.0;
    }
    public double getArea(){
        return height*width;
    }
}
