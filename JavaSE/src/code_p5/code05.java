package code_p5;

public class code05 {
    public static void main(String[] args) {
        int target = 1;
        int index = -1, _index = -1;
        int[] arr = {455,123,4,1,3,6545,8,689,1,864,18648,385,86};
        //查找元素第一次出现位置
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                index = i;
                break;
            }
        }
        for (int i = arr.length-1; i>=0; i--){
            if(arr[i] == target){
                _index = i;
                break;
            }
        }
        System.out.println("数据第一次出现索引为"+index);
        System.out.println("数据最后一次出现索引为"+_index);
        System.out.println(index==_index?"数据仅出现一次":"数据出现多次");
    }
}
