package third;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Author：NickWiber(陈志强)
 * Package：third
 * Project：JAVA
 * name：ExistNum
 * Date：2023/3/7
 * Filename：ExistNum
 */
public class ExistNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一串字符串:");
        String input = scanner.next().toUpperCase();
        String origin = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))){
                Integer tempNum = map.get(input.charAt(i));
                map.put(input.charAt(i),++tempNum);
            }else {
                map.put(input.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
