package org.chengzhiqiang.homework;

import java.util.Random;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.homework
 * Project：JAVA
 * name：CodeTest
 * Date：2023/2/21
 * Filename：CodeTest
 */
public class CodeTest {
    public static void main(String[] args) {
        System.out.println(generateCode1());
        System.out.println(generateCode2());
        System.out.println(generateRandomCode());

    }

    // 设计一个方法 生成6位 随机数 包括 数字和字母
    public static String generateCode1(){
        // 申明一个数组 用于存放 随机的字符
        char[] a = {'A','c','B','g','j','W','2','6','8','7'};
        // 随机的从数组中取6个 拼接好 返回
        String sb = "";
        int i =0;
        Random random = new Random();
        while(i<=6){
            sb += a[random.nextInt(11)];
            i++;
        }
        return sb.toString();
    }
    // 设计一个方法 生成6位 随机数 包括 数字和字母
    public static String generateCode2(){
        Random random = new Random();
        // 申明一个String 用于存放 随机的字符
        String str = "QWERTYUPASDFGHJKLZXCVBNMqwertyupasdfghjkzxcvbnm78945623";
        StringBuffer sb = new StringBuffer();
        // 随机六次
        for (int i = 0; i < 6; i++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }
    public static String generateRandomCode() {
        Random random = new Random();
        StringBuffer randomString = new StringBuffer();
        int flag = 0;
        while (randomString.length() != 6) {
            flag = random.nextInt(2);
            if (flag == 0) {
                randomString.append(random.nextInt(10));
            }
            if (flag == 1) {
                randomString.append((char)(random.nextInt(25)+65));
            }

//            randomString += (char)(random.nextInt(25)+65);


        }
        return randomString.toString();
    }
}
