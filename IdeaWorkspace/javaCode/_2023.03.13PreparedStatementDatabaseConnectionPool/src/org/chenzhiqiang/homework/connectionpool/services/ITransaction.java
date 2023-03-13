package org.chenzhiqiang.homework.connectionpool.services;

import java.math.BigDecimal;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.services
 * Project：JAVA
 * name：ITransaction
 * Date：2023/3/13
 * Filename：ITransaction
 */
public interface ITransaction {
    String transaction(Long payOut, Long reciever, BigDecimal money);
}
