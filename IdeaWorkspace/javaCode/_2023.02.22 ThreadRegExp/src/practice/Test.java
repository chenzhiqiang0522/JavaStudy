package practice;

/**
 * Author：NickWiber(陈志强)
 * Package：practice
 * Project：JAVA
 * name：Test
 * Date：2023/2/22
 * Filename：Test
 */
public class Test {
    public static void main(String[] args) {
        /*
        ThreadTest threadTest1 = new ThreadTest();
        ThreadTtest2 threadTtest2 = new ThreadTtest2();
        threadTest1.start();
        threadTtest2.start();
        */


        Thread thread1 = new Thread(new ImplThread1());
        Thread thread2 = new Thread(new ImplThread2());
        thread1.start();
        thread2.start();
    }
}
