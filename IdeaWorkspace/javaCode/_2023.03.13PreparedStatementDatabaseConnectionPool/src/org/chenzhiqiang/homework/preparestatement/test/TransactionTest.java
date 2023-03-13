package org.chenzhiqiang.homework.preparestatement.test;

import org.chenzhiqiang.homework.preparestatement.dao.impl.TransactionDaoImpl;
import org.chenzhiqiang.homework.preparestatement.services.impl.TransactionImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.test
 * Project：JAVA
 * name：TransactionTest
 * Date：2023/3/13
 * Filename：TransactionTest
 */
public class TransactionTest {
    @Test
    public void transactionTest(){
//        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        TransactionImpl transaction = new TransactionImpl();
        transaction.transaction((long)1249323612, (long)1249323613,  new BigDecimal(10));

    }
}
