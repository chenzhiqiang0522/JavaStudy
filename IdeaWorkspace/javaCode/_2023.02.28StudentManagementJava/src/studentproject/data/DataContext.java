package studentproject.data;

import studentproject.entity.Admin;
import studentproject.entity.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.data
 * Project：JAVA
 * name：DataContext
 * Date：2023/2/28
 * Filename：DataContext
 */
public class DataContext {
    public static Map<String, Admin> adminMap = new LinkedHashMap<>();
    public static Map<String, Student> stuMap = new HashMap<>();
}
