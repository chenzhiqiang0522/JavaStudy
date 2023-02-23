package practice.homework.saleTicket;

/**
 * Author：NickWiber(陈志强)
 * Package：practice.homework.saleTicket
 * Project：JAVA
 * name：SaleTicketImkpl
 * Date：2023/2/22
 * Filename：SaleTicketImkpl
 */

/**
 * 使用接口实现Runnable类,并创建线程
 */
public class SaleTicketImkpl {
    public static void main(String[] args) {
        SaleTickImpl saleTick = new SaleTickImpl();
        Thread th1 = new Thread(saleTick,"售票窗口1");
        Thread th2 = new Thread(saleTick);
        th2.setName("售票窗口2");       // 设置线程名
        Thread th3 = new Thread(null,saleTick,"售票窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}
