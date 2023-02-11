import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：TwoDimensionalArray
 * Date：2023/2/11
 * Filename：TwoDimensionalArray
 */

/**
 * 遍历数组
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        for(int[] e:arr){
            System.out.println(Arrays.toString(e));
        }
        System.out.println("---------------------------------");
        for(int[] e:arr){
            for(int e1:e)
                System.out.print(e1);
        }

    }
}
