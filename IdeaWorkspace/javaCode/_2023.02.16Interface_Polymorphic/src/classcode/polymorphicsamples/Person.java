package classcode.polymorphicsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.polymorphicsamples
 * Project：JAVA
 * name：Person
 * Date：2023/2/16
 * Filename：Person
 */
public class Person {
    public void feed(Dog dog) {
//        dog.eat();
//        dog.bark();
        if (dog instanceof Husky) {
            Husky husky = (Husky) dog;
            husky.caiJia();
        }else if (dog instanceof BorderCollie){
            BorderCollie borderCollie = (BorderCollie) dog;
            borderCollie.gurd();
        }
    }
}
