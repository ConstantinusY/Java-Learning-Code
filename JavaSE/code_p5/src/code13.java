import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数: ");

        int stuNum = sc.nextInt();
        String[] stuName = new String[stuNum];
        int[] stuScore = new int[stuNum];

        for (int i = 0; i < stuNum; i++){
            System.out.print("请输入第"+(i+1)+"个学生的姓名：");
            stuName[i] = sc.next();
            System.out.print("请输入第"+(i+1)+"个学生的分数：");
            stuScore[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < stuScore.length-1; j++){
            for (int i = 0; i < stuScore.length-1-j; i++){
                if (stuScore[i]<stuScore[i+1]){
                    int temp = stuScore[i];
                    stuScore[i] = stuScore[i+1];
                    stuScore[i+1] = temp;
                    String temp1 = stuName[i];
                    stuName[i] = stuName[i+1];
                    stuName[i+1] = temp1;
                }
            }
        }
        for (int i = 0; i < stuName.length; i++){
            System.out.println("第"+(i+1)+"名 "+stuName[i]+" 分数："+stuScore[i]+"分");
        }
    }
}
