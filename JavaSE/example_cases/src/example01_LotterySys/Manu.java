package example01_LotterySys;

import com.sun.media.sound.RIFFWriter;

import java.util.Scanner;

public class Manu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //用一个二维数组存储多个注彩票
        int[][] lotteries = new int[0][0];
        //存储中奖号码
        int[] luckyNum = new int[0];
        //生成中奖号码
        luckyNum = LotteryUtil.getLottery();

        System.out.println("欢迎使用双色球系统，官方网站www.neverGonnaGiveYouUP.com");
        System.out.println("**********请输入菜单选项********");
        System.out.println("*        1.购买双色球          *");
        System.out.println("*         2.查看开奖           *");
        System.out.println("*         3.查看中奖           *");
        System.out.println("*         4.查看已购买双色球    *");
        System.out.println("*         5.退出系统           *");
        System.out.println("******************************");

        o:while (true){
            int option = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("运行购买双色球代码");
                    //输入购买注数
                    System.out.println("输入购买注数");
                    int lNum = sc.nextInt();
                    int temp = LotteryUtil.lotteriesGiven.length;
                    LotteryUtil.setLotteriesNum(temp+lNum);
                    //存储多个彩票
                    lotteries = new int[lNum][7];
                    //生成彩票
                    System.out.println("正在生成，请稍候...");
                    for (int i = 0; i < lNum; i++){
                        lotteries[i] = LotteryUtil.getLottery();
                    }
                    System.arraycopy(lotteries,0,LotteryUtil.lotteriesGiven,temp,lotteries.length);
                    System.out.println("成功购买了"+lotteries.length+"注双色球。");
                    OthersUtil.splitLine();break;
                }

                case 2: {
                    System.out.println("运行查看开奖代码");
                    System.out.println("运行查看已购买双色球代码");
                    if (lotteries.length!=0){
                        //生成中奖号码
                        luckyNum = LotteryUtil.getLottery();
                        LotteryUtil.showLottery(luckyNum);
                        OthersUtil.splitLine();break;
                    }
                    else {
                        System.out.println("没有购买的双色球。");OthersUtil.splitLine();break;
                    }
                }

                case 3: {
                    System.out.println("运行查看中奖代码");
                    if (lotteries.length!=0){
                        LotteryUtil.iswin(luckyNum,lotteries);
                    }
                    else {
                        System.out.println("没有购买的双色球。");OthersUtil.splitLine();break;
                    }
                    OthersUtil.splitLine();break;
                }

                case 4: {
                    System.out.println("运行查看已购买双色球代码");
                    if (lotteries.length!=0){
                        for (int[] i : lotteries){
                            LotteryUtil.showLottery(i);
                        }
                    }
                    else {
                        System.out.println("没有购买的双色球。");OthersUtil.splitLine();break;
                    }
                    OthersUtil.splitLine();break;
                }

                case 5: {
                    System.out.println("退出系统。");
                    OthersUtil.splitLine();break o;
                }

                default: {
                    System.out.println("输入不对劲。");
                    OthersUtil.splitLine();break;
                }
            }
        }
    }
}
