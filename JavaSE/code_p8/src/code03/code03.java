package code03;

public class code03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayUtil.printArr(arr,"\t");
        arr = ArrayUtil.addEle(arr,6);
        ArrayUtil.printArr(arr,"\t");
        arr = ArrayUtil.addEle(arr,7,8,9);
        ArrayUtil.printArr(arr,"\t");
    }
}
