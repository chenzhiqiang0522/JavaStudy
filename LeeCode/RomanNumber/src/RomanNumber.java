import java.util.HashMap;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：LeeCode
 * name：RomanNumber
 * Date：2023/2/11
 * Filename：RomanNumber
 */
public class RomanNumber {
    public void romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        char[] charArray = s.toCharArray();
        int num = 0;
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("outIndex",1000000);
        for (int index = charArray.length - 1; index >= 0; index--) {
            int last = index + 1;
            if (last!=charArray.length){
                if (map.get(Character.toString(charArray[index])) >= map.get(last == charArray.length ? "outIndex" : Character.toString(charArray[last]))) {
                    num += map.get(Character.toString(charArray[index]));
                }
                if (map.get(Character.toString(charArray[index])) < map.get(last == charArray.length ? "outIndex" : Character.toString(charArray[last]))) {
                    num -= map.get(Character.toString(charArray[index]));
                }
            }else
                num = map.get(Character.toString(charArray[index]));

        }
        System.out.println(num);
    }
}
