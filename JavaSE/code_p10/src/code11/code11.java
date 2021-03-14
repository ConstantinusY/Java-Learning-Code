package code11;

import java.util.Scanner;

public class code11 {

    static Seasons season = null;

    public static void setSeason(){
        System.out.print("请输入一个季节（0-春,1-夏,2-秋,3-冬）：");
        int choice = new Scanner(System.in).nextInt();

        switch (choice){
            case 0:
                season = Seasons.SPRING;
                break;
            case 1:
                season = Seasons.SUMMER;
                break;
            case 2:
                season = Seasons.FALL;
                break;
            case 3:
                season = Seasons.WINTER;
                break;
            default:
                throw new java.lang.RuntimeException("输入不是0~3");
        }
    }

    public static void main(String[] args) {
        while (season == null){
            try{
                setSeason();
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }catch (Exception otherE){
                System.out.println("输入出现其他异常。");
            }
        }
        switch(season){
            case SPRING:
                System.out.println("春天到了");
                break;
            case SUMMER:
                System.out.println("夏天到了");
                break;
            case FALL:
                System.out.println("秋天到了");
                break;
            case WINTER:
                System.out.println("冬天到了");
                break;
        }
    }
}
