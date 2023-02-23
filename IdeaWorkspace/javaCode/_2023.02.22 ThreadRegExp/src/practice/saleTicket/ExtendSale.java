package practice.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.saleTicket
 * Project：JAVA
 * name：ExtendSale
 * Date：2023/2/22
 * Filename：ExtendSale
 */
public class ExtendSale extends Thread {
    public int tickNum = 50;

    @Override
    public void run() {
        while (tickNum>0)
            System.out.println(tickNum--);
    }
}
