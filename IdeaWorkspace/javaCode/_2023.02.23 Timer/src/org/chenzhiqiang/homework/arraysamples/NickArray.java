package org.chenzhiqiang.homework.arraysamples;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.arraysamples
 * Project：JAVA
 * name：NickList
 * Date：2023/2/23
 * Filename：NickList
 */

import java.util.Arrays;

/**
 * 数组的增删改查
 */
public class NickArray {
    Object[] arr;
    int arrLenth = 16;   // 数组长度
    int curPos = 0;      // 当前数组的实际长度
    int index = 0;                  // 数组下标

    // 修改元素
    public void delete(int i) throws Exception {
        if (i >= curPos){
            throw new Exception("此处为空，没有内容");
        }
        Arrays.copyOfRange(arr, i+1, curPos-1);
        arr[curPos-1] = null;
        curPos--;
    }

    // 修改元素
    public void modify(int i,Object o) throws Exception {
        if (i >= curPos){
            throw new Exception("此处为空，没有内容");
        }
        arr[i] = o;
        System.out.println("修改成功");
        System.out.println(this.toString());
    }

    // 查询对应下标的元素
    public Object searchByIndex(int i) throws Exception {
        if (i >= curPos){
            throw new Exception("此处为空，没有内容");
        }
        return arr[i];
    }


    // 查询元素
    public int search(Object o) {
        for (int i = 0; i < curPos; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // 追加元素
    public void increasement(Object o) {
        if (curPos + 1 > arrLenth) {
            arrLenth = arrLenth * 2 + 2;
            Object[] newArray = new Object[arrLenth];
            Arrays.copyOf(arr, curPos);
            arr = newArray;
        }
        arr[curPos++] = o;
    }

    // Creat Array
    public NickArray(int capacity) {
        this.arr = new Object[capacity];
        arrLenth = capacity;
    }

    public NickArray() {
        this(16);
    }

    // override toString
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (Object o : arr) {
            if (o != null) {
                sb.append(o);
                sb.append(",");
            } else
                break;
        }
        sb.append("]");
        sb.deleteCharAt(sb.lastIndexOf(","));       // 删除最后一个逗号
        return sb.toString();
    }
}
