package code_p5;

public class code07 {
    public static int[] addEle(int[]arr, int x, int n){
        int[] nArr = new int[arr.length+1];
        for (int i = 0; i < x; i++){
            nArr[i] = arr[i];
        }
        nArr[x] = n;
        for (int i = x+1; i < nArr.length; i++){
            nArr[i] = arr[i-1];
        }
        return nArr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9,10};
        for (int i:array){
            System.out.print(i+"  ");
        }
        System.out.println();
        array = addEle(array,5,6);
        for (int i:array){
            System.out.print(i+"  ");
        }
    }
}
