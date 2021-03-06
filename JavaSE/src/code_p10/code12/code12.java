package code_p10.code12;

import java.io.*;
import java.util.*;

public class code12 {
    public static void main(String[] args) {
        //创建对象指向文件或文件夹
        File file = new File("F:\\coding_learning\\Java\\javaLnCode\\JavaSE\\src\\code_p10\\code12\\file.txt");
        File dir = new File("F:\\coding_learning\\Java\\javaLnCode\\JavaSE\\src\\code_p10\\code12\\dir");
        System.out.println(file.exists());

        //2.使用这个File对象，获取文件或者文件夹的属性
        System.out.println(file.getName());//文件或者文件夹的名称
        System.out.println(file.length());//长度
        System.out.println(file.exists());//是否存在
        System.out.println(file.getPath());//
        System.out.println(file.getAbsolutePath());//绝对路径
        System.out.println(file.isDirectory());//判断file是否指向一个目录
        System.out.println(file.isFile());//判断file是否指向一个文件
        System.out.println(file.isHidden());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());


        //某个文件夹下有哪些子文件夹和文件
        System.out.println("============");
        File fileArr[] =  dir.listFiles();
        for(File f :fileArr){
            //System.out.println(f.toString());
            System.out.print(new Date(f.lastModified()).toLocaleString());
            if(f.isFile()){
                System.out.print("      "+f.length()+" ");
            }else{
                System.out.print("  <DIR>           ");
            }
            System.out.println(f.getName());
        }
    }
}
