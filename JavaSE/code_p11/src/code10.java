public class code10 {
    public static int BinSearch(int[] arr, int target,int start,int end){
        if(arr == null || start>end){
            return -1;
        }
        int middle = (start+end)/2;
        int midVal = arr[middle];
        if (target == midVal){
            return middle;
        }else if(target < midVal){
            return BinSearch(arr,target,middle+1,end);
        }else {
            end = BinSearch(arr,target,start,middle-1);
        }
        return -1;
    }
    public static int BinSearch(int[] arr, int target){
        return BinSearch(arr,target,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] testArr = {2,54,23,4,7,8,34,5,99};
        System.out.println("testArr中7的位置是"+BinSearch(testArr,7));
    }
}
