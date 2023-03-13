package org.chenzhiqiang.homework.connectionpool.services.impl;

import org.chenzhiqiang.homework.connectionpool.dao.impl.TransactionDaoImpl;
import org.chenzhiqiang.homework.connectionpool.demain.User;
import org.chenzhiqiang.homework.connectionpool.services.ITransaction;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.services.impl
 * Project：JAVA
 * name：ITransactionImpl
 * Date：2023/3/13
 * Filename：ITransactionImpl
 */
public class TransactionImpl implements ITransaction {
    @Override
    public String transaction(Long payer, Long reciever, BigDecimal money) {
        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        User user1 = transactionDao.queryOne(payer);
        User user2 = transactionDao.queryOne(reciever);
        if (Objects.nonNull(user1)&&Objects.nonNull(user2)) {
            if (user1.getMoney().compareTo(money)>0){
                transactionDao.updateUser(user1,money.multiply(new BigDecimal("-1")));
                transactionDao.updateUser(user2,money);
                System.out.println("转账成功");
                return "转账成功";
            }else {
                System.out.println("余额不足,转账失败！");
                return "余额不足,转账失败！";
            }
        }else {
            System.out.println("支出和接收账户不存在！");
            return "支出和接收账户不存在！";
        }
    }
}
