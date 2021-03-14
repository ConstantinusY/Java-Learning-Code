package example01_LotterySys;

public class OthersUtil {
    /**
     * 该方法用于输出分割线
     */
    public static void splitLine(){
        System.out.println("-----------------------------------------------\n");
    }

    /**
     * 该方法用于检测元素是否在数组中
     * @param target 目标元素
     * @param arr 目标数组
     * @return 找到返回true，找不到返回false
     */
    public static boolean isIn(int[] target, int[]... arr){
        for (int[] i: arr){
            if(i == target){
                return true;
            }
        }
        return false;
    }

    /**
     * 该方法用于判断给定的数组中是否包含指定元素
     * @param arr 给定的数组
     * @param ele 要查找的元素
     * @return 查找不到返回false，查找到返回true
     */
    public static boolean isIn(int[] arr, int ele){
        for (int i : arr){
            if (i == ele){
                return true;
            }
        }
        return false;
    }
}

