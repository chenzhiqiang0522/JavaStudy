/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：FinalClass
 * Date：2023/2/16
 * Filename：FinalClass
 */
public class FinalClass {
    static final double PI =3.14;

    public static void main(String[] args) {
        System.out.println(getArea(10));
    }
    public static double getArea(double r){
        return PI*r*r;
    }
}
