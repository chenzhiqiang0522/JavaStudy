/**
*Author：NickWiber(陈志强)
*Package：PACKAGE_NAME
*Project：LeeCode
*name：Solution2
*Date：2023/2/10
*Filename：Solution2
*/

/**
 * 官方答案
 */
public class Solution2 {
    public boolean isPalindrome(int x) {
        // 如果能被10整除，则必定不是回文
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = (revertedNumber * 10) + (x % 10);
            x /= 10;
        }
        return revertedNumber == x || revertedNumber / 10 == x;
    }
}
