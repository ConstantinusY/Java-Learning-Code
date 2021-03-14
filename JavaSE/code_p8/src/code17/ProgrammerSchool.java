package code17;

import code12.*;

public class ProgrammerSchool {
    public static Programmer getPro(String country,String name){
        Programmer resPro = null;
        switch (country){
            case "Chinese":
                resPro = new ChinesePro(name); break;
            case "English":
                resPro = new EnglishPro(name); break;
            case "Indian":
                resPro = new IndianPro(name); break;
        }
        return resPro;
    }
}
