package org.chenzhiqiang.homework.getprimarykey.dao;

import org.chenzhiqiang.homework.getprimarykey.demain.User;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.getprimarykey.dao.impl
 * Project：JAVA
 * name：IInserUserDao
 * Date：2023/3/13
 * Filename：IInserUserDao
 */
public interface IInserUserDao {
    User queryById(Long useraccount);
    void inserUser(User user);
}
