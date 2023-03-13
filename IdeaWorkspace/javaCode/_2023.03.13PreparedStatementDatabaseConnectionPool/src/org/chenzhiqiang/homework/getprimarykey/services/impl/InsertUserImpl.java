package org.chenzhiqiang.homework.getprimarykey.services.impl;

import org.chenzhiqiang.homework.getprimarykey.dao.impl.InserUserDaoImpl;
import org.chenzhiqiang.homework.getprimarykey.demain.User;
import org.chenzhiqiang.homework.getprimarykey.services.IInsertUser;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.getprimarykey.services.impl
 * Project：JAVA
 * name：InsertUserImpl
 * Date：2023/3/13
 * Filename：InsertUserImpl
 */
public class InsertUserImpl implements IInsertUser {
    @Override
    public void insertUser(User user) {
        InserUserDaoImpl inserUserDao = new InserUserDaoImpl();
        inserUserDao.inserUser(user);
    }
}
