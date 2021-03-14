import java.util.Arrays;
public class code11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[6];
        System.arraycopy(arr,2,arr3,1,5);
        System.out.println(Arrays.toString(arr3));
    }
}
