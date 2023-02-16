package org.chenzhiqiang.homework.polymorphyic;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework.polymorphyic
 * Project：JAVA
 * name：MotherBoardTest
 * Date：2023/2/16
 * Filename：MotherBoardTest
 */
public class MotherBoardTest {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();
        motherBoard.plugin(new HPTyper());
        System.out.println("-------------------------");
        motherBoard.plugin(new SumsungTyper());
    }
}
