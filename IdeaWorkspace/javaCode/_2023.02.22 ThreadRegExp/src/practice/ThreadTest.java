package practice;

/**
 * Author：NickWiber(陈志强)
 * Package：practice
 * Project：JAVA
 * name：ThreadTest
 * Date：2023/2/22
 * Filename：ThreadTest
 */
public class ThreadTest extends Thread {

    public ThreadTest(Runnable target) {
        super(target);
    }

    public ThreadTest() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread1 is running!!!!!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
