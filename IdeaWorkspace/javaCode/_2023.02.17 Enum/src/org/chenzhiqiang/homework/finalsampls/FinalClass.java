package org.chenzhiqiang.homework.finalsampls;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.finalsampls
 * Project：JAVA
 * name：FinalClass
 * Date：2023/2/17
 * Filename：FinalClass
 */

/**
 * final 关键字:
 *      1、final修饰变量:
 *          final修饰变量则表示变量不能改变值即该变量是一个常量
 *          必须在声明时初始化，否则会报错，报错如下：
 *          Variable 'IDNUMBER' might not have been initialized
 *          也不能修改，否则会报错，报错如下：
 *          Cannot assign a value to final variable 'IDNUMBER'
 *      2、final修饰类：
 *          final修饰的类不能被继承,继承final修饰的类会报错：
 *          Cannot inherit from final 'org.chenzhiqiang.homework.finalsampls.FinalClass1
 *      3、public static final 修饰全局常量
 *      4、final修饰方法:
 *          使用final修饰方法，方法不能够被重写,否则会报错：
 *          'work()' cannot override 'work()' in 'org.chenzhiqiang.homework.finalsampls.FinalClass'; overridden method is final
 */
public class FinalClass {
    final String IDNUMBER="500234202204225486";     // 身份证号码
    public final static boolean GENDER = true;      // 公民性别

    final void work(){
        System.out.println("我热爱工作，我一天不工作，浑身难受");
    }

    public void rest(){
        System.out.println("我不需要休息，我要卷死你们");
    }
}

final class FinalClass1{

}

//class SonClass extends FinalClass1{
//
//}
class SonClass extends FinalClass{
    @Override
    public void work() {

    }
    @Override
    public void rest() {        // 重写非final修饰方法
        System.out.println("不想上班，只想休息");
    }
}

class FinalClassTest{
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        System.out.println(fc.IDNUMBER);
        System.out.println(FinalClass.GENDER? "男性":"女性");
//        fc.IDNUMBER = "500234202212105486";
    }
}
