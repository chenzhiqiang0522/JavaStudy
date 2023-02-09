package ClassCode;

/**
 * Author：NickWiber(陈志强)
 * Package：ClassCode
 * Project：javaCode
 * name：ReturnCase
 * Date：2023/2/9
 * Filename：ReturnCase
 */
public class ReturnCase {
    public static void main(String[] args) {
        ReturnCase returnCase = new ReturnCase();
        returnCase.outPut();
        String result = returnCase.outString();
        System.out.println(result);
    }

    public void outPut(){
        System.out.println("玛卡巴卡,唔西迪西");
    }

    public String outString(){
        return "this is a return string";
    }
}
