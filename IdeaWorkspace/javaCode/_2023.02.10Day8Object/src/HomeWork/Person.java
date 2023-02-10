package HomeWork;

/**
 * Author：NickWiber(陈志强)
 * Package：HomeWork
 * Project：IdeaWorkspace
 * name：Person
 * Date：2023/2/10
 * Filename：Person
 */

/**
 * 设计类语法：
 * public class 类名{
 *  可编写 0 到 N 个成员变量
 * 	[修饰符] 数据类型 变量名1;
 * 	可编写 0 到 N 个成员方法
 * 	[修饰符] 返回值类型 方法名称(参数){
 * 	    方法体
 * 	    }
 * 	}
 */
public class Person {
    // 类的属性
    public int age; // 年龄
    public String name; // 姓名
     public double weight;  // 体重
    public boolean gender;  // 性别

    // 成员方法
    // 修饰符 返回值类型 方法名（）{ 方法体 }
    public void eat(){      // 吃饭
        System.out.println("I am eating some food!!!!");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

}
