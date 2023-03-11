package org.chenzhiqiang;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：DataFormatDemo
 * Date：2023/3/11
 * Filename：DataFormatDemo
 */
public class DataFormatDemo {

    static void format1(String patter,Double value){
        DecimalFormat decimalFormat = new DecimalFormat(patter);
        String formatResult = decimalFormat.format(value);
        System.out.println("原始数据为："+ value + " 格式化后的数据为："+formatResult);
    }
    @Test
    public void testFunction(){
        DataFormatDemo.format1("0000.0000000", 123456.1188);
        DataFormatDemo.format1("####.#######", 123456.1188);
        DataFormatDemo.format1("####.#######%", 123456.1188);
        DataFormatDemo.format1("####.#######\u2030", 123456.1188); // 符号放在后面
        DataFormatDemo.format1("\u2030####.#######", 123456.1188); // 符号放在前面

    }
}
