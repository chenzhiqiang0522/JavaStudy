package org.chenzhiqiang.homework.interfacecode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.interfacecode
 * Project：JAVA
 * name：InstanceMethodReference
 * Date：2023/3/4
 * Filename：InstanceMethodReference
 */
public class InstanceMethodReference {
    private String message;

    public InstanceMethodReference(String message) {
        this.message = message;
    }

    public InstanceMethodReference() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void out(String msg){
        System.out.println(msg);
    }
}
