package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：PigTest
 * Date：2023/2/10
 * Filename：PigTest
 */

/**
 * Pig类的测试类
 */
public class PigTest {
    public static void main(String[] args){
        Pig pig = new Pig();        // 调用无参构造函数
        System.out.println(pig.name);
        System.out.println(pig.gender);
        System.out.println(pig.age);
        System.out.println(pig.weight);
        System.out.println("------------分割线------------");

        // 为pig对象的属性赋值
        pig.name = "佩奇";
        pig.gender = true;
        pig.age = 5;
        pig.weight = 200;
        System.out.println(pig.name);
        System.out.println(pig.gender? "雄性":"雌性");
        System.out.println(pig.age);
        System.out.println(pig.weight);
        System.out.println("------------分割线------------");

        Pig pig1 = new Pig("佩奇");    // 调用有参构造函数
    }
}
