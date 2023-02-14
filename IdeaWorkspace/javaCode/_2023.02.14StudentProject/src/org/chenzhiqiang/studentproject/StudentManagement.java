package org.chenzhiqiang.studentproject;

import org.chenzhiqiang.studentproject.entity.Admin;
import org.chenzhiqiang.studentproject.entity.Student;

import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.studentproject.entity
 * Project：JAVA
 * name：StudentManagement
 * Date：2023/2/14
 * Filename：StudentManagement
 */
public class StudentManagement {
    private static Scanner scanner = new Scanner(System.in);
    private boolean identity = true;
    private static Admin[] administrator = new Admin[5];
    private static Student[] student = new Student[20];
    public static int stuNum = 0;
    public static boolean flag = false;

    public static void main(String[] args) {
        initAdmin();
        if (login()) {
            initStudent();
            showMeume();
        } else {
            System.exit(0);
        }
    }

    private static void initStudent() {
        for (int i = 0; i < 5; i++) {
            student[i] = new Student("202302" + i, "Nick" + i, i % 2 == 0 ? true : false, "1338080707" + i, "中国四川成都");
            stuNum++;
        }
    }

    public static void initAdmin() {
        administrator[0] = new Admin("Nick");
        administrator[1] = new Admin("Jack");
        administrator[2] = new Admin("Tom");
        administrator[3] = new Admin("Jerry");
        administrator[4] = new Admin("Machel");
    }

    public static void showMeume() {
        System.out.println("-----------------------------------------------");
        System.out.println("1. 查询所有学生");
        System.out.println("2. 查询指定学生");
        System.out.println("3. 新增学生");
        System.out.println("4. 修改学生");
        System.out.println("5. 删除学生");
        System.out.println("6. 退出系统");
        System.out.println("-----------------------------------------------");
        System.out.println("请输入您要操作的菜单编号：");
        int chooseNum = scanner.nextInt();
        switch (chooseNum) {
            case 1:
                // 1. 查询所有学生
                queryAll();
                break;
            case 2:
                // 2. 查询指定学生
                queryOne();
                break;
            case 3:
                // 3. 新增学生
                addStudent();
                break;
            case 4:
                // 4. 修改学生
                modifyStudent();
                break;
            case 5:
                // 5. 删除学生
                delStudent();
                break;
            case 6:
                System.out.println("感谢使用本系统！");
                System.exit(0);
                break;
            default:
                System.out.println("您的输入不和法，请重新输入");

        }

    }

