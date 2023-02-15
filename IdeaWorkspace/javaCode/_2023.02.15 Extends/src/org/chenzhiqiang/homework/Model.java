package org.chenzhiqiang.homework;

import java.util.Objects;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：Model
 * Date：2023/2/15
 * Filename：Model
 */
public class Model {
    private String name;
    private double waistline;   // 腰围
    private double hipline;     // 臀围
    private double brestline;   // 胸围

    @Override
    public String toString() {
        return "Model[" +
                "name:'" + name  +
                ", waistline:" + waistline +
                ", hipline:" + hipline +
                ", brestline:" + brestline +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Double.compare(model.waistline, waistline) == 0 &&
                Double.compare(model.hipline, hipline) == 0 &&
                Double.compare(model.brestline, brestline) == 0 &&
                Objects.equals(name, model.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, waistline, hipline, brestline);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWaistline() {
        return waistline;
    }

    public void setWaistline(double waistline) {
        this.waistline = waistline;
    }

    public double getHipline() {
        return hipline;
    }

    public void setHipline(double hipline) {
        this.hipline = hipline;
    }

    public double getBrestline() {
        return brestline;
    }

    public void setBrestline(double brestline) {
        this.brestline = brestline;
    }

    public Model() {
    }

    public Model(String name, double waistline, double hipline, double brestline) {
        this.name = name;
        this.waistline = waistline;
        this.hipline = hipline;
        this.brestline = brestline;
    }
}
