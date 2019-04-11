import java.util.*;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            System.out.println(huadong(s1));
        }
    }
    public static int huadong(String in) {
        int len = in.length();
        int count = len;
        for (int i = 1; i < (len - 1); i++) {
            for (int l = 0; l < i; l++) {
                int r = l + len - i;
                char l_c = in.charAt(l);
                char r_c = in.charAt(r);
                if (l_c == r_c) {
                    // TODO
                    if (huiwen(in, l, r) + (l-0) + (len - 1 - r) < count) {
                        count = huiwen(in, l, r) + (l-0) + (len - 1 - r);
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }
    public static int huiwen(String in, int left, int right) {
        int l = left + 1;
        int r = right - 1;
        int len = in.length();
        int count = 0;
        while ((r-l) >= 2) {
            if (!(in.charAt(l) == in.charAt(r))) {
                count += 2;
            }
            r--;
            l++;
        }
        return count;
    }
}