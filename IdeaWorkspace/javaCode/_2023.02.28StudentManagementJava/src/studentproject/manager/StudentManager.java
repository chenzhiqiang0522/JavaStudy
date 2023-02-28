package studentproject.manager;

import studentproject.data.DataContext;
import studentproject.entity.Student;

import java.util.*;


/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.manager
 * Project：JAVA
 * name：StudentManager
 * Date：2023/2/28
 * Filename：StudentManager
 */
public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    public void initStudentData(){
        for (int i = 0; i < 5; i++) {
            DataContext.stuMap.put("2023"+(i+1), new Student("2023"+(i+1),
                    "nick"+(i+1),
                    i%2==0? false:true,
                    "1998202522"+(i+1),
                "中国四川")
                    );
        }
    }

    // 删除学生信息
    public void delStudentInfo() throws InterruptedException {
        System.out.println("请输入要删除信息的学生ID");
        String stuId = scanner.next();
        if (search(stuId)){
            DataContext.stuMap.remove(stuId);
            System.out.println("删除成功，5秒后电脑将爆炸");
            Thread.sleep(5000);
            showAllStudent();
            MenuManager.showMenu();
        }else {
            System.out.println("删除失败，请添加该生信息！");
            MenuManager.showMenu();
        }
    }

    // 添加学生信息
    public void addStudentData() throws InterruptedException {
        Timer timer = new Timer();
        System.out.println("请输入要添加学生的学号:");
        String stuAccount = scanner.next();
        if (search(stuAccount)){
            System.out.println("该学号已经存在，请查证后再次输入");
            MenuManager.showMenu();
        }else {
            inputStudentInfo(stuAccount);       // 输入学生信息并添加到Map中
            System.out.println("添加成功，5秒后将打印新的学生信息");
            Thread.sleep(5000);
            System.out.println(DataContext.stuMap.get(stuAccount));
            MenuManager.showMenu();
        }
    }

    // 输入学生信息
    public void inputStudentInfo(String stuId){
        String idNew = stuId;
        System.out.println("请输入新的学生姓名");
        String nameNew = scanner.next();
        System.out.println("请输入新的学生性别");
        Boolean genderNew = scanner.nextBoolean();
        System.out.println("请输入新的学生电话");
        String telNumberNew = scanner.next();
        System.out.println("请输入新的学生地址");
        String addNew = scanner.next();
        DataContext.stuMap.put(stuId, new Student(idNew,
                nameNew,
                genderNew,
                telNumberNew,
                addNew));
        System.out.println(DataContext.stuMap.get(stuId));
    }

    // 显示所有学生信息
    public void showAllStudent(){
        System.out.println("----------------------全部学生信息----------------------------");
        Collection<Student> studentInfo = DataContext.stuMap.values();
        Iterator<Student> stuIterator = studentInfo.iterator();
        while (stuIterator.hasNext()) {
            Student student = stuIterator.next();
            System.out.println(student);
        }
    }

    // 查询学生
    public void searchOneStudent(){
        System.out.println("请输入查询学生学号:");
        String input = scanner.next();
        if (search(input))
            System.out.println(DataContext.stuMap.get(input));
        else
            System.out.println("没有该学生对应的信息，请查证后再次输入。");
    }

    // 查询学生信息
    public boolean search(String stuId){
        if (DataContext.stuMap.containsKey(stuId)){
            return true;
        }else{
            return false;
        }
    }

    // 修改指定学生
    public void modifyStudentInfo(){
        System.out.print("请输入要修改学生的学号");
        String stuAccount = scanner.next();
        if (search(stuAccount)){
            inputStudentInfo(stuAccount);
        }
        else{
            System.out.println("学生账号有误");
        }
    }

}
