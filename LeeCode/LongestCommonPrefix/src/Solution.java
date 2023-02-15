/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：LeeCode
 * name：Solution
 * Date：2023/2/15
 * Filename：Solution
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 查找数组中的最短的字符串
        int minLength = strs[0].length();
        int minLengthIndex = 0;     // 最短字符串的索引
        boolean flag = true;
        String curPrefix = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()< minLength){
                minLength = strs[i].length();
                minLengthIndex = i;
            }
        }
        label:for (int j =0;j<strs[minLengthIndex].length();j++){
            curPrefix = strs[minLengthIndex].substring(0,j+1);
            for (int i = 0; i <strs.length; i++){
                if (strs[i].substring(0,j+1).equals(curPrefix))
                    ;
                else {
                    flag = false;
                    break label;
                }
            }
        }
        if (curPrefix.length()>0)
            return curPrefix.substring(0,curPrefix.length()-1);
        else
            return "";

    }
}
