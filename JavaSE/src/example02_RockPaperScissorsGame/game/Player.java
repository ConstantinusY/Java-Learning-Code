package example02_RockPaperScissorsGame.game;

/**
 * 玩家类
 */
public abstract class Player {
    private String name;//姓名
    private int value;//出拳手势
    private int winCount;//取胜局数

    public Player(){};

    public Player(String name) {
        this.name = name;
        this.value = -1;
        this.winCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    /**
     * 获取玩家手势，赋给value，再返回value的值
     * @return 玩家手势
     */
    public abstract int getInputValue();
}
