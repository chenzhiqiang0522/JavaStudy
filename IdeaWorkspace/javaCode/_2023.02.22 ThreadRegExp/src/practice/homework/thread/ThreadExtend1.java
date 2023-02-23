package practice.homework.thread;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.thread
 * Project：JAVA
 * name：ThreadExtend
 * Date：2023/2/22
 * Filename：ThreadExtend
 */
public class ThreadExtend1 extends Thread{
    public ThreadExtend1() {
    }

    public ThreadExtend1(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+"正在运行!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
