package org.chenzhiqiang.homework;

import java.util.Arrays;
import java.util.Locale;

/**
 * Author：NickWiber(陈志强)
 * Package：org.chenzhiqiang.homework
 * Project：JAVA
 * name：StringMethod
 * Date：2023/2/20
 * Filename：StringMethod
 */
public class StringMethod {
    public static void main(String[] args) {
        // 用方法：
        // 1.char charAt(int index) 返回 char指定索引处的字符。 不能超过下标范围
        String str = "我qunianmailegebiao";
        System.out.println(str.charAt(5));

        // 2.String concat(String str) 将指定的字符串连接到该字符串的末尾。 相当于：+
        String str2 = "abc";
        System.out.println(str2.concat("111111"));

        /*
         * 3.boolean contains(CharSequence s) 判断当前对象是否包含连续的参数s。s可以是以下三个子类的对象
         * CharSequence接口，包含下面子类：String、StringBuffer、StringBuilder
         */
        //判断当前对象str是否包含连续的参数abc
        String str3 = "aabbccddeeffgg";
        System.out.println(str3.contains("ff"));
        // 4.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。（参数必须连续）
        System.out.println(str3.startsWith("aa"));
        System.out.println(str3.startsWith("ab"));
        // 5.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。  （参数必须连续）
        System.out.println(str3.endsWith("gg"));
        System.out.println(str3.endsWith("gh"));
        /*
         * 8.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
         * srcBegin：字符串开始下标
         * srcEnd：字符串结束下标(不包含)
         * dstBegin：数组dst的下标
         * 将此字符串中的字符复制到目标字符数组dst中。  (含头不含尾)[srcBegin,srcEnd)
         */
        // 将字符串str中下标2开始到6结束【不包含6】的字符复制到数组dst中，从数组的下标1开始粘贴
        char[] c = new char[20];
        str3.getChars(2, 6, c, 2);
        System.out.println(str3);
        System.out.println(Arrays.toString(c));
        // 9.int indexOf(String s) 返回s第一次在当前对象str中出现的索引 ，-1表示没有找到（注意：这里s必须也是匹配连续的字符串）
        String str9 = "sdkghfhjdfsghjkdgsfjkashdfglaksdufg";
        System.out.println(str9.indexOf("h"));
        System.out.println(str9.indexOf("fjk"));
        // 10.int indexOf(String s, int fromIndex) 返回s在当前对象指定下标fromIndex后第一次出现的索引  (str是作为一个整体匹配下标的)
        System.out.println(str9.indexOf("a", 5));
        // 11.int lastIndexOf(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        System.out.println(str9.lastIndexOf("g"));
        // 12.int lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向前搜索。
        System.out.println(str9.lastIndexOf("as"));
        // 13.boolean isEmpty() 当 length()为 0时，返回 true 。
        String str13 = "";
        System.out.println(str13.isEmpty() ? "字符串是空的" : "字符串不是空的");
        // 14.int length() 返回此字符串的长度。
        System.out.println(str9.length());
        /*
         * 16.String replace(CharSequence target, CharSequence replacement)   将当前字符串中的target替换为replacement,通常用来和谐用语
         * 父接口：CharSequence
         *			该接口的实现类：String、StringBuffer、StringBuilder
         */
        String str16 = "WQNMLGB，你个DSB，我CNM";// WQNMLGB/DSB/CNM：和谐用语
        System.out.println(str16.replace("WQNMLGB","******").replace("DSB", "*******").replace("CNM","*******"));
        /*
         * replace()和replaceAll()，replaceFirst()区别
         * replace()只能匹配String、StringBuffer、StringBuilder对象
         * replaceAll()和replaceFirst()可以匹配正则表达式，更灵活
         * 如：
         */

        // 18.String replaceFirst(String regex, String replacement)  将当前字符串中的第一个regex替换为replacement
        String str18 = "ddddddXXXXdddddddd";
        System.out.println(str18.replaceFirst("dddddd", "aaaaa"));
        // 19.String[] split(String regex)  将当前字符串对象按照给定的正则表达式regex分割为String[]
        String str19 = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        // 20.CharSequence subSequence(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
        System.out.println(str18.substring(0, 7));
        // 21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
        System.out.println(str18.substring(5));
        String str20 = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        // 请将字符串中ip是172开头的 最后一段打印出来
        /*
            1. 使用 ；对 str 进行分割
            2. 遍历数据
            3. 判断开头
         */
        String[] split = str20.split(";");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith("172"))
                System.out.println(split[i]);
        }

        // 23.char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
        String str23 = "abc";
        System.out.println(str23.toCharArray());
        // 24.String toUpperCase() 将此字符转换为全大写	一般用于验证码
        String s24 = "ahjgsdfHHHHHHHHjhgkasdf";
        System.out.println(s24.toLowerCase());
        // 25.String toLowerCase() 将此字符转换为全小写	一般用于验证码
        System.out.println(s24.toUpperCase());

        // 26.String trim() 将当前字符串对象中字符前面和后面的空格去除	用了避免用户的一些不当输入
        String str26 = "		asdlkjfal		jfdaklfj 		dsalkj		";
        System.out.println(str26);
        System.out.println(str26.trim());

        // 27.static String valueOf(Object obj) 将其他类型转换为String对象
        // 这里其实是1的包装类Integer
    }
}
