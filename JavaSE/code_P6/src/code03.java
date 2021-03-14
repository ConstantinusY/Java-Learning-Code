import java.util.Arrays;

public class code03 {
    /**
     * 该方法用于判断给定的数组中是否包含指定元素
     * @param arr 给定的数组
     * @param ele 要查找的元素
     * @return 查找不到返回false，查找到返回true
     */
    public static boolean eleInArray(int[] arr, int ele){
        for (int i : arr){
            if (i == ele){
                return true;
            }
        }
        return false;
    }
    public static int[] getLottery(){
        int[] lottery = new int[6], res = new int[7];
        //生成随机数
        for (int i = 0; i < 6; i++){
            int num = (int)(Math.random()*33+1);
            //避免出现重复值重复值
            while (eleInArray(lottery,num)){
                num = (int)(Math.random()*33+1);
            }
            //放入数组
            lottery[i]=num;
        }
        Arrays.sort(lottery);
        System.arraycopy(lottery,0,res,0,6);
        res[6] = (int)(Math.random()*33+1);
        return res;
    }

    public static void main(String[] args) {
        int[] lottery = getLottery();
        System.out.println("生成双色球数："+Arrays.toString(lottery));
    }
}