    public static void delStudent() {       // 删除学生信息
        flag = false;
        int i=0;
        System.out.print("请输入要修改的学生账号/学号:");
        String stuAccount = scanner.next();
        for (; i < stuNum; i++) {
            if (student[i].getStuAccount().equals(stuAccount.trim())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("系统中没有该学生，请先添加该学生相关信息！");
            return;
        }else{
            for (;i<stuNum;i++){       // 后面的学生信息向前移动
                student[i] = student[i+1];
            }
            student[stuNum-1] = null;
            stuNum -= 1;
            queryAll();
        }
    }

    private static void modifyStudent() {
        flag = false;
        int i = 0;
        System.out.print("请输入要修改的学生账号/学号:");
        String stuAccount = scanner.next();
        for (i = 0; i < stuNum; i++) {
            if (student[i].getStuAccount().equals(stuAccount.trim())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // 当前信息
            System.out.println("修改前信息如下:");
            System.out.print("登录账号" + "\t");
            System.out.print("姓名" + "\t" + "\t");
            System.out.print("电话" + "\t" + "\t" + "\t");
            System.out.print("性别" + "\t");
            System.out.println("籍贯");
            System.out.println("-----------------------------------------------");
            System.out.print(student[i].getStuAccount() + "\t");
            System.out.print(student[i].getStuName() + "\t");
            System.out.print(student[i].getStuTel() + "\t");
            System.out.print((student[i].isStuGender() ? "男生" : "女生") + "\t");
            System.out.println(student[i].getStuAddress());
            System.out.println("-----------------------------------------------");
            // 修改信息
            System.out.print("请输入要添加的姓名:");
            String stuName = scanner.next();
            student[i].setStuName(stuName);
            System.out.print("请输入要添加的性别:");
            boolean stuGender = scanner.nextBoolean();
            student[i].setStuGender(stuGender);
            System.out.print("请输入要添加的电话:");
            String stuTel = scanner.next();
            student[i].setStuTel(stuTel);
            System.out.print("请输入要添加的籍贯:");
            String stuAddress = scanner.next();
            student[i].setStuAddress(stuAddress);
            // 修改后的信息
            System.out.println("修改后信息如下:");
            System.out.print("登录账号" + "\t");
            System.out.print("姓名" + "\t" + "\t");
            System.out.print("电话" + "\t" + "\t" + "\t");
            System.out.print("性别" + "\t");
            System.out.println("籍贯");
            System.out.println("-----------------------------------------------");
            System.out.print(student[i].getStuAccount() + "\t");
            System.out.print(student[i].getStuName() + "\t");
            System.out.print(student[i].getStuTel() + "\t");
            System.out.print((student[i].isStuGender() ? "男生" : "女生") + "\t");
            System.out.println(student[i].getStuAddress());
        }
    }

    private static void addStudent() {
        flag = false;
        System.out.print("请输入要添加的学生账号/学号:");
        String stuAccount = scanner.next();
        for (int i = 0; i < stuNum; i++) {
            if (student[i].getStuAccount().equals(stuAccount.trim())){
                System.out.println("您所要添加的学生已经存在！！！");
                flag=true;
                break;
            }
        }
        if (stuNum==20){
            System.out.println("人数已满，请联系管理员扩容！！！！");
            return;
        }
        if(!flag) {
            System.out.print("请输入要添加的姓名:");
            String stuName = scanner.next();
            System.out.print("请输入要添加的性别:");
            boolean stuGender = scanner.nextBoolean();
            System.out.print("请输入要添加的电话:");
            String stuTel = scanner.next();
            System.out.print("请输入要添加的籍贯:");
            String stuAddress = scanner.next();
            student[stuNum++] = new Student(stuAccount, stuName, stuGender, stuTel, stuAddress);
            queryAll();
        }
    }

    private static void queryOne() {
        flag = false;
        System.out.print("请输入要查询的学生账号:");
        String stuAccount = scanner.next();
        for (int i = 0; i < stuNum; i++) {
            if (student[i].getStuAccount().equals(stuAccount)) {
                System.out.print("登录账号" + "\t");
                System.out.print("姓名" + "\t" + "\t");
                System.out.print("电话" + "\t" + "\t" + "\t");
                System.out.print("性别" + "\t");
                System.out.println("籍贯");
                System.out.println("-----------------------------------------------");
                System.out.print(student[i].getStuAccount() + "\t");
                System.out.print(student[i].getStuName() + "\t");
                System.out.print(student[i].getStuTel() + "\t");
                System.out.print((student[i].isStuGender() ? "男生" : "女生") + "\t");
                System.out.println(student[i].getStuAddress());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("你输入的学生账号有误，请确认！！！");
        }
        showMeume();
    }

    private static void queryAll() {
        System.out.print("登录账号" + "\t");
        System.out.print("姓名" + "\t" + "\t");
        System.out.print("电话" + "\t" + "\t" + "\t");
        System.out.print("性别" + "\t");
        System.out.println("籍贯");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < stuNum; i++) {
            System.out.print(student[i].getStuAccount() + "\t");
            System.out.print(student[i].getStuName() + "\t");
            System.out.print(student[i].getStuTel() + "\t");
            System.out.print((student[i].isStuGender() ? "男生" : "女生") + "\t");
            System.out.println(student[i].getStuAddress());
        }
    }

    public static boolean login() {
        System.out.print("请输入登录账号: ");
        String adminAccount = scanner.next();
        System.out.print("请输入登录密码: ");
        String adminPassword = scanner.next();
        for (Admin e : administrator) {
            if (e.getAdminAccount().equals(adminAccount.trim()) && e.getAdminPassword().equals(adminPassword.trim())) {
                System.out.println("欢迎使用学生管理系统！");
                return true;
            }
        }
        System.out.println("密码或者账号错误，登录失败");
        return false;
    }
}