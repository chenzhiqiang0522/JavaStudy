package org.chenzhiqiang.homework.interfacecode;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Function;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.interfacecode
 * Project：JAVA
 * name：FunctionTest
 * Date：2023/3/4
 * Filename：FunctionTest
 */

/**
 * Function<T input,T return>(){
 *
 * }
 * T input 为传入参数的类型
 * T return 为返回值的类型
 * Function是一个函数式接口
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> integerStringFunction = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer.compareTo(5);
            }
        };
        System.out.println(integerStringFunction.apply(55));
        Integer integer1 = new Integer(55);
//        Function<Integer, Integer> integerStringFunction1 = integer-> integer.compareTo(5);
        Function<Integer, Integer> integerStringFunction3 = integer1::compareTo;
        System.out.println(integerStringFunction3.apply(55));
    }
}
