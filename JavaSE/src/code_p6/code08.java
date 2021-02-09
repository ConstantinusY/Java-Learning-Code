package code_p6;

public class code08 {
    public static void printArr(int... arr){
        for (int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArr(arr);
        printArr(1,2,3,4,5,6,7,8,9);
    }
}
