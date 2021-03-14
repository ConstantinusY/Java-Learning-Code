package code11;

public class Cpu {
    private final String type;

    public Cpu(String type) {
        this.type = type;
    }
    public void calc(){
        System.out.printf("--------%sCPU正在计算--------\n",type);
    }
}
