/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JavaBookCode
 * name：_3
 * Date：2023/2/9
 * Filename：_3
 */

import java.util.Date;

/**
 * 1-20的阶乘倒数和
 * factorial 倒数
 */
public class _3 {
    public static void main(String[] args) {
        _3 variability = new _3();
        variability.factorial();
    }

    public void factorial() {
        Date date = new Date();
        long d1=date.getTime();
        System.out.println(d1);
        double sum = 0;
        int jieChen = 1;
        for (int i = 1; i <= 20; i++) {
            jieChen = 1;
            for (int j = 1; j <= i; j++) {
                jieChen *= j;
            }
            sum+= (1/(double)jieChen);
        }
        long d2 = date.getTime();
        System.out.println(d2-d1);
        System.out.println("1-20阶乘之和是"+sum);
    }
}
