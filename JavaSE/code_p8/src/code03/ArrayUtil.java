package code03;

/**
 * 此类封装了数组常用功能（迫真
 */
public class ArrayUtil {
    /**
     * 此方法用于在一个int数组中添加元素
     * @param arr 目标数组
     * @param ele 添加的元素（可以有多个）
     * @return 返回新数组
     */
    public static int[] addEle(int[] arr, int... ele){
        int[] res = new int[arr.length+ele.length];
        System.arraycopy(arr,0,res,0,arr.length);
        System.arraycopy(ele,0,res,arr.length,ele.length);
        return res;
    }

    /**
     * 此方法用于输出一个int数组
     * @param arr 目标数组
     * @param split 元素与元素之间分割的符号
     */
    public static void printArr(int[] arr,String split){
        for (int i:arr){
            System.out.print(i+split);
        }
        System.out.println();
    }
}
