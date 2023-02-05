package _20230203; /**
 * 注释：解释说明，用于帮助程序员理解代码
 * Java中有三种注释
 * 单行注释：使用双斜杠，用于解释少量代码
 * 多行注释：使用斜杠星开头，星斜杠结尾，内容写中间
 * 文档注释：使用斜杠星星开头，星斜杠结尾，中间写内容
 * */

/**
 * 此处为文档注释，一般写在，类和方法的上面
 * 用于解释该类的作用
 * */
public class Annotate1 {
    public static void main(String[] args) {
        // 下面这个代码是用于在控制台输出HelloWorld，单行注释
        System.out.println("HelloWorld");

        /*
             下面这个代码是用于在控制台输出HelloWorld，多行注释
        */
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");

        /*
         * 注释的细节：
         *      1. 单行注释可以嵌套或者被嵌套在多行注释和文档注释中
         *      2. 多行注释和文档注释不能相互嵌套，无法准确定位注释的结尾
         *      3. 一般来说文档注释是用来解释类和方法的作用的
         *      4. 多行注释和单行注释是用于解释代码的
         */
    }
}
