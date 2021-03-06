package code_p10.code13;

import java.io.*;

public class code13 {
    public static void main(String[] args) {
        //创建一个File对象
        File file = new File("c:/abc/cba/acb/bac/readme.txt");
        //如果文件存在就删除，如果不存在就创建
        if(file.exists()){
            file.delete();
        }else{
            try {
                //判断所在文件夹是否存在，不存在，要先创建文件夹
                File dir = file.getParentFile();
                if(!dir.exists()){
                    //dir.mkdir();//make directory
                    dir.mkdirs();
                }
                //创建文件
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
