import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：PACKAGE_NAME
 * Project：JAVA
 * name：ReverseSort
 * Date：2023/2/12
 * Filename：ReverseSort
 */

/*
    反转排序，将整个数组逆序输出
 */
public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("原数组是:"+ Arrays.toString(array));
        ReverseSort reverseSort = new ReverseSort();
        reverseSort.reverseSort(array);
        System.out.println("反转排序后的数组为:"+Arrays.toString(array));
    }

    public int[] reverseSort(int[] array){
        for (int i= 0,j=array.length-1;i< array.length&&j>=0&&i<j;i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
