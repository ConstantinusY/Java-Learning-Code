package example01_LotterySys;

import java.util.Arrays;

public class LotteryUtil {
    public static int[][] lotteriesGiven = new int[0][7];
    public static void setLotteriesNum(int len){
        lotteriesGiven = new int[len][7];
    }

    /**
     * 该方法用于生成一个双色球彩票
     * @return 返回一个int[]存储七个数
     */
    private static int[] lottery(){
        int[] lottery = new int[6], res = new int[7];
        for (int i = 0; i < 6; i++){
            int num = (int)(Math.random()*33+1);
            while (OthersUtil.isIn(lottery,num)){
                num = (int)(Math.random()*33+1);
            }
            lottery[i]=num;
        }
        Arrays.sort(lottery);
        System.arraycopy(lottery,0,res,0,6);
        res[6] = (int)(Math.random()*16+1);
        return res;
    }

    /**
     * 该方法用于给出合格的双色球彩票
     * @return 返回合格的双色球彩票
     */
    public static int[] getLottery(){
        int[] res = lottery();
        // 检测是否有重复
        while (OthersUtil.isIn(res,lotteriesGiven)){
            res = lottery();
        }
        return res;
    }

    /**
     * 该方法用于展示一注双色球
     * @param lottery 输入的注
     */
    public static void showLottery(int[] lottery){
        System.out.print("红球：");
        for (int i = 0; i < 6; i++){
            System.out.print(lottery[i]+"\t");
        }
        System.out.print(",  蓝球: "+lottery[6]);
        System.out.println();
    }

    /**
     * 该方法用于计算是否中奖即奖金
     * @param luckyNum 当期奖号
     * @param lottery 输入彩票
     * @return 返回中奖金额
     */
    public static int isWin(int[] luckyNum, int[] lottery){
        System.out.print("您的下注：");
        showLottery(lottery);
        System.out.print("当期中奖：");
        showLottery(luckyNum);

        //判断红球有几位相同
        int red = 0;
        for (int i = 0; i < 6; i++){
            if (luckyNum[i] == lottery[i]){
                red++;
            }
        }
        //判断篮球
        int blue = luckyNum[6] == lottery[6]?1:0;

        //算钱
        int money = 0;
        if (red == 6 && blue == 1){
            money = 5000000;
            System.out.println("一等奖!");
        }else if(red == 6){
            money = 1250000;
            System.out.println("二等奖!");
        }else if(red == 5 && blue == 1){
            money = 3000;
            System.out.println("三等奖!");
        }else if(red == 5 || red+blue == 5){
            money = 200;
            System.out.println("四等奖!");
        }else if(red == 4 || red+blue == 4){
            money = 10;
            System.out.println("五等奖!");
        }else if(red == 0 || blue == 1){
            money = 5;
            System.out.println("六等奖!");
        }else {
            System.out.println("白玩！");
        }

        return money;
    }

    /**
     * 此方法用于遍历彩票给出结果
     * @param luckyNum 当期中奖
     * @param lotteries 彩票数组
     */
    public static void iswin(int[] luckyNum, int[][] lotteries){
        int prize1=0,prize2=0,prize3=0,prize4=0,prize5=0,prize6=0,noPrize=0,inputMoney=lotteries.length*2,getMoney=0,money=0;
        //计算
        for (int[] i : lotteries){
            int m = isWin(luckyNum,i);
            switch (m){
                case 5000000:
                    prize1++;break;
                case 1250000:
                    prize2++;break;
                case 3000:
                    prize3++;break;
                case 200:
                    prize4++;break;
                case 10:
                    prize5++;break;
                case 5:
                    prize6++;break;
                default:
                    noPrize++;
            }
            getMoney+=m;
        }
        System.out.printf("投入%d元，收益%d元，净收益%d元。\n一等奖%d个，二等奖%d个，三等奖%d个，四等奖%d个，五等奖%d个，六等奖%d个，白玩%d次\n",inputMoney,getMoney,getMoney-inputMoney,prize1,prize2,prize3,prize4,prize5,prize6,prize6);
    }

}
