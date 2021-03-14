package example02_RockPaperScissorsGame.game;

import example02_RockPaperScissorsGame.util.Util;

/**
 * 电脑玩家
 */
public class CompPlayer extends Player{
    public CompPlayer() {
    }

    public CompPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        //获得随机数
        int value = Util.getRandNum(2);

        //赋值给电脑玩家的value
        this.setValue(value);

        //返回随机数
        return value;
    }
}
