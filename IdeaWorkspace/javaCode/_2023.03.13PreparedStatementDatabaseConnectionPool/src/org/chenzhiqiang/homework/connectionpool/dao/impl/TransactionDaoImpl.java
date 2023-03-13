package org.chenzhiqiang.homework.connectionpool.dao.impl;

import org.chenzhiqiang.homework.connectionpool.dao.ITransactionDao;
import org.chenzhiqiang.homework.connectionpool.demain.User;
import org.chenzhiqiang.homework.connectionpool.util.ConnectionUtil;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.dao.impl
 * Project：JAVA
 * name：ITransactionImpl
 * Date：2023/3/13
 * Filename：ITransactionImpl
 */
public class TransactionDaoImpl implements ITransactionDao {
    static Connection connection =null;
    @Override
    public User queryOne(Long useraccount) {
        connection = ConnectionUtil.connectSQL();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user1 WHERE useraccount=?");
            preparedStatement.setLong(1, useraccount);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            if (resultSet.next()){
                user = new User();
                user.setUserAccount(useraccount);
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setMoney(new BigDecimal(String.valueOf(resultSet.getBigDecimal("money"))));
            }
//            System.out.println(user.toString());
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUser(User user1, BigDecimal money) {
        connection = ConnectionUtil.connectSQL();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE user1 SET money=? WHERE useraccount=?");
            preparedStatement.setBigDecimal(1, user1.getMoney().add(money));
            preparedStatement.setLong(2, user1.getUserAccount());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

    }
}
