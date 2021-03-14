package code01;

import java.util.Vector;

public class code01 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        for (Integer i : v){
            System.out.print(i+"\t");
        }
    }
}

