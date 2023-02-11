import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：SelectSort
 * Date：2023/2/11
 * Filename：SelectSort
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {63,4,1,3,15,24};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(array);
        System.out.println(Arrays.toString(array));
    }
    public int[] selectSort(int[] array){
        int maxIndex = 0;   // 数组中最大的元素的下标
        for (int i = 1; i < array.length; i++) {
            maxIndex = 0;
            for (int j = 1; j <array.length-i; j++){
                if (array[j]>array[maxIndex])
                    maxIndex = j;
            }
            // 将最大元素放到数列最后
            array[maxIndex] = array[maxIndex]+array[array.length - i];
            array[array.length - i] = array[maxIndex]-array[array.length - i];
            array[maxIndex] = array[maxIndex]-array[array.length - i];
        }
        return array;
    }
}
