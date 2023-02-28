package studentproject.manager;

import studentproject.data.DataContext;
import studentproject.entity.Admin;

/**
 * Author：NickWiber(陈志强)
 * Package：studentproject.manager
 * Project：JAVA
 * name：AdminManager
 * Date：2023/2/28
 * Filename：AdminManager
 */
public class AdminManager {
    public void initAdminData(){
        DataContext.adminMap.put("admin"+1, new Admin("nick1","123456789"));
        DataContext.adminMap.put("admin"+2, new Admin("nick2","123456789"));
        DataContext.adminMap.put("admin"+3, new Admin("nick3","123456789"));
        DataContext.adminMap.put("admin"+4, new Admin("nick4","123456789"));
    }
}
