package code_p5;

public class code03 {
    public static void main(String[] args) {
        int[] array = {13,54,24,76,45,53,23};
        //for循环
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index]+"\t");
        }
        //foreach循环
        System.out.println();
        for (int i:array){
            System.out.print(i+"\t");
        }
    }
}
