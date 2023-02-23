package practice.homework.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.saleTicket
 * Project：JAVA
 * name：Sale
 * Date：2023/2/22
 * Filename：Sale
 */
public class Sale {
    public static void main(String[] args) {
        ExtendSaleTicket extendSaleTicket = new ExtendSaleTicket("售票窗口1");
        ExtendSaleTicket extendSaleTicket1 = new ExtendSaleTicket("售票窗口2");
        ExtendSaleTicket extendSaleTicket2 = new ExtendSaleTicket("售票窗口3");

        extendSaleTicket.start();
        extendSaleTicket1.start();
        extendSaleTicket2.start();
    }
}
