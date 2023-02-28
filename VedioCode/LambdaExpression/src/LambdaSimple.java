import java.util.Arrays;
import java.util.Comparator;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：LambdaSimple
 * Date：2023/2/25
 * Filename：LambdaSimple
 */
public class LambdaSimple {
    public static void main(String[] args) {
        Integer[] arr = {9,5,2,4,8,6,2,1,4,5,6};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        // 使用Lambda表达式
        Arrays.sort(arr, (o1,o2) -> o1-o2);

        System.out.println(Arrays.toString(arr));
    }
}
