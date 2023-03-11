package org.chenzhiqiang.homework;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：JavaBeanTest
 * Date：2023/3/6
 * Filename：JavaBeanTest
 */
public class JavaBeanTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = new User("Nick1",22,"Man");// 赋值一个对象到另一个对象
        User user1 = new User();
        System.out.println(user);
        System.out.println(user1);
        BeanUtils.copyProperties(user1, user);
        System.out.println(user);
        System.out.println(user1);
        System.out.println("=====================================================");
        // 复制一个对象到另一个类的对象
        User2 user2 = new User2();
        System.out.println(user);
        System.out.println(user2);
        BeanUtils.copyProperties(user2, user);
        System.out.println(user);
        System.out.println(user2);
        System.out.println("=====================================================");
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("name","nickWiber");
        map.put("age","18");
        map.put("gender","MAN");
        User2 user21 = new User2();
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        Stream<Map.Entry<String, Object>> stream = entries.stream();
        stream.forEach(System.out::println);
        BeanUtils.copyProperties(user21,map);
        System.out.println(user21);
    }
}
