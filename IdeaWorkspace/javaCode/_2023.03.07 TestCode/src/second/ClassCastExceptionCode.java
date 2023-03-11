package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：ClassCastExceptionCode
 * Date：2023/3/7
 * Filename：ClassCastExceptionCode
 */

/**
 * 制造ClassCastException
 */
public class ClassCastExceptionCode {
    public static void main(String[] args) {
        Animal animal = new Animal("汪汪队");
        Dog dog = new Dog("阿奇", "Dog");
        Dog animal1 = (Dog) animal;     // 未引用，向下转型
        try {
            System.out.println(animal1.getCategory());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
