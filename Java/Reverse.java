import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
    }
    public static String reverseString(String iniString) {
        // write code here
        int len = iniString.length();
        int i= 0;
        int j = len - 1;
        StringBuffer sb = new StringBuffer(iniString);
        while(j - i > 1) {
            char temp = iniString.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}