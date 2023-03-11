package org.chenzhiqiang.homecode.component;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homecode.component
 * Project：JAVA
 * name：User
 * Date：2023/3/10
 * Filename：User
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
