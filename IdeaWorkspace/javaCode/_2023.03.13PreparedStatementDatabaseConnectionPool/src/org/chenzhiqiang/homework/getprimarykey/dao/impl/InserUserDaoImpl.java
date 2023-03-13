package org.chenzhiqiang.homework.getprimarykey.dao.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.chenzhiqiang.homework.getprimarykey.dao.IInserUserDao;
import org.chenzhiqiang.homework.getprimarykey.demain.User;
import org.chenzhiqiang.homework.getprimarykey.util.ConnectionUtil;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.getprimarykey.dao.impl
 * Project：JAVA
 * name：InserUserDaoImpl
 * Date：2023/3/13
 * Filename：InserUserDaoImpl
 */
public class InserUserDaoImpl implements IInserUserDao {
    static Connection connection = null;
    @Override
    public User queryById(Long useraccount) {
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
    public void inserUser(User user) {
        connection = ConnectionUtil.connectSQL();
        ResultSet generatedKeys = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement= connection.prepareStatement("INSERT INTO user1(username,password,money) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, DigestUtils.md5Hex(user.getPassword()));     // 对密码进行md5加密
            preparedStatement.setBigDecimal(3, user.getMoney());
            preparedStatement.execute();
            generatedKeys= preparedStatement.getGeneratedKeys();
            while(generatedKeys.next()){
                System.out.println(generatedKeys.getLong(1));   // 获取id
                // System.out.println(generatedKeys.getLong("useraccount"));
            }
            System.out.println("添加成功！");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
          ConnectionUtil.closeConnection(connection, generatedKeys, preparedStatement);
        }

    }
}
