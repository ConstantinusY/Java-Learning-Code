package code_p4;

public class code08 {
    private static int randInt(int min, int max){
        return (int) (Math.random() * (max - min)) +min;
    }
    public static void main(String[] args) {
        int time = 0;
        int pHP = 315;
        int mHP = 500;
        while (true){
            System.out.println("-----------第"+(++time)+"回合------------");

            //玩家攻击
            int pDamage = randInt(5,8);
            System.out.println("玩家攻击！造成了"+pDamage+"点伤害！");
            mHP -= pDamage;
            //检测怪物是否挂掉
            if (mHP <= 0){
                System.out.println("怪物挂掉，游戏结束！") ;
                break;
            }

            //怪物攻击
            int mDamage = randInt(3,5);
            System.out.println("怪物攻击！造成了"+mDamage+"点伤害！");
            pHP -= mDamage;
            //检测玩家是否挂掉
            if (pHP <= 0){
                System.out.println("玩家挂掉，游戏结束！") ;
                break;
            }
        }
    }
}
