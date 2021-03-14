import java.util.Arrays;
public class code10 {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("元素74的索引是"+Arrays.binarySearch(arr,74));
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr,6);
        System.out.println(Arrays.toString(arr2));
    }
}
