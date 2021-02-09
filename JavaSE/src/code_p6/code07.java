package code_p6;

import java.util.Arrays;
import code_p6_add.code07_add2;

public class code07 {
    public static void main(String[] args) {
        int[] arr = {5,41,58,97,654,351,487,9};
        System.out.println(Arrays.toString(arr));
        code07_add.sort_1(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {45,87,698,3521,78,5889,248};
        System.out.println(Arrays.toString(arr1));
        code07_add2.sort_2(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
