package org.chenzhiqiang.classcode;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang
 * Project：JAVA
 * name：JDBCTest
 * Date：2023/3/10
 * Filename：JDBCTest
 */

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;

/**
 *
 */
public class JDBCTest {

    @Test
   public void sqlTest(){
        Connection connection = null;
        LocalDateTime now = LocalDateTime.now();
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");     // 加载JDBC驱动
            connection = DriverManager.getConnection("jdbc:mysql:///my","root","123456");   // 设置连接参数
            statement = connection.createStatement(); // 创建statement对象
            String sql = "UPDATE product_stock SET last_income_date=? WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,now);
            preparedStatement.setObject(2, 1);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
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
