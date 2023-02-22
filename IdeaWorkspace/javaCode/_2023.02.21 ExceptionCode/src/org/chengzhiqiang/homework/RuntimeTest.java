package org.chengzhiqiang.homework;

import java.io.IOException;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：Runtime
 * Date：2023/2/21
 * Filename：Runtime
 */
public class RuntimeTest {
    /*
        static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象。
        Process exec(String command) 在单独的进程中执行指定的字符串命令。
     */
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("Bandizip.exe");     // java: 未报告的异常错误java.io.IOException; 必须对其进行捕获或声明以便抛出

    }
}
