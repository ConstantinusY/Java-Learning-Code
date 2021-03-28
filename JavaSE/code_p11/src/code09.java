public class code09 {
    public static int BinSearch(int[] arr, int target){
        if(arr == null){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int middle = (start+end)/2;
            int midVal = arr[middle];
            if (target == midVal){
                return middle;
            }else if(target < midVal){
                end = middle-1;
            }else {
                end = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = {2,54,23,4,7,8,34,5,99};
        System.out.println("testArr中7的位置是"+BinSearch(testArr,7));
    }
}
