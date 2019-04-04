import java.util.*;

public class Different {
    public static void main(String[] args) {
        System.out.println(checkDifferent("acbdbesy"));
    }
    public static boolean checkDifferent(String iniString) {
        // write code here
        if (iniString.length() > 256) return false;
        boolean[] char_set = new boolean[256];
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