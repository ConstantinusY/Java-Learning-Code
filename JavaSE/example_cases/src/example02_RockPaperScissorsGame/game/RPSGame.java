package example02_RockPaperScissorsGame.game;

import example02_RockPaperScissorsGame.util.Consts;

public class RPSGame implements RPSGameInterface {
    private Player compP;
    private Player userP;
    private Judger judger;
    private int count; //局数

    @Override
    public void initGame() {
        compP = new CompPlayer("电脑玩家");
        userP = new UserPlayer("用户玩家");
        judger = new Judger();
        count = 1;
    }

    @Override
    public void startGame() {
        do {
            System.out.println("————————————————第" + count + "局—————————————————");

            //用户玩家出拳//电脑玩家出拳
            int userV = userP.getInputValue(), compV = compP.getInputValue();

            //输出两方出拳
            System.out.println(userP.getName() + "：" + Consts.NAMES[userV] + "\t" + compP.getName() + ":" + Consts.NAMES[compV]);

            //裁判比较//根据本局比赛修改玩家winCount
            switch (judger.IsWin(compV, userV)) {
                case -1:
                    System.out.println("电脑获胜");
                    compP.setWinCount(compP.getWinCount() + 1);
                    break;
                case 0:
                    System.out.println("平局");
                    break;
                case 1:
                    System.out.println("玩家获胜");
                    userP.setWinCount(userP.getWinCount() + 1);
                    break;
            }
            //输出本局比赛结果
            System.out.println("当前比分   " + userP.getName() + "  " + userP.getWinCount() + ":" + compP.getWinCount() + "  " + compP.getName());

            //判断游戏是否结束
        } while (Integer.max(userP.getWinCount(), compP.getWinCount()) != Consts.WIN_COUNT);
    }

    @Override
    public void endGame() {
        System.out.println("===============游戏结束==================");
        System.out.println("最终比分   "+userP.getName()+"  "+userP.getWinCount()+":"+compP.getWinCount()+"  "+compP.getName());
        System.out.println((userP.getWinCount()>compP.getWinCount()?"玩家获胜！":"电脑获胜！"));
    }
}
