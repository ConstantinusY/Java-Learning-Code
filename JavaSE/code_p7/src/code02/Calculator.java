package code02;

public class Calculator {
    String brand;
    double size;

    public int add(int... nums){
        int res = 0;
        for (int i : nums){
            res += i;
        }
        return res;
    }
    public int sub(int... nums){
        int res = nums[0]*2;
        for (int i : nums){
            res -= i;
        }
        return res;
    }
    public void show(){
        System.out.printf("购买了一个%s计算器，尺寸为%f\n",brand,size);
    }
}
