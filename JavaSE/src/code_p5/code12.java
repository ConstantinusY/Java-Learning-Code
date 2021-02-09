package code_p5;

import java.util.Arrays;

public class code12 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,7,1,4,8,3,2,1};
        System.out.println(Arrays.toString(arr));
        //j:控制对比互换执行轮数
        for (int j = 0; j < arr.length-1; j++){
            //完成一轮元素的对比互换
            for (int i = 0; i < arr.length-1-j; i++){
                //如果发现前面的元素比后面的元素大
                if(arr[i] > arr[i+1]){
                    //前后元素位置互换
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
