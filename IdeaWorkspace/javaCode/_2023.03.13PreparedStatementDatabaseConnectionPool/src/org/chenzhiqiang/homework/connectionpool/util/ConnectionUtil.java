package org.chenzhiqiang.homework.connectionpool.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    // 创建数据库连接对象
    public static Connection connectSQL(){
        try {
            HikariConfig hikariConfig = new HikariConfig();
            hikariConfig.setDriverClassName(driver);
            hikariConfig.setUsername(username);
            hikariConfig.setPassword(password);
            hikariConfig.setJdbcUrl(url);
            hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
            HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
            Connection connection = hikariDataSource.getConnection();
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(){

    }
}
