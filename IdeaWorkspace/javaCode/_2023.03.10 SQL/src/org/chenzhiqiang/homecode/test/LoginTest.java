package org.chenzhiqiang.homecode.test;

import org.chenzhiqiang.homecode.component.User;
import org.chenzhiqiang.homecode.selfDefineException.VertifyException;
import org.chenzhiqiang.homecode.utils.ConnectionUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homecode
 * Project：JAVA
 * name：LoginTest
 * Date：2023/3/10
 * Filename：LoginTest
 */
public class LoginTest {
    @Test
    public void login() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet =null;
        Scanner scanner = new Scanner(System.in);
        try {
            connection = ConnectionUtils.databaseConn();
            System.out.println(connection);
            System.out.print("登录用户账号:");
            String usernameInput = scanner.next();
            System.out.print("用户密码:");
            String password = scanner.next();
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from user1 where useraccount=".concat(usernameInput).concat(";");
            if (Objects.isNull(usernameInput))
                System.out.println("用户名为空");
            if (Objects.isNull(password))
                System.out.println("密码为空");
            resultSet = statement.executeQuery(sql);
            User user = new User();
            System.out.println(resultSet.toString());
            resultSet.last();
            int row = resultSet.getRow();
            System.out.println(row);
            if (row>0? true:false){
                resultSet.first();
//                while (resultSet.next()) {
//                    user.setPassword(resultSet.getString("password"));
//                }
                user.setPassword(resultSet.getString("password"));
                if (!(user.getPassword().equals(password))){
                    System.out.println("密码错误");
                    throw new VertifyException("校验异常!!!");
                }
            }else {
                System.out.println("该用户不存在！！！！！！");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (VertifyException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
