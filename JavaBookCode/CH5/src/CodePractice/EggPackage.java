package CodePractice;

import java.util.Arrays;

/**
 * Author：NickWiber(陈志强)
 * Package：CodePractice
 * Project：JAVA
 * name：EggPackage
 * Date：2023/2/11
 * Filename：EggPackage
 */
public class EggPackage {
    public static void main(String[] args) {
        int[] boxes = new int[10];
        Arrays.fill(boxes, 58);
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("第" + (i + 1) + "箱装了" + boxes[i] + "枚鸡蛋");
        }
    }
}
