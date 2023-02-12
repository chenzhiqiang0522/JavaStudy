import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：SelectSort1
 * Date：2023/2/12
 * Filename：SelectSort1
 */
public class SelectSort1 {
    public static void main(String[] args) {
        int[] arr = {55,25,66,47,19,20};
        SelectSort1 selectSort1 = new SelectSort1();
        selectSort1.selectSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public int[] selectSort1(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            max = 0;
            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] > array[max])
                    max = j;
            }
            int temp = array[max];
            array[max] = array[array.length-i];
            array[array.length - i] = temp;
        }
        return  array;
    }
}
