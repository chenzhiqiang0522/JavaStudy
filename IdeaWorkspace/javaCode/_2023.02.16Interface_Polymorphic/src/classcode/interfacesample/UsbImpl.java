package classcode.interfacesample;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.interfacesample
 * Project：JAVA
 * name：UsbImpl
 * Date：2023/2/16
 * Filename：UsbImpl
 */
public class UsbImpl implements IUsb{
    @Override
    public void insert() {
        System.out.println("硬盘插入!!!!");
    }

    @Override
    public void unplug() {
        System.out.println("硬盘拔出!!!!");
    }
}
