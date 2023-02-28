package studentproject.entity;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.entity
 * Project：JAVA
 * name：Admin
 * Date：2023/2/28
 * Filename：Admin
 */
public class Admin {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
