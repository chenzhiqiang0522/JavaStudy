package studentproject.manager;

import studentproject.StudentManageSystem;

import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.manager
 * Project：JAVA
 * name：MenuManager
 * Date：2023/2/28
 * Filename：MenuManager
 */
public class MenuManager {
    public static void showMenu() throws InterruptedException {
        System.out.println("------------------------------------------------");
        System.out.println("1. 查询所有学员");
        System.out.println("2. 查询指定学员");
        System.out.println("3. 修改指定学员");
        System.out.println("4. 添加学员");
        System.out.println("5. 删除学员");
        System.out.println("6. 退出系统");
        System.out.println("------------------------------------------------");
        System.out.println("请输入您要选择的功能:");
        Scanner scanner = new Scanner(System.in);
        Integer inputNum = scanner.nextInt();
        switch (inputNum) {
            case 1:
                StudentManageSystem.studentManager.showAllStudent();
                MenuManager.showMenu();
                break;
            case 2:
                StudentManageSystem.studentManager.searchOneStudent();
                MenuManager.showMenu();
                break;
            case 3:
                StudentManageSystem.studentManager.modifyStudentInfo();
                MenuManager.showMenu();
                break;
            case 4:
                StudentManageSystem.studentManager.addStudentData();
                break;
            case 5:
                StudentManageSystem.studentManager.delStudentInfo();
                break;
            case 6:
                System.out.print("欢迎下次使用!!!!!");
                System.exit(0);
                break;
            default:
                System.out.println("你的输入不合法，请重新输入:");
                showMenu();
        }
    }
}
