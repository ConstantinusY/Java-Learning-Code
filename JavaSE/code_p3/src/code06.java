public class code06 {
    public static void main(String[] args) {
        /* 左移运算，右移运算，不带符号右移运算 */
        int a = -10;                 //-10 = 0b 1111 1111 1111 1111 1111 1111 1111 0110
        System.out.println(a << 1);  //0b 1111 .... 1111 0110  →  0b 1111 .... 1110 1100
        System.out.println(a >> 1);  //0b 1111 .... 1111 0110  →  0b 1111 .... 1111 1011
        System.out.println(a >>> 1); //0b 1111 .... 1111 0110  →  0b 0111 .... 1111 1011

        /* 按位与运算，按位或运算,按位异或运算，按位取反运算 */
        int b = 10;                   //10 = 0b 0000 0000 0000 0000 0000 0000 0001 0000
        int c = 11;                   //11 = 0b 0000 0000 0000 0000 0000 0000 0001 0001
        System.out.println(b & c);//newVal = 0b 0000 0000 0000 0000 0000 0000 0001 0000
        System.out.println(b | c);//newVal = 0b 0000 0000 0000 0000 0000 0000 0001 0001
        System.out.println(b ^ c);//newVal = 0b 0000 0000 0000 0000 0000 0000 0000 0001
        System.out.println(~b);
    }
}
