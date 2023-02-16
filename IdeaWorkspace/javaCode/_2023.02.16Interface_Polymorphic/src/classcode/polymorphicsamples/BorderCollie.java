package classcode.polymorphicsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.polymorphicsamples
 * Project：JAVA
 * name：ChineseCountrysideDog
 * Date：2023/2/16
 * Filename：ChineseCountrysideDog
 */
public class BorderCollie extends Dog {
    @Override
    public void bark() {
        System.out.println("我是一只边境牧羊犬！！！！");
    }

    @Override
    public void eat() {
        System.out.println("我不喜欢吃骨头！！！！");
    }

    public void gurd(){
        System.out.println("暴打拆家的哈士奇");
    }
}
