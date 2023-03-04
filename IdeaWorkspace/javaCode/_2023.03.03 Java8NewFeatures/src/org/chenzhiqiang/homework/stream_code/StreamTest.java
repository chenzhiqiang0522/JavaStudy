package org.chenzhiqiang.homework.stream_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.stream_code
 * Project：JAVA
 * name：StreamTest
 * Date：2023/3/4
 * Filename：StreamTest
 */
public class StreamTest {
    public static void main(String[] args) {
        /*
            stream 的相关方法
            1. forEach（Consumer<? super T ?> action）
            2. map()
            3. limit()
            4. filter()
            5. sorted()
            6.Collectors()
         */
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("nick1", 11));
        users.add(new User("mkbk", 22));
        users.add(new User("wiber", 10));
        users.add(new User("Jonas", 35));
        users.add(new User("Cypher", 44));
        Stream<User> stream = users.stream();   //  获取流
        System.out.println("======================forEach方法=======================");
//        stream.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User user) {
//                System.out.println(user.toString());
//            }
//        });

//        stream.forEach(user -> System.out.println(user.toString()));
        stream.forEach(System.out::println);
        System.out.println("===================map()==========================");
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);
        Stream<Integer> stream1 = integers1.stream();
        // 使用匿名内部类的方式
//        stream1.map(new Function<Integer, Object>() {
//            @Override
//            public Object apply(Integer integer) {
//                return integer+1;
//            }
//        });
        // 使用Lambda表达式的方式
//        stream1.map(integer -> integer+1).forEach(System.out::println);
        System.out.println("======================limit()=======================");
//        stream1.limit(3).forEach(System.out::println);  // limit()方法
        System.out.println("======================filter()=======================");
//        stream1.filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer>3;
//            }
//        }).forEach(System.out::println);

        System.out.println("======================sorted()=======================");
        ArrayList<Integer> integersNum = new ArrayList<>();
        integersNum.add(9);
        integersNum.add(5);
        integersNum.add(11);
        integersNum.add(20);
        integersNum.add(1);
        integersNum.add(7);
        Stream<Integer> stream2 = integersNum.stream();
//        stream2.sorted(new Comparator<Integer>() {      // sorted()方法对流中的元素进行排序
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.intValue() - o2.intValue();
//            }
//        }).forEach(System.out::println);
        System.out.println("======================collectors()=======================");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        Stream stream3 = strings.stream();
        String result = (String) stream3.collect(Collectors.joining("-"));
        System.out.println(result);
    }
}
