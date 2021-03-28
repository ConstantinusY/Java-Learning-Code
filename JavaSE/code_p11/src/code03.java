import java.util.Arrays;

public class code03 {
    public static void selectSort(int[] scoreArr) {
        //大循环：n个元素排序，则需要n-1趟循环
        for (int i = 0; i < scoreArr.length - 1; i++) {
            //第i趟先假设第i个最小
            int minIndex = i;
            //从第i+1个元素开始，依次使用最小元素和每元素比较，一直比较到最后
            for (int j = i + 1; j < scoreArr.length; j++) {
                if (scoreArr[minIndex] > scoreArr[j]) {
                    minIndex = j;
                }
            }
            //一趟比较完后，或者最小值的索引，如果不是第i个，就交换
            if (minIndex != i) {
                int temp;
                temp = scoreArr[i];
                scoreArr[i] = scoreArr[minIndex];
                scoreArr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] scoreArr = {75, 87, 56, 45, 89, 100, 76, 34, 89, 97};
        System.out.println(Arrays.toString(scoreArr));
        selectSort(scoreArr);
        System.out.println(Arrays.toString(scoreArr));

    }

}
