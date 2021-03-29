import java.util.Deque;
import java.util.LinkedList;

public class code06 {
    public static void main(String[] args) {
        //摞盘子
        Deque<String> deque1 = new LinkedList<String>();
        deque1.push("盘子1");
        deque1.push("盘子2");
        deque1.push("盘子3");

        System.out.println(deque1.size());
        System.out.println(deque1.peek());//get 获取栈顶元素，不移除
        System.out.println(deque1.peek());//get 获取栈顶元素，不移除
        while(!deque1.isEmpty()){
            String elem = deque1.pop();
            System.out.println(elem);
        }
        System.out.println(deque1.size());
    }
}
