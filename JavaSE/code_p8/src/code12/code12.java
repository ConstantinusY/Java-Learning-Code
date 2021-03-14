package code12;

public class code12 {
    public static void haveMeal(Programmer p){
        p.eat(); //多态发生
    }
    public static void main(String[] args) {
        Programmer p1 = new Programmer("小A");
        ChinesePro p2 = new ChinesePro("张三");
        EnglishPro p3 = new EnglishPro("Tom");
        IndianPro p4 = new IndianPro("Dheeraj");
        haveMeal(p1);
        haveMeal(p2);
        haveMeal(p3);
        haveMeal(p4);
        p2.playTaichi();
        p3.playHorseRace();
        p4.dance();
    }
}
