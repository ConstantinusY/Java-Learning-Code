package example02_RockPaperScissorsGame.game;

import example02_RockPaperScissorsGame.util.Consts;

/**
 * 裁判类
 */
public class Judger {
    /**
     * 判断一局中谁获胜
     * @param p1Val 电脑出拳
     * @param p2Val 用户出拳
     * @return -1 -- 电脑获胜， 0 -- 平局， 1 -- 玩家获胜, -2 -- 不正常输出
     */
    public int IsWin(int p1Val, int p2Val){

        if(p1Val == p2Val){
            return 0;
        }else if (p1Val == Consts.STONE){
            if (p2Val == Consts.SCISSORS){
                return -1;
            }else {
                return 1;
            }
        }else if (p1Val == Consts.SCISSORS){
            if(p2Val == Consts.PAPER){
                return -1;
            }else {
                return 1;
            }
        }else if (p1Val == Consts.PAPER){
            if(p2Val == Consts.STONE){
                return -1;
            }else{
                return 1;
            }
        }
        return -2;
    }
}
