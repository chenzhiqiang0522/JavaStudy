package practice;

/**
 * Author：NickWiber(陈志强)
 * Package：practice
 * Project：JAVA
 * name：ThreadTtest2
 * Date：2023/2/22
 * Filename：ThreadTtest2
 */
public class ThreadTtest2 extends Thread {
    public ThreadTtest2() {
    }

    public ThreadTtest2(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread2 is running!!!!!!!!!!!!!!!!!!!!!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
