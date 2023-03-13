package org.chenzhiqiang.homework.getprimarykey.test;

import org.chenzhiqiang.homework.getprimarykey.demain.User;
import org.chenzhiqiang.homework.getprimarykey.services.impl.InsertUserImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.getprimarykey.test
 * Project：JAVA
 * name：InsertUserTest
 * Date：2023/3/13
 * Filename：InsertUserTest
 */
public class InsertUserTest {
    @Test
    public void inserUserTest(){
        User user = new User();
        user.setUsername("唔西迪西");
        user.setPassword("123456");
        user.setMoney(new BigDecimal("2500"));
        InsertUserImpl insertUser = new InsertUserImpl();
        insertUser.insertUser(user);
    }
}
