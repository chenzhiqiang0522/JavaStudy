package practice.homework.thread;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.thread
 * Project：JAVA
 * name：ThreadExtendTest
 * Date：2023/2/22
 * Filename：ThreadExtendTest
 */
public class ThreadExtendTest {
    public static void main(String[] args) {
        ThreadExtend1 th1 = new ThreadExtend1();
        ThreadExtend2 th2 = new ThreadExtend2();

        th1.start();
        th2.start();
    }
}
