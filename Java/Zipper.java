import java.util.*;

public class Zipper {
    public static void main(String[] args) {
        System.out.println(zipString("jjjjjjxxxxxxxooZLLLLLLLLQQQQQQQQQLLLLLLLLECXXXXXXXIIIIIIIIIhjjyyySSooooooooommmuuEEEEEEEEEnnnnnnnffffffAAAAAllllllllbbbbkkkkkkkkkkkkKKKKKKhhhhhhhhhooooooooooYCCCCCCOOOOOOOOOMMMMMMMMMMiiiiiivvvvvvvWWWWkkkkkkwwwwwwwMmmmmmmmmLLLwwwwwwwkkkjjjjjjttttQQQQQQQQQaaaaaaaFFFFFFFlllllllllggggggggggPPPPPPuuuuuuuuaYYYYYYwQQQFFFFFFFFFFaaaaapXXXXXXXxxxxxxQQQQQQQQQsssssGGGGfffffffddddddpppQQQQQQHHHTTTaaaaaaGGGGGGddyyyyyMhhllllllllllNNNNNNNNUUUWWWWWWLLLLLLLLLYYYYYYYYYYTTKKKKKKKKiiiiiiitttttttXXXXXXXXXLLLHZZZZZZZssssjjJJJEEEEEOOOOOttttttttttBBttttttTTTTTTTTTTrrrrttttRRRRRyyooooooaaaaaaaaarrrrrrrPPPPPPPjjPPPPddddddddddHHHHnnnnnnnnnnSSSSSSSSSSzzHHHHHHHHHddddddDDDzzzhhhhhfffffffffftttttteeeeeeeeEEEEEEEEEaaaaaaccccccccccFFFFFFFF"));
    }
    public static String zipString(String iniString) {
        // write code here
        // 用一个sb放新的字符串，遍历输入
        // !!!! int->char时，如果是个位数的int，可以用(char) n+48强转，但超过9的数字会被匹配到别的ASCII码
        // !!!! String一定记得要用.equals()来比较，==是地址比较
        int len = iniString.length();
        int count = 1;
        String temp = String.valueOf(iniString.charAt(0));
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < len; i++) {
            String now = String.valueOf(iniString.charAt(i));
            if (now.equals(temp)) {
                count++;
            } else {
                sb.append(temp);
                sb.append(String.valueOf(count));
                count = 1;
            }
            temp = String.valueOf(iniString.charAt(i));
        }
        sb.append(temp);
        sb.append(String.valueOf(count)); // 因为int->char时，int会被作为ASCII码编号，而在ASCII码中，48开始为数字
        if (sb.length() < len) {
            return sb.toString();
        } else {
            return iniString;
        }
    }
}