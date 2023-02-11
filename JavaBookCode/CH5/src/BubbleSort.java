import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：CodePractice
 * Project：JAVA
 * name：BubbleSort
 * Date：2023/2/11
 * Filename：BubbleSort
 */
/*
    冒泡算法
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]>array[j+1]){           // 使用异或交换位置
                    array[j] = array[j]^array[j+1];
                    array[j+1] = array[j]^array[j+1];
                    array[j] = array[j]^array[j+1];
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {9,8,6,1,4,10,15,21,2,7};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(array)));
    }
}
