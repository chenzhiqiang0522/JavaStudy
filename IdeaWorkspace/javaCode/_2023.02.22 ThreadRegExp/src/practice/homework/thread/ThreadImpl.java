package practice.homework.thread;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.thread
 * Project：JAVA
 * name：ThreadImpl
 * Date：2023/2/22
 * Filename：ThreadImpl
 */
public class ThreadImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+"正在运行");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
