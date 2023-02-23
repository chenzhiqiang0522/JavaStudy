package practice.homework.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.saleTicket
 * Project：JAVA
 * name：SaleTickImpl
 * Date：2023/2/22
 * Filename：SaleTickImpl
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Runnable 实现类
 */
public class SaleTickImpl implements Runnable {
    private static int tickMount = 50;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 同步代码块
        while (tickMount > 0) {
//            synchronized (SaleTickImpl.class) {
//                if (tickMount > 0)
//                    System.out.println(Thread.currentThread().getName() + "售卖了票号为" + tickMount-- + "的车票");
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            synchronized (SaleTickImpl.class) {
//                sale();
//            }
            // 上锁 使用Lock的子类
            lock.lock();
            if (tickMount > 0)
                System.out.println(Thread.currentThread().getName() + "售卖了票号为" + tickMount-- + "的车票");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }



    }

    // 同步方法
//    public synchronized void sale() {
//        if (tickMount > 0)
//            System.out.println(Thread.currentThread().getName() + "售卖了票号为" + tickMount-- + "的车票");
//        try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//    }
}
