package classcode.polymorphicsamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.polymorphicsamples
 * Project：JAVA
 * name：DogTest
 * Date：2023/2/16
 * Filename：DogTest
 */
public class PersonTest {
    public static void main(String[] args) {
        Husky husky = new Husky();
        BorderCollie borderCollie = new BorderCollie();
        Person person = new Person();
        person.feed(husky);
        person.feed(borderCollie);
    }
}
