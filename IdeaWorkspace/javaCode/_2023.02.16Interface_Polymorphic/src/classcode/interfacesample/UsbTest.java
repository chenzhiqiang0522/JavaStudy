package classcode.interfacesample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.interfacesample
 * Project：JAVA
 * name：Usb
 * Date：2023/2/16
 * Filename：Usb
 */
public class UsbTest {
    public static void main(String[] args) {
        UsbImpl usb = new UsbImpl();
        usb.insert();
        usb.unplug();
    }
}
