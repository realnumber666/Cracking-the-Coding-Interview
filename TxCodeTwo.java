import java.util.*;
public class TxCodeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.hasNext();
        int n = sc.nextInt();
        String s = sc.next();
        Stack<Character> st = new Stack<Character> ();
        Character c = Character.valueOf(s.charAt(0));
        st.push(c);
        for (int i = 1; i < n; i++) {
            c = Character.valueOf(s.charAt(i));
            if (st.empty() || c.equals(st.peek())) {
                st.push(c);
            } else {
                st.pop();
            }
        }
        int ret = 0;
        while (!st.empty()) {
            st.pop();
            ret++;
        }
        System.out.println(ret);
    }    
}