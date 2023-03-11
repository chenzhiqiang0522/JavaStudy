package addtional.trans_Record;

import java.util.Arrays;
import java.util.Objects;

/**
 * Author：NickWiber(陈志强)
 * Package：addtional.trans_Record
 * Project：JAVA
 * name：TransRecord
 * Date：2023/3/7
 * Filename：TransRecord
 */
public class TransRecord implements Comparable<TransRecord>{
    private String id;
    private String name;
    private String number;
    private String orderId;
    private String date;
    private String orderNum;

    public static void searchOrder(String id){
        if (DataContext.treeMap.containsKey(id)) {
            String id1 = DataContext.treeMap.get(id).getId();
            String name= DataContext.treeMap.get(id).getName();
            String number= DataContext.treeMap.get(id).getNumber();
            String orderId= DataContext.treeMap.get(id).getOrderId();
            String date= DataContext.treeMap.get(id).getDate();
            String orderNum= DataContext.treeMap.get(id).getOrderNum();
            System.out.println("客户号:"+id1+" 客户名字:"+name+" 数量:"+number
                    +" 订单ID:"+orderId+" 订单日期:"+date+" 订单数量:"+orderNum);
        }else {
            System.out.println("没有该客户的相关信息");
        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public TransRecord() {
    }

    public TransRecord(String id, String name, String number, String orderId, String date, String orderNum) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.orderId = orderId;
        this.date = date;
        this.orderNum = orderNum;
    }

    public TransRecord enclose(String s){
        String id;
        String name;
        String number;
        String orderId;
        String date;
        String orderNum;
        String[] split = s.split("\t");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
            System.out.println(Arrays.toString(split[i].toCharArray())+" "+split[i].length());
        }
        id = split[0];
//        System.out.println(id);
        name = split[1];
//        System.out.println(name);
        number = split[2];
//        System.out.println(number);
        orderId = split[3];
//        System.out.println(orderId);
        date = split[4];
//        System.out.println(date);
        orderNum = split[5];
//        System.out.println(orderNum);
        TransRecord transRecord = new TransRecord(id, name, number, orderId, date, orderNum);
        return transRecord;
    }

    @Override
    public String toString() {
        return "TransRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                ", orderNum='" + orderNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransRecord that = (TransRecord) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(number, that.number) && Objects.equals(orderId, that.orderId) && Objects.equals(date, that.date) && Objects.equals(orderNum, that.orderNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, number, orderId, date, orderNum);
    }

    @Override
    public int compareTo(TransRecord o) {
//        if ((Double.parseDouble(this.getOrderNum()))>(Double.parseDouble(o.getOrderNum())))
//            return (int)((Double.parseDouble(this.getOrderNum()))-(Double.parseDouble(o.getOrderNum())));
//        else
//            return (int)((Double.parseDouble(o.getOrderNum()))-(Double.parseDouble(this.getOrderNum())));
        Integer i1 = Integer.parseInt(this.getOrderNum());
        Integer i2 = Integer.parseInt(o.getOrderNum());
        if (i1>i2)
            return i1 - i2;
        else
            return i2 - i1;
    }
}
