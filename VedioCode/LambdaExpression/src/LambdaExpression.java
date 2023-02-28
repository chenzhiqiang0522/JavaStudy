/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：LambdaExpression
 * Date：2023/2/25
 * Filename：LambdaExpression
 */
public class LambdaExpression{

    public static void main(String[] args) {
        methodSwim(()->{
            System.out.println("I am swimming!!!!");
        });
    }

    public static void methodSwim(Swim s){
        s.swimming();
    }

}

interface Swim {
    public abstract void swimming();
}