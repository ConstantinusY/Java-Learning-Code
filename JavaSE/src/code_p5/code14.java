package code_p5;

import java.util.Scanner;

public class code14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入学生人数");
        int r=sc.nextInt();
        System.out.println("请录入考试科目数");
        int k =sc.nextInt();
        int[][] grade=new int[r][k];
        // 录入分数的过程
        /*控制录入的学生*/
        for (int i = 0; i <r ; i++) {
            System.out.println("请录入第"+(i+1)+"个学生的成绩");
            // 控制录入的科目
            for (int j = 0; j <k ; j++) {
                System.out.println("请录入第"+(i+1)+"个学生的第"+(j+1)+"科成绩");
                grade[i][j]=sc.nextInt();
            }
        }
        // 计算和输出分数的过程
        for (int i = 0; i <r ; i++) {

            // 计算一个学生所有科目的分数
            int sum=0;
            int max=grade[i][0];
            int min=grade[i][0];
            for (int j = 0; j <k ; j++) {
                // 求一个学生的分数和
                sum+=grade[i][j];
                /*求一个学生的最高分*/
                if (max < grade[i][j]) {
                    max=grade[i][j];
                }
                /*求一个学生的最低分*/
                if (min > grade[i][j]) {
                    min=grade[i][j];
                }
            }
            System.out.println("第"+(i+1)+"个学生的总分为:"+sum+"\t最高分:"+max+"\t为最低分:"+min+"\t为平均分为:"+(sum*1.0/k));
        }
        sc.close();
    }
}