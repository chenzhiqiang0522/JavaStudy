package org.chenzhiqiang.homework.connectionpool.demain;

import java.math.BigDecimal;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.preparestatement.demain
 * Project：JAVA
 * name：User
 * Date：2023/3/13
 * Filename：User
 */
public class User {
    private String username;
    private String password;
    private Long userAccount;
    private BigDecimal money;

    @Override
    public String toString() {
        return "User{" + "userAccount=" + userAccount +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }

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

    public Long getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Long userAccount) {
        this.userAccount = userAccount;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public User() {
    }

    public User(String username, String password, Long userAccount, BigDecimal money) {
        this.username = username;
        this.password = password;
        this.userAccount = userAccount;
        this.money = money;
    }
}
