package practice.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.saleTicket
 * Project：JAVA
 * name：Sale
 * Date：2023/2/22
 * Filename：Sale
 */
public class Sale {
    public static void main(String[] args) {
        /*
            使用继承实现
        ExtendSale extendSale1 = new ExtendSale();
        ExtendSale extendSale2 = new ExtendSale();
        ExtendSale extendSale3 = new ExtendSale();
        extendSale1.start();
        extendSale2.start();
        extendSale3.start();
        */
        SaleImpl ticketObj = new SaleImpl();
        Thread windows1 = new Thread(ticketObj,"Windows1");
        Thread windows2 = new Thread(ticketObj,"Windows2");
        Thread windows3 = new Thread(ticketObj,"Windows3");
        windows1.start();
        windows2.start();
        windows3.start();

    }
}
