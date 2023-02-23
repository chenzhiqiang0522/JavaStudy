package practice;

/**
 * Author：NickWiber(陈志强)
 * Package：practice
 * Project：JAVA
 * name：ImplThread2
 * Date：2023/2/22
 * Filename：ImplThread2
 */
public class ImplThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("线程2执行中!!!!!!!!!!!!!!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
