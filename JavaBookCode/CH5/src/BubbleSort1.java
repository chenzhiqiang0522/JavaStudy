import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：BubbleSort1
 * Date：2023/2/11
 * Filename：BubbleSort1
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {55,25,66,47,19,20};
        BubbleSort1 bubbleSort1 = new BubbleSort1();
        System.out.println(Arrays.toString(bubbleSort1.bubbleSort(arr)));
    }

    public int[] bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <array.length-i; j++) {
                if (array[j]>array[j+1]){
                    array[j] = array[j]+array[j+1];
                    array[j+1] = array[j]-array[j+1];
                    array[j] = array[j]-array[j+1];
                }
            }
        }
        return array;
    }
}
