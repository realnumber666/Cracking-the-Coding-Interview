import java.util.*;

public class Test {
    static int[][] ret = new int[10][];
    public static void main(String[] args) {
        concat();
    }

    // 在main函数外定义的变量为类中的全局变量
    public static void fb() {
        if ( ret[0] == null) {
            System.out.println("ok");
        }
    }

    // set中要放引用类型/ 包装类型，不然会出错或者直接报错
    public static boolean isContains(int[] arr, int i) {
        return Arrays.asList(toIntegers(arr)).contains(Integer.valueOf(i));
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

    // 合并数组
    public static void concat() {
        Integer a[] = {1, 2, 3}; // Array类型 Object组成的数组
        Integer b[] = {1, 2};     
        int d[] = {3,3};   
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Integer[] c = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(c));
    }

    public static void test() {
        int i = 1;
        Integer t = 1;
        System.out.println(i == t); // true
        System.out.println(t.getClass()); // java.lang.Integer
    }
}