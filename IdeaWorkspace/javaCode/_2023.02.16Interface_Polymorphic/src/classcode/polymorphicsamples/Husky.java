package classcode.polymorphicsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.polymorphicsamples
 * Project：JAVA
 * name：Husky
 * Date：2023/2/16
 * Filename：Husky
 */
public class Husky extends Dog {
    @Override
    public void bark() {
        System.out.println("我是一只husky");
    }

    @Override
    public void eat() {
        System.out.println("哈士奇在坑骨头！");
    }
    public void caiJia(){
        System.out.println("拆家大队大队长！！！");
    }
}
