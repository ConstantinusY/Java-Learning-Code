public class code02 {
    public static void main(String[] args) {
        //                  0   1  2   3  4  5
        int[] stuCNScore = {100,98,115,72,96,84};
        System.out.println("第三个学生的语文成绩是"+stuCNScore[2]);
        stuCNScore[2] = 110;
        System.out.println("第三个学生的语文成绩是"+stuCNScore[2]);
        System.out.println("总共有"+stuCNScore.length+"个学生");
    }
}
