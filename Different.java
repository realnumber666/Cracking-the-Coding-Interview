import java.util.*;

public class Different {
    public static void main(String[] args) {
        System.out.println(checkDifferent("acbdbesy"));
    }
    public static boolean checkDifferent(String iniString) {
        // write code here
        // 用一个boolean数组，第i位为true表示这个元素已经出现过
        if (iniString.length() > 65536) return false;
        boolean[] char_set = new boolean[65536];
        for (int i = 0; i < iniString.length(); i++) {
            int val = iniString.charAt(i);
            if (char_set[val] == true) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}