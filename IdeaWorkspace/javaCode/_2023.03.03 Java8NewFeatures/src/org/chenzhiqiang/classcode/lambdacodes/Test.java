package org.chenzhiqiang.classcode.lambdacodes;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.classcode.lambdacodes
 * Project：JAVA
 * name：Test
 * Date：2023/3/3
 * Filename：Test
 */
public class Test {
    public static void main(String[] args) {
        Run runner = s-> System.out.println("福利卡双方记录卡缴费了卡");
        Run runner1 = Person::say;
        runner.say("fasdfafasd");
        runner1.say("1111111");
    }
}
