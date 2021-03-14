package example02_RockPaperScissorsGame.test;

import example02_RockPaperScissorsGame.game.RPSGame;
import example02_RockPaperScissorsGame.game.RPSGameInterface;

/**
 * 测试游戏启动器
 */
public class LaunchGameTest {
    public static void main(String[] args) {
        RPSGameInterface game = new RPSGame();
        game.initGame();
        game.startGame();
        game.endGame();
    }
}
