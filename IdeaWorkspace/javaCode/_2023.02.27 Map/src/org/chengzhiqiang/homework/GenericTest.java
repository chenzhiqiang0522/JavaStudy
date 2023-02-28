package org.chengzhiqiang.homework;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：Generic
 * Date：2023/2/27
 * Filename：Generic
 */

/**
 * 泛型类
 *   作用：
 *      1. 检查类的参数的类型是否与传进的类型相符
 *      2. 类型的强制转换都是自动和隐式的
 *      3. 提高代码的复用率
 *   语法：
 *      1.泛型类
 *          定义语法：
 *              class Point<Type>{    // 表示在类声明了一个符号  数据类型，是一种泛指
 *                  Type x;
 *                  Type y;
 *              }
 *          Type可以同时有多个，并用逗号隔开
 *          调用语法：
 *              类型名<T1,T2,T3,……> 对象名 = new 构造函数名()<类型1，类型2，类型3……>([参数列表])
 *
 */
public class GenericTest {
    public static void main(String[] args) {
        GenericClass<String,String> gc1 = new GenericClass<>("nick","man");
        System.out.println(gc1.toString());
        GenericMethod<String, String> gm = new GenericMethod<>();
        gm.add("Nick","man");
        GenericMethod<Integer,Integer> gm1 = new GenericMethod<>();
        gm1.add(1,2);
    }
}
