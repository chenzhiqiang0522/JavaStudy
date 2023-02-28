package studentproject;

import studentproject.data.DataContext;
import studentproject.manager.AdminManager;
import studentproject.manager.MenuManager;
import studentproject.manager.StudentManager;

import java.util.Map;
import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject
 * Project：JAVA
 * name：StudengManageSystem
 * Date：2023/2/28
 * Filename：StudengManageSystem
 */
public class StudentManageSystem {
    public static StudentManager studentManager = new StudentManager();
    public static AdminManager adminManager = new AdminManager();
    public static void main(String[] args) throws InterruptedException {
        adminManager.initAdminData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入管理员账号");
        String adminAccount = scanner.next();
        System.out.print("请输入管理员密码");
        String adminPassword = scanner.next();
        if (DataContext.adminMap.containsKey(adminAccount)){
            if (DataContext.adminMap.get(adminAccount).getPassword().equals(adminPassword)){
                System.out.println("登录成功!!!!!");
                studentManager.initStudentData();
                MenuManager.showMenu();
            }else {
                System.out.println("登录失败");
                System.exit(0);
            }
        }else {
            System.out.println("没有该管理员，请联系管理员添加");
        }
    }

}
