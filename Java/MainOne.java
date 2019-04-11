import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * 20行的判断有问题
 * 可以计算出每个面额需要的最少的硬币数
 * TODO: 计算最后需要的硬币的总数
 */
public class MainOne {
    static Integer[][] ret = new Integer[100][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // Integer[] val = new Integer[n];
        int x;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            ret[x] = new Integer[] {x};
        }
        if (!isContains(ret, 1) || !isContains(ret, 2)) {
            System.out.println(-1);
        }
        ret[1] = new Integer[]{1};
        ret[2] = new Integer[]{2};
        ret[3] = new Integer[]{1, 2};
        fb(m);
        System.out.println(Arrays.toString(ret[m]));
    }
    
    public static Integer[] fb(int m) {
        int min = 100000;
        Integer[] temp;
        if (ret[m] != null) {
            return ret[m];
        } else {
            for (int i = 1; i <= m/2; i++) {
                temp = concat(fb(i), fb(m-i));
                if (i == 1) {
                    min = temp.length;
                    ret[m] = temp;
                } else {
                    if (temp.length < min) {
                        min = temp.length;
                        ret[m] = temp;
                    }
                }
            }
            return ret[m];
        }
    }

    public static boolean isContains(Integer[][] ret2, int i) {
        return Arrays.asList(ret2).contains(Integer.valueOf(i));
    }

    // 合并数组
    public static Integer[] concat(Integer[] a, Integer[] b) {  
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a)); // 先把Array转成ArrayList形式的List
        list.addAll(Arrays.asList(b)); // 用List的addAll方法合并数组
        Integer[] c = list.toArray(new Integer[list.size()]); // 再把List转成Array
        // System.out.println(Arrays.toString(c));
        return c;
    }

    // int数组转Integer数组的方法
    public static Integer[] toIntegers(int[] arr) {
        Integer[] ret = new Integer[arr.length];
        int a = 0;
        for (int i : arr) {
            ret[a] = i;
            a++;
        }
        return ret;
    }
}