import java.util.Arrays;

public class code01 {
    public static void bubbleSort(int[] input){
        for(int i = 0; i< input.length-1; i++){
            for (int j = 0; j < input.length-1; j++){
                if(input[j] > input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {123,43,21,6,897,657,5,34,233};
        System.out.println("排序前数组："+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后数组："+ Arrays.toString(arr));
    }
}