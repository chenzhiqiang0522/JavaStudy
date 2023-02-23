package practice.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.saleTicket
 * Project：JAVA
 * name：SaleImpl
 * Date：2023/2/22
 * Filename：SaleImpl
 */
public class SaleImpl implements Runnable {
    public int tickNum = 50;
    @Override
    public void run() {

        while (tickNum>0)
            System.out.println(Thread.currentThread().getName()+"  "+tickNum--);
    }
}
