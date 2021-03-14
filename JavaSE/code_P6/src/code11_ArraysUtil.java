public class code11_ArraysUtil {
    // 6个
    /**
     * 升序排列一个byte数组
     * @param arr 要排序的byte数组
     */
    public static void sortASC(byte[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    byte temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个short数组
     * @param arr 要排序的short数组
     */
    public static void sortASC(short[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    short temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * 升序排列一个int数组
     * @param arr 要排序的int数组
     */
    public static void sortASC(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个long数组
     * @param arr 要排序的byte数组
     */
    public static void sortASC(long[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    long temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个float数组
     * @param arr 要排序的float数组
     */
    public static void sortASC(float[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    float temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个double数组
     * @param arr 要排序的double数组
     */
    public static void sortASC(double[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    double temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
// 6个
    /**
     * 降序排列一个byte数组
     * @param arr 要排序的byte数组
     */
    public static void sortDESC(byte[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    byte temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个short数组
     * @param arr 要排序的short数组
     */
    public static void sortDESC(short[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    short temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * 降序排列一个int数组
     * @param arr 要排序的int数组
     */
    public static void sortDESC(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个long数组
     * @param arr 要排序的byte数组
     */
    public static void sortDESC(long[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    long temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个float数组
     * @param arr 要排序的float数组
     */
    public static void sortDESC(float[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    float temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个double数组
     * @param arr 要排序的double数组
     */
    public static void sortDESC(double[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    double temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

// 查找第一次 8个
    /**
     * 在给定的int数组中查找指定的int元素第一次出现的位置
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int firstIndexOf(int[] arr,int b){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的byte数组中查找指定的byte元素第一次出现的位置
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int firstIndexOf(byte[] arr,byte b){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    // short long float double char boolean



// 查找最后一次 8个
    /**
     * 在给定的byte数组中查找指定的byte元素最后一次出现的位置
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(byte[] arr,byte b){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的int数组中查找指定的int元素最后一次出现的位置
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(int[] arr,int b){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    // short long float double char boolean

    // 判断包含 8个
    /**
     * 判断给定的int数组是否包含指定的int元素
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(int[] arr,int b){
        int index = firstIndexOf(arr, b);
        return index>=0?true:false;
    }
    /**
     * 判断给定的byte数组是否包含指定的byte元素
     * @param arr 给定的byte数组
     * @param b 指定的byte元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(byte[] arr,byte b){
        int index = firstIndexOf(arr, b);
        return index>=0?true:false;
    }
    // byte short int long float double boolean char



//判断给定数组 包含指定元素多少次 8个
    /**
     * 判断给定int数组 包含指定int元素多少次
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 元素在数组中出现的次数
     */
    public static int containTimes(int[] arr,int b){
        int t =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }
        }
        return t;
    }


    // 判断给定数组 是否包含且仅包含一次给定的元素  8个

    /**
     * 判断给定int数组 是否包含且仅包含一次给定int的元素
     * @param arr 给定的int数组
     * @param b 要查找的in元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(int[] arr,int b){
        int i = containTimes(arr, b);
        return i==1?true:false;
    }
}
