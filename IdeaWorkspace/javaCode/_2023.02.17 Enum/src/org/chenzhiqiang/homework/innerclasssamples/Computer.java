package org.chenzhiqiang.homework.innerclasssamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.innerclasssamples
 * Project：JAVA
 * name：Computer
 * Date：2023/2/17
 * Filename：Computer
 */

/**
 * 内部类：
 *      在外部类的类体中再定义一个类，实现外部类的某个功能，而不需要使用两个java文件
 */
public class Computer {
    private String brand;
    private String version;
    private String wifiVersion;
    public WIFI wifi;
    private String hardDiskType;
    public HardDisk hardDisk;
    public class WIFI{
        private String wifiVersion;
        public WIFI() {
            this.wifiVersion = "WIFI5";
        }

        public WIFI(String wifiVersion) {
            this.wifiVersion = wifiVersion;
        }

        @Override
        public String toString() {
            return wifiVersion;
        }
    }
    static class HardDisk{
        private String hardDiskType;

        public HardDisk() {
            this.hardDiskType = "HHD";
        }

        public HardDisk(String hardDiskType) {
            this.hardDiskType = hardDiskType;
        }

        @Override
        public String toString() {
            return  hardDiskType;
        }
    }

    public Computer() {
    }

    public Computer(String brand, String version,String wifiVersion,String hardDiskType) {
        this.brand = brand;
        this.version = version;
        this.wifi = new WIFI(wifiVersion);
        this.hardDisk = new HardDisk(hardDiskType);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", wifi=" + wifi +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
