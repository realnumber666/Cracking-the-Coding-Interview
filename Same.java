import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        // 一个整型数组，第i位代表一个字母出现几次
        // 如果两个字符串长度不相等则直接false
        int lenA = stringA.length();
        int lenB = stringB.length();
        if (lenA != lenB) {
            return false;
        }
        int[] char_setA = new int[256];
        int[] char_setB = new int[256];
        for (int j = 0; j < lenA; j++) {
            int a = stringA.charAt(j);
            int b = stringB.charAt(j);
            char_setA[a] += 1;
            char_setB[b] += 1;            
        }
        for (int i = 0;i < 256; i++) {
            if (char_setA[i] != char_setB[i]) {
                return false;
            }
        }
        return true;
    }
}