import java.util.Arrays;

public class code04 {
    /**
     * 快排算法
     * @param arr 需要排序的数组
     * @param left 数组头
     * @param right 数组尾
     */
    public static void quickSort(int[] arr, int left,int right){
        //递归结束条件
        if(left >= right){
            return;
        }

        int p = arr[left];//中心轴
        int l = left;//左指针
        int r = right;//右指针

        while (l < r){ //当左指针没遇到右指针
            //从右边开始判断
            while (l < r && arr[r] >= p){
                r--;
            }//循环结束后找到最后一个大于中心轴的元素，然后进行赋值
            if(l < r){//如果左右指针不相等则进行赋值，如果相等就找到p的位置,不用进行赋值
                arr[l] = arr[r];
            }

            //剩余的从左侧开始判断
            while (l < r && arr[l] <= p){
                l ++;
            }//循环结束后找到最后一个小于中心轴的元素，然后进行赋值
            if (l < r){//如果左右指针不相等则进行赋值，如果相等就找到p的位置,不用进行赋值
                arr[r] = arr[l];
            }

            //插入中心轴
            arr[l] = p;
            //此时中心轴左侧元素全部小于中心轴，中心轴右侧元素全部大于中心轴

            //继续对左右两边进行相同操作
            quickSort(arr,left,l-1);
            quickSort(arr,l+1,right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,2,5,3,7,4,1,6,8};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
