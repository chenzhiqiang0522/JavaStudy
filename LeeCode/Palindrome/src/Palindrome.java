/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：LeeCode
 * name：Palindrome
 * Date：2023/2/10
 * Filename：Palindrome
 */


/**
 * 判断回文
 */
public class Palindrome {
    public static void main(String[] args) {
//        Solution solution = new Solution();
        //solution.isPalindrome(112211);
        Solution2 solution = new Solution2();
        boolean result = solution.isPalindrome(131);
        System.out.println(result);
    }
}
