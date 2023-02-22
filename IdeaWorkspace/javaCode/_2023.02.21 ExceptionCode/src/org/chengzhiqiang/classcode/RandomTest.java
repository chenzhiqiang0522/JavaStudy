package org.chengzhiqiang.classcode;

import java.util.Random;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chengzhiqiang.classcode
 * Project：JAVA
 * name：RandomTest
 * Date：2023/2/21
 * Filename：RandomTest
 */
public class RandomTest {
    public static void main(String[] args) {
        System.out.println(generateRandomCode());
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
