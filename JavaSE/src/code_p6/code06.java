package code_p6;

import java.util.Arrays;

public class code06 {
    public static void sortArr_Ascending(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,41,58,97,654,351,487,9};
        System.out.println(Arrays.toString(arr));
        sortArr_Ascending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
