public class code09 {
    public static void main(String[] args) {
        int ct = 0; //calculate time
        int bNum = 1; //big horse number
        while (bNum < 25) { //大马最多25只
            int mNum = 1; //medium horse number
            while (mNum<50){ //中马最多50只
                ct++;//计算了一次
                //小马个数 = 总马数-大马数-中马数
                int lNum = 100-bNum-mNum; //little horse number
                /*如果大马数*4（大马运量）+中马*2（中马运量）+小马/2（小马运量）=100（总运量）
                 且小马个数为偶数（因为两只小马才能驼一担粮食，则视为满足条件*/
                if (bNum*4+mNum*2+lNum/2 == 100 && lNum%2==0){
                    System.out.println("共有"+bNum+"匹大马，"+mNum+"匹中马"+lNum+"匹小马。");
                    break;
                }
                mNum++;
            }
            bNum++;
        }
        System.out.println("共计算了"+ct+"次");
    }
}
