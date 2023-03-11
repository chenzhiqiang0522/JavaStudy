package org.chenzhiqiang.homecode.utils;

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
 * Package：org.chenzhiqiang.homecode
 * Project：JAVA
 * name：Connection
 * Date：2023/3/10
 * Filename：Connection
 */
public class ConnectionUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(new File("src/org/chenzhiqiang/homecode/JDBC.properties"));
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        username = properties.getProperty("jdbc.username");
        password = properties.getProperty("jdbc.password");
    }

    public static Connection databaseConn(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(){

    }
}
