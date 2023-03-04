package org.chenzhiqiang.homework.optional;

import java.util.Optional;
import java.util.function.Function;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.optional
 * Project：JAVA
 * name：OptionalTest
 * Date：2023/3/4
 * Filename：OptionalTest
 */
public class OptionalTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("nick");
        user.setAge(15);
        User user1 = null;
        System.out.println(isExist(user));
        System.out.println(isExist(user1));
    }
    public static Boolean isExist(User user){
        return Optional.ofNullable(user)
                .map(u -> true).orElse(false);
    }
}
