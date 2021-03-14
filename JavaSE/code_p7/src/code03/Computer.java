package code03;

public class Computer {
    //四个变量存储计算机配置
    private final String cpu;
    private final String mainBoard;
    private final String memory;
    private final String keyboard;

    public Computer(String cpu, String mainBoard, String memory, String keyboard){
        System.out.println("=========Computer()=========");
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.memory = memory;
        this.keyboard = keyboard;
    }
    /**
     * 此方法用于“开机”动作
     */
    public void start(){
        System.out.println("————————————正在开机————————————");
    }
    /**
     * 此方法用于“展示配置”操作
     */
    public void show(){
        System.out.printf("CPU：%s，主板：%s，内存：%s，键盘：%s\n",cpu,mainBoard,memory,keyboard);
    }
    /**
     * 此方法用于“关机”操作
     */
    public void stop(){
        System.out.println("————————————正在关机————————————");
    }

    public static void main(String[] args) {
        Computer a = new Computer("英特尔","华硕","金士顿","VPRD");
        a.start();
        a.show();
        a.stop();
    }
}
