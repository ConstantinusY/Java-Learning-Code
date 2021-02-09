package code_p5;

public class code04 {
    public static void main(String[] args) {
        int[] arr = {12,45,78,35,49,65,33,1};
        int max=arr[0];
        int maxIndex=0;
        int min = arr[0];
        int minIndex= 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<=arr[i]){
                max=arr[i];
                maxIndex=i;
            }
            if(min>=arr[i]){
                min=arr[i];
                minIndex=i;
            }
        }

        System.out.println("最大值为:"+max);
        System.out.println("最大值索引为"+maxIndex);
        System.out.println("最小值为:"+min);
        System.out.println("最小值索引为"+minIndex);
    }
}
