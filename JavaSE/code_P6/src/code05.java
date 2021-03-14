import java.util.Arrays;

public class code05 {
    private static void changeArrValTo100(int[] arr, int index){
        arr[index] = 100;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        changeArrValTo100(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}

