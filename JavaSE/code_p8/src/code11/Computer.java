package code11;
public class Computer {
    private static Cpu cpu = new Cpu("i9");
    public static void launch(){
        System.out.println("-------电脑启动了--------");
        cpu.calc();
    }
}
