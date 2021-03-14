public class code09 {
    private static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
        int a_size = 0, b_size = 0; //偶数个数
        for(int i:arr){
            if(i % 2 == 0){
                b_size++;
            }
            else {
                a_size++;
            }
        }
        int[] a = new int[a_size], b = new int[b_size];
        int aIndex = 0, bIndex = 0;
        for(int i:arr){
            if(i % 2 == 0){
                b[bIndex] = i;
                bIndex++;
            }
            else {
                a[aIndex] = i;
                aIndex++;
            }
        }

        printArr(arr);
        System.out.print("奇数:");
        printArr(a);
        System.out.print("偶数:");
        printArr(b);
    }
}
