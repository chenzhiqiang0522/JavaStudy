package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：JAVA
 * name：Dog
 * Date：2023/2/10
 * Filename：Dog
 */

/**
 * 定义一个狗狗类，狗狗（Dog）
 * 有如下属性：性别（int），姓名
 * 有如下方法： void eat(String food)方法
 */
public class Dog {
    int gender; //性别
    String name;    // 姓名

    public Dog(int gender, String name) {   // 有参构造
        this.gender = gender;
        this.name = name;
    }

    public Dog() {      // 无参构造
        this.name = "不详";
        this.gender =0;
    }

    public void eat(){
        System.out.println("小狗的名字:"+name+","+"正在吃大香肠");
    }
}
