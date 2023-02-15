package org.chenzhiqiang.objectclass;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.objectclass
 * Project：JAVA
 * name：PersonTest
 * Date：2023/2/15
 * Filename：PersonTest
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Nick",20,true,"500234200251025125");
        Person person2 = new Person("Nick",20,true,"500234200251025125");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        /*
            equals源码：
                public boolean equals(Object obj) {
                    return (this == obj);
                }
         */

        System.out.println(person1);
        System.out.println(person2.getClass());
    }
}
