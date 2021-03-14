public class code02 {
    public static int sum(int[] arr){
        int res = 0;
        for (int i:arr){
            res += i;
        }
        return res;
    }
    public static int average(int[] arr){
        return sum(arr)/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("数组arr的元素平均值是"+average(arr));
    }
}
