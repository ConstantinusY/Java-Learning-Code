package code04;

public class code04 implements TestInterface{
    @Override
    public void helloInterface() {
        System.out.println("你好！接口！");
    }

    public static void main(String[] args) {
        System.out.println("接口中的常量为"+TestInterface.CONST_INT);
        code04 c = new code04();
        c.helloInterface();
    }
}
