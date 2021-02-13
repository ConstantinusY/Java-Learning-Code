package code_p7.code04;

import code_p7.code03.Computer;

public class code04 {
    public static void main(String[] args) {
        Computer[] cptArr = {
            new Computer("酷睿","三星","华硕","罗技"),
            new Computer("Intel","金士顿","技嘉","双飞燕"),
            new Computer("AMD","三星","华硕","双飞燕"),
            new Computer("酷睿","金士顿","技嘉","罗技")
        };
        for (Computer i : cptArr){
            i.start();
            i.show();
            i.stop();
        }
    }
}
