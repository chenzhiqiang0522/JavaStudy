package org.chenzhiqiang.homework.preparestatement.dao;

import org.chenzhiqiang.homework.preparestatement.demain.User;

import java.math.BigDecimal;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.dao
 * Project：JAVA
 * name：ITransaction
 * Date：2023/3/13
 * Filename：ITransactionDao
 */
public interface ITransactionDao {
    User queryOne(Long ueraccount);
    void updateUser(User user, BigDecimal money);
}
