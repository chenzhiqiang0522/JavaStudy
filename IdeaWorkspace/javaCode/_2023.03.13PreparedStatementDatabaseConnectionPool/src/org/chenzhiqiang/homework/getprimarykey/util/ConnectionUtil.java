package org.chenzhiqiang.homework.getprimarykey.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.util
 * Project：JAVA
 * name：ConnectionUtil
 * Date：2023/3/13
 * Filename：ConnectionUtil
 */
public class ConnectionUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    // 获取数据库连接配置
    static {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("D:\\codeFile\\JAVA\\IdeaWorkspace\\javaCode\\_2023.03.13PreparedStatementDatabaseConnectionPool\\src\\org\\chenzhiqiang\\homework\\JDBC.properties"));
            properties.load(fileInputStream);       // 加载配置文件
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 读取配置信息
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        username = properties.getProperty("jdbc.username");
        password = properties.getProperty("jdbc.password");
    }

    // 创建数据库连接对象
    public static Connection connectSQL(){
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(Connection connection, ResultSet rs, PreparedStatement ps){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (Objects.nonNull(rs)){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
