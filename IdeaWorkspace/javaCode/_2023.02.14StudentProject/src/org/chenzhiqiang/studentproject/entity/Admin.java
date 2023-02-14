package org.chenzhiqiang.studentproject.entity;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.studentproject.entity
 * Project：JAVA
 * name：Admin
 * Date：2023/2/14
 * Filename：Admin
 */
public class Admin {
    private String adminAccount;
    private String adminPassword;

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Admin(String adminAccount, String adminPassword) {
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
    }

    public Admin(String adminAccount) {
        this(adminAccount,"0000");
    }

    public Admin() {
    }
}
