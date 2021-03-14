package example02_RockPaperScissorsGame.game;

import example02_RockPaperScissorsGame.util.Util;

/**
 * 玩家类
 */
public class UserPlayer extends Player{
    public UserPlayer() {
    }

    public UserPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        //玩家输入出拳
        int input = Util.inputInt("请出拳：【0--石头 1--剪子 2--布】\t");
        //赋给用户玩家的value
        setValue(input);
        //返回value
        return input;
    }
}
