package code_p5;

public class code08 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int size_array1 = array1.length;
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        int delIndex = 4;
        //移动元素方案
        for (int i = delIndex;i < array1.length-1;i++){
            array1[i] = array1[i+1];
        }
        array1[array1.length-1] = 0;
        size_array1-=1;
        for (int i = 0; i < size_array1; i++){
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        //创建新数组方案
        int[] nArr = new int[array2.length-1];
        for (int i = 0; i < delIndex; i++){
            nArr[i] = array2[i];
        }
        for (int i = delIndex; i < array2.length-1; i++){
            nArr[i] = array2[i+1];
        }
        array2 = nArr;
        for (int i : array2){
            System.out.print(i + "\t");
        }
    }
}
