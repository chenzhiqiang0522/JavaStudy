package org.chenzhiqiang.homework;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.enumsamples
 * Project：JAVA
 * name：CheckVip
 * Date：2023/3/6
 * Filename：CheckVip
 */
public class CheckVip {
    public static void main(String[] args) throws NoSuchFieldException, InterruptedException {
        UserVip user = new UserVip();
        Class<? extends UserVip> aClass = user.getClass();
        Field id = aClass.getDeclaredField("id");
        id.setAccessible(true);
        Annotation[] annotations = id.getAnnotations();
        Boolean flag = false;
        for (Annotation a:annotations){
            System.out.println(a.annotationType());
            if (a.annotationType().equals(SelfAnnotation.class)){
                flag = true;
                System.out.println("VIP用户");
            }
        }
        if (!flag){
            Thread.sleep(5000);
        }

        System.out.println("播放视频");

    }
}
