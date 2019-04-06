import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] val = new int[n];
        int[][] ret = new int[m+1][];
        int x;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            val[i] = x;
        }
        ret[1] = new int[]{1};
        ret[2] = new int[]{2};
        ret[3] = new int[]{1, 2};
        for (int i = 4; i <= m; i++) {

        }
        System.out.println(val[1]);
    }
    
    public static int[] fb(int m) {
        int[][] ret = new int[m+1][];
        ret[1] = new int[]{1};
        ret[2] = new int[]{2};
        ret[3] = new int[]{1, 2};
        for (int i = 0; i < m/2; i++) {
            List list = new ArrayList(Arrays.asList(fb(i)));
            list.addAll(Arrays.asList(fb(m-i)));

            // ret[m] = c;            
        }

        return ret[m];
    }
}