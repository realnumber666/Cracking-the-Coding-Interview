import java.util.*;

public class Replacement {
    public static void main(String[] args) {
        System.out.println(replaceSpace("a b", 3));
    }
    public static String replaceSpace(String iniString, int length) {
        // write code here
        // 从最后一位开始把子字符串向后移动再插入
        int space = 0;
        for (int i = 0; i < length; i++) {
            if (iniString.charAt(i) == ' ') {
                space++;
            }
        }
        int newlen = length + space*2;
        System.out.println(newlen);
        char[] s_array = new char[newlen];
        // ArrayList<String> s_array = new ArrayList<String>(newlen);
        System.out.println(s_array.length);
        for(int j = length - 1; j >= 0; j--) {
            if (iniString.charAt(j) == ' '){
                s_array[newlen-1] = '0';
                s_array[newlen-2] = '2';
                s_array[newlen-3] = '%';
                newlen -= 3;
            } else {
                System.out.println("im in---");
                s_array[newlen-1] = iniString.charAt(j);                
                newlen--;
            }
        }
        return new String(s_array);
    }
}