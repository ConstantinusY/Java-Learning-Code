# 五、JAVA SE初探

## 1.第一个Java程序

### 1.1 准备JDK

### 1.2编写代码

1. 创建文件
2. 创建类
3. 定义主方法
4. 向主方法中添加代码
5. 编译(javac,java)和解释

### 1.2配置环境变量

**Path**:

%JAVA_HOME%\bin

**JAVA_HOME**:

(JDK安装目录)

**classpath**:

(Java到哪里寻找.class)

eg.<big>**`. ; (path)`**</big>



## 2.JAVA编程风格

 **注意缩进!**

一定要有缩进。缩进就像人得体的衣着一样！

只要遇到{}就缩进，缩进的快捷键tab键。

 **成对编程**

括号、引号都应该写完后，再往里加内容。

**注意命名！**

见名知意是最基本的要求!

**区分大小写**

不同于HTML java中的类名,对象名,变量名等标识符是严格区分大小写的

**驼峰式命名**

标识符命名时,当多个单词拼接时,每个单词的首字母大写,其他小写 
helloworld  >>> HelloWorld 



## 3.JAVA注释

为了方便程序的阅读，Java语言允许程序员在程序中写上一些说明性的文字，用来提高程序的可读性，这些文字性的说明就称为注释。

注释不会出现在字节码文件中，即Java编译器编译时会跳过注释语句。

在Java中根据注释的功能不同，主要分为单行注释、多行注释和文档注释。

**单行注释**

单行注释使用“//”开头，“//”后面的单行内容均为注释。

**多行注释**

多行注释以“/*”开头以“*/”结尾，在“/*”和“*/”之间的内容为注释，我们也可以使用多行注释作为行内注释。但是在使用时要注意，多行注释不能嵌套使用。

**文档注释**

文档注释以“/**”开头以“*/”结尾，注释中包含一些说明性的文字及一些JavaDoc标签（后期写项目时，可以生成项目的API）



## 4. 标识符，关键字，字符集

**标识符**

Java中用于区分数据而需要我们自己定义的名称

+ 允许使用 字母 数字 _ $

+ 不允许使用 数字不能开头 不可以是java中的关键字		

+ 驼峰式命名

+ 见名知意   

常见的标识符:  包名 类名 方法名 变量名 参数名 



**关键字**

关键词（保留字）就是具备特殊含义的词汇。比如：public，static，int，class等，Java关键字是Java语言保留供内部使用的。



**字符集**

编码：编码是从一种形式或格式转换为另一种形式的过程，也称为计算机编程语言的代码简称编码。用预先规定的方法将文字、数字或其它对象编成数码，或将信息、数据转换成规定的电脉冲信号。编码的逆过程是解码。

常见字符集：

| 字符集      | 描述                                                      | 单字符大小 |
| ----------- | --------------------------------------------------------- | ---------- |
| ASCII       | 西欧字符集                                                | 1个字节    |
| ISO-8859-xx | 英文字符集                                                | 1个字节    |
| BIG5        | 台湾的大五码，表示繁体汉字                                | 2个字节    |
| GB2312      | 大陆使用最早、最广的简体中文字符集                        | 2个字节    |
| GBK         | GB2312的扩展，可以表示繁体中文                            | 2个字节    |
| GB18030     | 最新GBK的扩展，可以表示汉字、维吾尔文、藏文等中华民族字符 | 2个字节    |
| Unicode     | 国际通用字符集(JAVA中用的字符集就是Unicode)               | 2个字节    |

PS:

1PB=1024TB

1TB=1024GB

1GB=1024MB

1MB=1024KB

1KB=1024byte

1byte=8bit



## 5.变量和常量(code_p1)

### 5.1 什么是变量和常量

变量 可以变化的量 

常量 不会变化的量

+ 字面常量(其实就是具体的值) 

+ 符号常量(真理数字,类似于PI这样的数据)



### 5.2变量的创建

**声明变量：`数据类型 变量名;`**

Java中的任何一个变量都必须指定其数据类型。

变量的声明只是声明，并不会在内存上实际开辟空间，在字节码中也没有体现，只有赋值的时候才会开辟空间存储这个值，才会在在字节码中。

**可以一次性声明多个变量：`数据类型 变量1,变量2......`**

可以在声明的同时赋值，类型只需要声明一次。变量的值可以反复修改。

code:

```java
public class code01			  
	public static void main (String args[]){
		int i = 0;
        System.out.println(i);
        
        int a=1,b=2,c=3,d=4；
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
        i = 5;
        System.out.println(i);        
	}			
}
```



### 5.3变量的作用范围

局部变量：

**方法||代码块||多条件分支||循环** 内 声明的变量，仅能在当前  **方法||代码块||多条件分支||循环**  内使用

成员变量（全局变量）：

声明在方法外的变量，可以通过访问修饰符空置房温范围，最少可以在当前类访问。

code:

```java
public class code02{
    static int z = 1;
    public static void main(String args[]){
        for(int x = 0; x < 10; x++){
            int y = 10;
            System.out.println(y);
            //System.out.println(a);
        }
        //System.out.println(y);
        System.out.println(z);
    }
    public static void a(){
        //System.out.println(a);
        System.out.println(z);
    }
    
}
```



### 5.4常量拓展

**常量的声明：`final 数据类型 变量名【=值】`**

final修饰的值是常量，只可以赋值一次，不可修改。

code:

```java
public class code03{			  
	public static void main (String args[]){
		final int constVal = 1;
        
        // constVal = 2;
        
        System.out.println(constVal);
	}			
}
```

-------------





## 6 数据类型(code_p2)

### 6.1 进制及其转换

十进制 逢十进一  人类喜欢的进制  。

二进制 逢二进一  计算机底层的进制  。

**十进制转二进制：**

将该十进制数不断除以2直到商为0，记录余数，将余数倒着写就是结果。

eg.将14转为二进制数
$$
\frac{14}{2}=7......0,    \frac{7}{2}=3......1,    \frac{3}{2} =1......1,    \frac{1}{2}=1......1，余数为0,1,1,1倒着写：1110，为二进制数
$$
**二进制转10进制:**

将该二进制数每一位乘当2的当前位位数减一次方，将结果相加

eg.将1110转为十进制数
$$
1\times2^(4-1)+1\times2^(3-1)+1\times2^(2-1)+0\times2^(1-1)=8+4+2+0=14
$$
十进制转八进制和八进制转十进制与上面所述方法类似。

八进制与二进制可以把十进制当做“中转站”

**但我们可以使用计算器！**

HEX：16进制，DEC：十进制，OCT：八进制，BIN：二进制

-----------



**6.2 数据类型分类**

基本数据类型（primitive data type):

最基础的数据类型，分为八种。

+ 整数型 byte short int long
+ 浮点型 float double
+ 字符型 char
+ 布尔型 boolean

引用数据类型（reference data type):

类，抽象类，枚举，接口等等。



### 6.3 整数型

**byte（字节型）short（短整型） int（整型） long（长整型）**

| 类型                   | 占用存储空间 | 表数范围                                                     |
| ---------------------- | ------------ | ------------------------------------------------------------ |
| byte                   | 1字节        | -2^7 ~ 2^7-1（-128~127）                                     |
| short                  | 2字节        | -2^15 ~ 2^15-1 （-32,768~32,767）                            |
| int（默认）            | 4字节        | -2^31 ~ 2^31-1 (-2,147,483,648~2,147,483,647) 约21亿         |
| long（赋值时后缀l或L） | 8字节        | -2^63 ~ 2^63-1（-9,223,372,036,854,775,808<br />~9,223,372,036,854,775,807)约9千京 |

 十进制整数，如：99, -500, 0

八进制整数，要求以 0 开头，如：015

十六进制数，要求 0x 或 0X 开头，如：0x15

二进制：要求0b或者0B开头，如：0b11

code:

```java
public class code01{
	public static void main(String args[]){
		byte byteVal = 127;
		short shortVal = 32767;
		int intVal = 2147483647;
		long longVal = 9223372036854775807L;
		
		System.out.println(byteVal);
		System.out.println(shortVal);
		System.out.println(intVal);
		System.out.println(longVal);
		
		int HEXval = 0xC, DECval = 14, OCTval=16, BINval = 0b1110;
	}
}

```

----------------



### 6.4浮点型

**float（单精度浮点型）double**（双精度浮点型）

| 类型                   | 占用存储空间 | 表数范围      |
| ---------------------- | ------------ | ------------- |
| float（赋值时后缀f或F) | 4字节        | 有效位数6~7位 |
| double（默认）         | 8字节        | 有效位数15位  |

code:

```java
public class code02 {
    public static void main(String[] args) {
        float fVal = 1.1451419198101145141919810f;
        double dVal = 1.1451419198101145141919810;
        System.out.println(fVal);
        System.out.println(dVal);
    }
}
```

-----------



### 6.5科学计数法

使用e或E,
$$
x e|E y = x\times10^y，例如3.14e2=3.14\times10^2=314,314E-2=314\times10^{-2}=3.14
$$
code:

```java
public class code03 {
    public static void main(String[] args) {
        double a = 3.14e2;
        double b = 314E-2;
        System.out.println(a);
        System.out.println(b);
    }
}
```

----------





### 6.6布尔类型

**boolean**

存储true|false，用来做逻辑判断

code:

```java
public class code04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b =  false;
        if (a){
            System.out.println("a=true");
        }
        if(b){
            System.out.println("b=true");
        }
    }
}
```

------------



### 6.7字符型

**char**

只能存储一个字符，使用单引号包裹，占用2byte

```java
public class code05 {
    public static void main(String[] args) {
        char charVal = 'c';
        System.out.println(charVal);
    }
}
```

--------------





### 6.8 Java中的转义字符

 有些特殊的字符在java中无法正常使用或展示,因为有特殊的作用

  使用\+要转义的字符

| 转义字符 | 说明                                                         |
| -------- | ------------------------------------------------------------ |
| \\'      | 表示符号`'`                                                  |
| \\"      | 表示符号`"`                                                  |
| \\\      | 表示符号`\`                                                  |
| \\t      | 如果前面的内容是制表符位的整数倍,<br />当前制表符为重开一个,如果不够,<br />补全一整个制表符位制表符 <br />一个制表符位8个空格 一个字母1个空格 一个汉字是2个空格 |
| \\n      | 换行                                                         |
| \\r      | 光标回到行首                                                 |
| \\b      | 退格                                                         |

code:

```java
public class code06 {
    public static void main(String[] args) {
        System.out.println("\'");
        System.out.println("\"");
        System.out.println("\\");
        System.out.println("114514\t1919810");
        System.out.println("114514\n1919810");
        System.out.println("114514\r1919810");
        System.out.println("114514\b1919810");
    }
}
```

-----------



### 6.9数据类型的转换

从小到大，正常转换

byte→short→int→long→float→double

从大到小，必须强制转换，可能会损失数据

为了尽量避免数据损失，应该让大的变量的值尽量在小的变量的范围内。

-----------------



### 6.10数据类型转换练习

要求：给定任意浮点数，将其转换为两位小数，考虑四舍五入。

code:

```java
public class code08 {
    public static double func(double a){
        return (int)(a*100+0.5)/100.0;
    }
    public static void main(String[] args) {
        System.out.println(func(3.145));
        System.out.println(func(3.141));
    }
}
```

## 7 运算符(code_p3)

*在Java中，如果除法两端都是整数，那么结果仅保留整数部分。如果除法两端任意一端师傅点数，那么结果以浮点数保存。（double)



### 7.1赋值运算符

**=**  

将右边的值赋值给左边的变量 一定要等右边所有的代码运算完毕再进行赋值

---------------



### 7.2算术运算符

**\+ - * / %**

1. 在算数运算符使用的过程中,注意运算结果的数据类型 可能和参与运算的变量类型不一致

2. 在进行除法运算, 整数除以整数,不会保留小数位,除非其中一方是浮点数

3. 取模运算对于浮点数同样有效

-------



### 7.3拓展算术运算符

**+= -= /= *= %= ++  --**

拓展算数运算符可以理解为算数运算符的简写,但是算数运算符会改变结果的数据类型

拓展算数运算符直接在原来的变量上进行操作,所以不会改变变量的数据类型 

++|--

可以放在变量的前面和后面，在变量后面，先让变量变化，在参与运算；在变量后面，先让变量变化，再参与运算。

------------



code:

```java
public class code01 {
    public static void main(String[] args) {
        //赋值运算符
        int a = 10;
        System.out.println(a);
        System.out.println("\n");

        //算术运算符
        System.out.println(a+1);
        System.out.println(a-1);
        System.out.println(a*2);
        System.out.println(a/2);
        System.out.println(a%2);
        System.out.println("\n");

        //拓展算术运算符
        System.out.println(a);
        System.out.println("\n");

        a+=1;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a%=3;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
    }
}
```

--------



### 7.4练习

**练习1 准备任意一个四位整数 倒序输出**

1234  >>>> 4321

code：

```java
public class code02 {
    public static int func(int a){
        return  a%10*1000 +a/10%10*100 + a/100%10*10 + a/1000%10;
    }
    public static void main(String[] args) {
        System.out.println(func(1234));
    }
}
```

-----------------



**练习2 互换两个整数的值**

a=10,b=1 >>>> a=1,b=10

code:

```java
public class code03 {
    public static void main(String[] args) {
        int a=10;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        a+=b;
        b=a-b;
        a-=b;
        System.out.println(a);
        System.out.println(b);
    }
}
```

------------



### 7.5 关系运算符

数据大小关系 ,运算结果是boolean值

**<  > <=  >= == !=** 

code:

```java
public class code04 {
    public static void main(String[] args) {
        byte a = 10 , b = 20 , c = 30;
        System.out.println(a>c);
        System.out.println(a<c);
        System.out.println(b<=c);
        System.out.println(b>=c);
        System.out.println(b==c);
        System.out.println(a!=c);
    }
}
```

-------------



### 7.6 逻辑运算**符**

**& | ^ && || !**

运算结果为boolean值

| 运算符 | 名字         | 说明                                                         |
| ------ | ------------ | ------------------------------------------------------------ |
| &      | 逻辑与运算   | 并且：多个条件同为true，则为true,一方为false则为false        |
| \|     | 逻辑或运算   | 或者：多个条件任意一个为true，则为true，全为false才为false   |
| &&     | 短路与运算   | 并且：同&，如果前面的一项为false ，<br />后面的就不再判断（不再执行表达式） |
| \|\|   | 短路或运算   | 或者：同\|，如果前面的一项为true ，<br />后面的就不再判断（不再执行表达式） |
| ^      | 逻辑异或运算 | 相同为假，不同为真                                           |
| !      | 逻辑非运算   | 取反                                                         |

code:

```java
public class code05 {
    public static boolean biggerThan(byte a,byte b){
        System.out.println("biggerThan func used!");
        return a > b;
    }
    public static void main(String[] args) {
        byte a = 10, b = 20, c = 20;
        System.out.println(biggerThan(b,a) & b == c);
        System.out.println(biggerThan(a,b) | b == c);
        System.out.println(a == b && biggerThan(b,c));
        System.out.println(b == c || biggerThan(b,c));
        System.out.println();
        System.out.println(a == b ^ b != c);
        System.out.println(a != b ^ b == c);
        System.out.println(a == b ^ b == c);
        System.out.println();
        System.out.println(!(a>b));
    }
}
```

-------------



### 7.7位运算符

**\>> << >>>  & | ^ ~** 

位运算符是在二进制上运算的符号

| 运算符 | 名字           | 说明                                                         |
| ------ | -------------- | ------------------------------------------------------------ |
| <<     | 左移运算       | 左移n位就相当于  原值×2<sup>n</sup>，不会移动符号位，第一位舍去 |
| >>     | 右移运算       | 右移n位就相当于 原值×2<sup>-n</sup>，不会移动符号位，最后一位舍去 |
| >>>    | 不带号右移运算 | 直接将每一位右移，不考虑符号                                 |
| &      | 按位与运算     | 对比每一位，同为1则为1，一方为0则为0，后生成新数             |
| \|     | 按位或运算     | 对比每一位，同为0则为0，一方为1则为1，后生成新数             |
| ^      | 按位异或运算   | 相同为0，不同为1，后生成新数                                 |
| ~      | 按位取反运算   | 若n为正数，~n=-(n+1)，若n为负数，~n=\|n\|-1                  |

code:

```java
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
```

----------



### 7.8 条件运算符

**? :**

Java中唯一一个三目运算符，写法：`条件?值:值`

code:

```java
public class code07 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a > b? a : b);
    }
}
```

-------------

---------



### 7.9运算符优先级

算数运算符>条件运算符>关系运算符>逻辑运算符>赋值运算符

----------



## 8.流程控制（code_p4)

### 8.1 流程控制的分类

+ 顺序结构 从上到下一行一行执行
+ 分支结构 根据条件选择不同分支执行
+ 循环结构 需要反复执行的结构

-------



### 8.2 分支结构-if

**if(条件){} 【else if =(条件){}】【else{}】**

从上到下挨个检查条件是否成立，如果其中某个条件成立了则执行对应分支代码，其余条件不再判断。

code:

```java
public class code01 {
    public static void func(int a){ 
        if(a%3==0 && a%2==0){
            System.out.println("分支1执行！\n输入的数即是2的倍数也是3的倍数");
        }
        else if (a%2==0){
            System.out.println("分支2执行！\n输入的数是2的倍数！");
        }
        else if(a%3==0){
            System.out.println("分支3执行！\n输入的数是3的倍数");
        }
        else{
            System.out.println("分支4执行！\n输入的数即不是2的倍数也不是3的倍数");
        }
    }
    public static void main(String[] args) {
        func(10);
        func(30);
        func(5);
    }
}
```

练习：给定月份，输出该月份所在的季节以及该季节的主要活动

code:

```java
public class code02 {
    public static void func(int month){
        if(month < 1 || month > 12){
            System.out.println("输入月份有误");
            return;
        }
        if (3 <= month && month <= 5){
            System.out.println("春季，播种");
        }
        else if(6<= month && month <=8){
            System.out.println("夏季，吃烧烤");
        }
        else if(9<=month && month<=11){
            System.out.println("秋季，秋收");
        }
        else {
            System.out.println("冬季，睡觉");
        }
    }

    public static void main(String[] args) {
        func(2);
        func(5);
        func(7);
        func(9);
    }
}
```

练习：给定月份和年份  输入当月的天数

code:

```java
public class code03 {
    public static void func(int month,int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31天");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("30天");
        }
        else{
            if (year%4==0){
                System.out.println("29天");
            }
            else{
                System.out.println("28天");
            }
        }
    }

    public static void main(String[] args) {
        func(12,2021);
        func(2,2020);
    }
}
```

---------------



### 8.3 从键盘录入信息

1. 导入包：`import java.util.Scanner`
2. 创建扫描仪对象：`Scanner 扫描仪名 = new Scanner(System.in);`
3. 从键盘录入信息：`扫描仪名.next【nextInt,nextDouble.....】（）;`
4. 释放资源`扫描仪名.close()`

code：

```java
import java.util.Scanner;
public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入一个整数： ");
        int inputVal = sc.nextInt();
        System.out.println("您输入的是："+inputVal);
    }
}
```

--------



### 8.4 分支语句-switch

**switch(变量){ case 变量可能出现的值:{...;break;} case变量可能出现的值:{...;break;}  default:{}}**

switch中放的变量只能是 **byte  short  int  char  String enum **

```java
public class code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输  入  密  码：");
        switch (sc.nextInt()){
            case 114514:{
                System.out.println("哼啊啊啊啊");
                break;
            }
            case 1919810:{
                System.out.println("哼啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                break;
            }
            default:{
                System.out.println("压力马斯内。");
            }
        }
    }
}
```

----------------



### 8.5 循环结构-while

**while（条件）{循环体}**

先判断条件是否成立，如果成立，那么执行循环体。

执行完循环体再次判断条件是否成立，如果成立继续执行， 知道条件不成立循环结束。

code:

```java
public class code06 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            System.out.println(i++);
        }
    }
}
```

练习（使用while循环）：

1. 给定一个整数，输出1~该整数的全部奇数的和。
   （Integer.MIN_VALUE<该整数<Integer.MAX_VALUE）
2. 给定一个整数，输出1~该整数的所有5的倍数，三个一行。
   （Integer.MIN_VALUE<该整数<Integer.MAX_VALUE）
3. 从键盘录入任意整数，颠倒输出。
   （Integer.MIN_VALUE<该整数<Integer.MAX_VALUE）
4. 从键盘录入学生考试的科目和学生的每科分数，输出：总分，最高分，最低分，平均分
5. 判断一个数是不是水仙花数（水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
6. 输出1~1000的所有水仙花数
7. 判断一个数是不是素数（素数是指在大于1的[自然数](https://baike.baidu.com/item/自然数/385394)中，除了1和它本身以外不再有其他[因数](https://baike.baidu.com/item/因数/9539111)的自然数。）
8. 给定一个整数，输出1~该整数的所有素数，每行三个
   （Integer.MIN_VALUE<该整数<Integer.MAX_VALUE）

code:

```java
import java.util.Scanner;
public class code07 {
    private static int input(){
        Scanner sc = new Scanner(System.in);;
        int res = sc.nextInt();
        return res;
    }

    private static void func1(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
        }
        int i= 1;
        long res = 0L;
        while(i <= inputV){
            if (i % 2 != 0){
                if(_inputV>0){
                    res += i;
                }
                else if(_inputV<0){
                    res -= i;
                }
            }
            i++;
        }
        System.out.println("1到"+_inputV+"的全部奇数的和是"+(long)res);
    }
    
    private static void func2(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
        }
        System.out.println("从1到"+_inputV+"的全部5的倍数为：");
        int i = 1, j = 1;
        while (i <= inputV){
            if(j>3){
                j = 1;
                System.out.print("\n");
            }
            if (i%5 == 0){
                System.out.print((_inputV<0?"-":"") + i+"\t");
                j++;
            }
            i++;
        }
    }

    private static void func3(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
            System.out.print("-");
        }
        //检测位数
        int a = inputV, b = 1000000000, c = 11;//c就是位数
        while(a == inputV){
            a = inputV % b;
            b /= 10;
            c--;
        }
        int i = 1;
        c--;
        int _c = c;
        while (i <= (int) Math.pow(10,_c)){
            c = _c;
            int temp = inputV;
            temp /= i;
            while(temp>=10){
                int x =  (int)Math.pow(10,c--);
                temp %= x;
            }
            System.out.print(temp);
            i*=10;
        }
    }

    private static void func4(){
        System.out.print("输入英语成绩：");
        int eS = input();
        System.out.print("输入语文成绩：");
        int cS = input();
        System.out.print("输入数学成绩：");
        int mS = input();
        System.out.println("本次考试总分"+(eS+cS+mS)+"分");
        System.out.println("最高分为"+((eS>cS?eS:cS)>mS?(eS>cS?eS:cS):mS)+"分");
        System.out.println("最低分为"+((eS<cS?eS:cS)<mS?(eS<cS?eS:cS):mS)+"分");
        System.out.println("本次考试平均成绩"+(eS+cS+mS)/3+"分");
    }

    private static boolean func5(int inputV){
        if (inputV > 999 || inputV <100){
            return false;
        }

        if ((Math.pow((inputV/100%10),3))+(Math.pow((inputV/10%10),3))+(Math.pow((inputV/1%100%10),3)) == inputV){
            return true;
        }
        return false;
    }

    private static void func6(){
        System.out.println("100~1000的全部水仙花数:");
        int i = 100;
        while(i<=1000){
            if(func5(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    private static boolean func7(int inputV){
        if (inputV < 1){
            return false;
        }
        int i = 2;
        while (i < inputV){
            if (inputV%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    private static void func8(int inputV){
        if (inputV < 1){
            System.out.println("输入小于1");
            return;
        }
        System.out.println("1到"+inputV+"的所有质数：");
        int i = 1, j = 1;
        while (i <= inputV){
            if(j>3){
                j = 1;
                System.out.print("\n");
            }
            if (func7(i)){
                System.out.print(i+"\t");
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
//      func1(input());
//      func2(input());
//      func3(input());
//      func4();
//      System.out.println(func5(input())?"是水仙花数":"不是水仙花数");
//      func6();
//      System.out.println(func7(input())?"是素数":"不是素数");
//      func8(input());
    }
}
```

------



### 8.6 生成随机数

`Math.random()`,

(int)Math.random()*x+y生成范围：y~(x+y-1)

练习：

模拟回合制打怪游戏

玩家 血值315 

怪物 血值500

玩家和怪物互砍 

玩家每次攻击怪物产生5-8点伤害

怪物每次攻击玩家产生3-5点伤害

采用回合制 一方挂掉 游戏结束

用程序模拟战斗过程

code:

```java
public class code08 {
    private static int randInt(int min, int max){
        return (int) (Math.random() * (max - min)) +min;
    }
    public static void main(String[] args) {
        int time = 0;
        int pHP = 315;
        int mHP = 500;
        while (true){
            System.out.println("-----------第"+(++time)+"回合------------");

            //玩家攻击
            int pDamage = randInt(5,8);
            System.out.println("玩家攻击！造成了"+pDamage+"点伤害！");
            mHP -= pDamage;
            //检测怪物是否挂掉
            if (mHP <= 0){
                System.out.println("怪物挂掉，游戏结束！") ;
                break;
            }

            //怪物攻击
            int mDamage = randInt(3,5);
            System.out.println("怪物攻击！造成了"+mDamage+"点伤害！");
            pHP -= mDamage;
            //检测玩家是否挂掉
            if (pHP <= 0){
                System.out.println("玩家挂掉，游戏结束！") ;
                break;
            }
        }
    }
}
```

--------------



### 8.7 循环的嵌套

循环是可以嵌套的。

练习：

一百担粮食 用一百匹马一次运走

大马  一次驼 4担粮食

中型马 一次驼 2担粮食

小型马 两匹驼1担粮食

问 三种马各有多少匹

code:

```java
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
```

-----------



### 8.8 循环结构-do while

**do{ 循环体 }while(条件);**

while循环是先判断条件是否成立，如果成立执行循环体；而do while循环是先执行循环体，再判断条件是否成立。结论：**无论条件是否成立，循环体至少执行一次。**

code：

```java
public class code10 {
    public static void main(String[] args) {
        int i = 100;
        do {
            System.out.println("i="+i);
            i++;
        }
        while (i < 10);
    }
}
```

练习：给定任意正整数，倒序输出。

code:

```java
import java.util.Scanner;
public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do{
            System.out.print(num%10);
            num /= 10;
        }while (num!=0);
    }
}
```

------



### 8.9 循环结构-for

**for(初始值; 循环条件; 迭代)**【初始值，循环条件和迭代都可以放在小括号中，也都可以不放在小括号中】

如果初始值放在for循环之外，那么初始值使用范围比较大，在for循环之外仍然可以使用，
如果初始值放在for循环之内，那么初始值使用范围比较小，只能在当前for循环内使用。

迭代如果放在for循环体中，可以由我们自己决定什么时候执行迭代，
如果迭代放在for循环的小括号中，那么意味着迭代在循环体的最后一行执行。

for循环可能比while更常用(
因为for循环可以控制初始变量为内部的局部变量，所以它更符合高内聚，低耦合的程序设计原则。
高内聚：程序的模块内部链接可以特别紧密（越紧密越好
低耦合：程序的模块和模块之间的关联越简单越好

练习：

1. 输入x，打印一个x*x的直角三角形(x>0)
2. 打印九九乘法表
3. 输入x，打印一个x*x的平行四边形（x>0）
4. 输入x，打印一个x*x的等腰三角形 
5. 输入x，打印一个上底为x，下底为y的等腰梯形
6. 输入x，输出x的阶乘（x>0）
7. 输入x，y，求x的y次方
8. 棋盘上的麦粒问题
   棋盘16格，第一个格子上放一个麦粒，之后每一个格子上的麦粒个数都是上一个格子麦粒个数的两倍，每个麦粒0.0001克，求麦粒总重量。(保留3位小数)
9. 模拟密码验证问题
   从键盘录入六位密码，验证密码是不是六位，如果不是六位，提示用户重新录入，直到录入的是六位为止。
   校验密码是否正确，三次以内输入密码正确显示欢迎，不正确显示密码错误。

```java
import java.util.Scanner;
public class code12 {
    private static int input(){
        Scanner sc = new Scanner(System.in);;
        int res = sc.nextInt();
        return res;
    }

    private static void func1(int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func2(){
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i+"×"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    private static void func3(int x){
        for (int i = x; i > 0;){
            i--;
            for (int _i = i; _i > 0; _i--){
                System.out.print(" ");
            }
            for (int _i = 0; _i < x; _i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func4(int x){
        for (int i = 0; i < x;){
            int printNum = i+(++i);
            int spaceNum = x-(printNum)/2;
            for (int _i = 0; _i < spaceNum; _i++){
                System.out.print(" ");
            }
            for (int _i = 0; _i < printNum; _i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func5(int x, int y){
        for (int i = 0 ; i < (x>y?x-y:y-x)-1; i++){
            for (int _i = 0; _i < x-((x<y?x:y) + i*2)/2; _i++){
                System.out.print(" ");
            }
            for (int _i = 0; _i < (x<y?x:y) + i*2; _i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void func6(int x){
        int res = x--;
        System.out.print(res);
        for (int i = x; i > 0; i--){
            System.out.print("×"+i);
            res *= i;
        }
        System.out.println("="+res);
    }

    private static void func7(int x, int y){
        int _x = x;
        for (int i = 0; i < y; i++){
            x *= _x;
        }
        System.out.println(x);
    }

    private static void func8(){
        int p = 1;
        long sum = 1L;
        for (int i = 0; i < 15; i++){
            p *= 2;
            sum += p;
        }
        System.out.println("麦粒共"+String.format("%.3f",sum*0.0001)+"克。");
    }

    private static void func9(int key){
        int pswd = input();
        while (pswd < 100000 || pswd >999999){
            System.out.println("请输入六位数密码");
            pswd=input();
        }
        for (int i = 2; i > 0; i--){
            if (pswd == key){
                System.out.println("欢迎。");
                return;
            }
            else {
                System.out.println("输入错误，请重新输入。还可以尝试"+i+"次。");
                pswd = input();
                while (pswd < 100000 || pswd >999999){
                    System.out.println("请输入六位数密码");
                    pswd=input();
                }
            }
        }
        System.out.println("尝试次数过多，吞卡。");

    }
    public static void main(String[] args) {
//        func1(input());
//        func2();
//        func3(input());
//        func4(input());
//        func5(input(),input());
//        func6(input());
//        func7(input(),input());
//        func8();
//        func9(114514);
    }
}
```

------------



### 8.10 循环控制关键字

**break continue return** 

+ break可以停止循环继续执行，但只能停止最内层的循环，如果想要停止外层循环，那么需要给外层做标记。
+ continue可以停止当前循环执行一次，循环从下一次继续执行
+ return可以停止当前的方法，回到主调方法。

---------



## 9 数组(code_p5)

### 9.1 什么是数组

数组（Array）是一种**引用数据类型**，可以解决大量数据的命名问题和大量数据存储和传递问题。

------------



### 9.2 数组的创建

数组的创建分为静态创建和动态创建两种

静态创建；

+ **`数据类型[] 数组名={数据};`**
+ **`数据类型[] 数组名=new 数据类型[]{数据};`**

数组中的每一个数据叫元素,数组中的元素类型都是相同或者相近的。（可以在double[]里面放个float，但不可以在String[]中放个float）（隐式类型转换）

动态创建：

动态：当数组创建时，我们还不确定里面对的值是什么，仅仅知道数据的个数

+ **`数据类型[] 数组名 = new 数据类型[数据的长度]；`**

数组的长度：数组的元素个数

code:

```java
public class code01 {
    public static void main(String[] args) {
        int[] stuCNScore = {100,98,115,72,96};
        int[] stuENScore = new int[]{101,120,119,118,95};
        int[] stuMathsScore = new int [5];
    }
}
```

---------



### 9.3  数组的属性，特点，使用细节

**数组的索引机制：**

索引：多个数据虽然使用同一个标识符，但每个数据默认都有自己的编号。索引由数组自动生成并维护，默认第一个元素的索引为0，后面的索引依次递增。索引本身是整数 int。

访问数组中的元素：**`数组名[索引值]`**

修改数组中的元素：**`数组名[索引值] = 新值`**

或许数组长度属性：**`数组名.length`**

确定索引范围：**0~（数组长度-1）**

**数组的特点：**

1. 内存特点：内存分为栈内存和堆内存，栈内存主要用于执行方法，存储量相对较小；堆内存用于存出大量数据，存储量相对较大。创建数组的时候，在堆内存上开辟出一段连续空间，用于存储数组中的元素，栈内存上实际存储的是数组首元素的地址，栈内存存储机制其实就是引用堆内存中的数据。
   **基本数据类型创建的变量存储在栈内存中，是方法中的，内部的局部的变量。数据量比较小，一种临时的使用。**
   **引用数据类型创建的变量存储在堆内存中，栈内存引用堆内存上的地址，占用两块。数据量比较大，一种持久的使用。**

  

2. 数组一旦创建，长度是不可改变的。

   

3. 数组存储数据增加和删除数据比较麻烦。但是根据索引访问数据非常快。
   数组根据索引查询数据的方式是计算得来的。目标元素的地址=首元素地址+索引+数据长度，通过较少次数的运算就可以快速定位元素，即使数组元素非常多，依据索引查询数据也是极快的。

   

4. 数组存储数据的特点

   数组的数据在内存上是连续的 

   根据索引查询数据快

   面对数据的增加和删除 需要大量移动元素或者重新创建数组 

   一般经常修改或者查询,但是基本不会增加和删除的数据适合使用数组存储  

---------------



### 9.4 数组的遍历

+ 使用for循环遍历

+ 使用增强型for循环——foreach循环遍历
  针对于数组的增强型for循环，简化了for循环
  **`for(数据类型 临时变量名:数组名){循环体}`**

foreach循环在写法上更为简单，没有索引
而for循环通过索引查询元素，在循环内部可以通过索引修改元素

code：

```java
public class code03 {
    public static void main(String[] args) {
        int[] array = {13,54,24,76,45,53,23};
        //for循环
        for (int index = 0; index < array.length; index++){
            System.out.print(array[index]+"\t");
        }
        //foreach循环
        System.out.println();
        for (int i:array){
            System.out.print(i+"\t");
        }
    }
}
```

----------------



### 9.5 查找数组中的最大值，最小值及其索引

code:

```java
public class code04 {
    public static void main(String[] args) {
        int[] arr = {12,45,78,35,49,65,33,1};
        int max=arr[0];
        int maxIndex=0;
        int min = arr[0];
        int minIndex= 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<=arr[i]){
                max=arr[i];
                maxIndex=i;
            }
            if(min>=arr[i]){
                min=arr[i];
                minIndex=i;
            }
        }

        System.out.println("最大值为:"+max);
        System.out.println("最大值索引为"+maxIndex);
        System.out.println("最小值为:"+min);
        System.out.println("最小值索引为"+minIndex);
    }
}
```

------------



### 9.6 查找数组中元素的索引

code:

```java
public class code05 {
    public static void main(String[] args) {
        int target = 1;
        int index = -1, _index = -1;
        int[] arr = {455,123,4,1,3,6545,8,689,1,864,18648,385,86};
        //查找元素第一次出现位置
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                index = i;
                break;
            }
        }
        for (int i = arr.length-1; i>=0; i--){
            if(arr[i] == target){
                _index = i;
                break;
            }
        }
        System.out.println("数据第一次出现索引为"+index);
        System.out.println("数据最后一次出现索引为"+_index);
        System.out.println(index==_index?"数据仅出现一次":"数据出现多次");
    }
```

------------



### 9.7 数组的合并(向数组中追加元素)

code:

```java
public class code06 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={11,22,33,44,55,66,77,88,99};
        int[] c = new int[a.length+b.length];
        for(int i =0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int x:c){
            System.out.print(x+"\t");
        }
    }
}
```

练习：在arr数组中索引为x 的位置 插入一个元素  n（arr为int[]）

code：

```java
public class code07 {
    public static int[] addEle(int[]arr, int x, int n){
        int[] nArr = new int[arr.length+1];
        for (int i = 0; i < x; i++){
            nArr[i] = arr[i];
        }
        nArr[x] = n;
        for (int i = x+1; i < nArr.length; i++){
            nArr[i] = arr[i-1];
        }
        return nArr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9,10};
        for (int i:array){
            System.out.print(i+"  ");
        }
        System.out.println();
        array = addEle(array,5,6);
        for (int i:array){
            System.out.print(i+"  ");
        }
    }
}
```

------



### 9.8 数组的缩容（删除数组中的元素）

+ 移动元素方案：
  好处：不需要创建新数组，省内存，快。坏处：容易造成数组结尾有闲置元素位。单独与需要一个变量来统计数组中有效元素的个数。
+ 创建新数组方案：
  好处：不会有空余元素位。坏处：需要重新创建数组。

code:

```java
public class code08 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int size_array1 = array1.length;
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        int delIndex = 4;
        //移动元素方案
        for (int i = delIndex;i < array1.length-1;i++){
            array1[i] = array1[i+1];
        }
        array1[array1.length-1] = 0;
        size_array1-=1;
        for (int i = 0; i < size_array1; i++){
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        //创建新数组方案
        int[] nArr = new int[array2.length-1];
        for (int i = 0; i < delIndex; i++){
            nArr[i] = array2[i];
        }
        for (int i = delIndex; i < array2.length-1; i++){
            nArr[i] = array2[i+1];
        }
        array2 = nArr;
        for (int i : array2){
            System.out.print(i + "\t");
        }
    }
}
```

------------------



### 9.9 练习

int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};

将上述数组中的奇数和偶数分别存放于不同的两个数组

code:

```java
public class code09 {
    private static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
        int a_size = 0, b_size = 0; //偶数个数
        for(int i:arr){
            if(i % 2 == 0){
                b_size++;
            }
            else {
                a_size++;
            }
        }
        int[] a = new int[a_size], b = new int[b_size];
        int aIndex = 0, bIndex = 0;
        for(int i:arr){
            if(i % 2 == 0){
                b[bIndex] = i;
                bIndex++;
            }
            else {
                a[aIndex] = i;
                aIndex++;
            }
        }

        printArr(arr);
        System.out.print("奇数:");
        printArr(a);
        System.out.print("偶数:");
        printArr(b);
    }
}
```

-------



### 9.10 Arrays 工具类

Arrays是JRE中Java基本类库提供的一个数组工具类，封装了一些排序，查找极值，遍历输出等操作。

+ `Arrays.sort`：排序
+ `Arrays.binarySearch`:二分查找：如果找到元素返回索引，没找到返回负数，使用时要求数组必须是升序的。
+ `Arrays.toString`返回1给定数组的字符串表达式
+ `Arrays.copyOf`复制数组

code:

```java
import java.util.Arrays;
public class code10 {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("元素74的索引是"+Arrays.binarySearch(arr,74));
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr,6);
        System.out.println(Arrays.toString(arr2));
    }
}
```

-------



### 9.11 数组的复制

数组名是数组的引用地址，这就导致当赋值的时候，只是把引用地址拷贝过去，而不是创建新数组。

**`数据类型 新数组 = Arrays.copyOf(旧数组,目标长度);`** 

**`System.arraycopy(旧数组,起始索引,目标数组,目标索引,数据长度);`**

~~其实Arrays.copyOf内部还是System.arraycopy实现的啦~~

code:

```java
import java.util.Arrays;
public class code11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[6];
        System.arraycopy(arr,2,arr3,1,5);
        System.out.println(Arrays.toString(arr3));
    }
}
```

----------



9.12 数组的冒泡排序算法

从第一个元素开始，一次对比相邻的两个元素，如果发现前边的元素比后边的元素大，那么进行位置互换，第一轮对比互换结束，可以保证最大的元素一定在最后；第二轮对比互换，能够保证次大的元素一定在倒数第二位。以此类推，进行到第length-1轮，排序完成

code:

```java
import java.util.Arrays;

public class code12 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,7,1,4,8,3,2,1};
        System.out.println(Arrays.toString(arr));
        //j:控制对比互换执行轮数
        for (int j = 0; j < arr.length-1; j++){
            //完成一轮元素的对比互换
            for (int i = 0; i < arr.length-1-j; i++){
                //如果发现前面的元素比后面的元素大
                if(arr[i] > arr[i+1]){
                    //前后元素位置互换
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
```

练习 从键盘录入学生人数和每个学生的姓名以及分数 按照分数降序输出 学生名次 学生姓名 学生分数

code:

```java
import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数: ");

        int stuNum = sc.nextInt();
        String[] stuName = new String[stuNum];
        int[] stuScore = new int[stuNum];

        for (int i = 0; i < stuNum; i++){
            System.out.print("请输入第"+(i+1)+"个学生的姓名：");
            stuName[i] = sc.next();
            System.out.print("请输入第"+(i+1)+"个学生的分数：");
            stuScore[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < stuScore.length-1; j++){
            for (int i = 0; i < stuScore.length-1-j; i++){
                if (stuScore[i]<stuScore[i+1]){
                    int temp = stuScore[i];
                    stuScore[i] = stuScore[i+1];
                    stuScore[i+1] = temp;
                    String temp1 = stuName[i];
                    stuName[i] = stuName[i+1];
                    stuName[i+1] = temp1;
                }
            }
        }
        for (int i = 0; i < stuName.length; i++){
            System.out.println("第"+(i+1)+"名 "+stuName[i]+" 分数："+stuScore[i]+"分");
        }
    }
}
```

--------------



### 9.12 二维数组

一个元素是数组的数组。

**二维数组的创建：**

+ 静态创建：**`数据类型 [][]  数组名={{},{},}{}....};`**
   **`数据类型[][]  数组名=new 数据类型[][]{{},{},{}......};`**

+ 动态创建：**`数据类型 [][]  数组名=new 数据类型[外围数组长度][内部数组长度];`**

**二维数组的遍历：**

使用循环。

**二维数组应用：**

​	从键盘录入学生人数 考试科目数 以及每个学生的每科分数

​	输出每个学生的最高分 最低分 总分 平均分

code:

```java
import java.util.Scanner;

public class code14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入学生人数");
        int r=sc.nextInt();
        System.out.println("请录入考试科目数");
        int k =sc.nextInt();
        int[][] grade=new int[r][k];
        // 录入分数的过程
        /*控制录入的学生*/
        for (int i = 0; i <r ; i++) {
            System.out.println("请录入第"+(i+1)+"个学生的成绩");
            // 控制录入的科目
            for (int j = 0; j <k ; j++) {
                System.out.println("请录入第"+(i+1)+"个学生的第"+(j+1)+"科成绩");
                grade[i][j]=sc.nextInt();
            }
        }
        // 计算和输出分数的过程
        for (int i = 0; i <r ; i++) {

            // 计算一个学生所有科目的分数
            int sum=0;
            int max=grade[i][0];
            int min=grade[i][0];
            for (int j = 0; j <k ; j++) {
                // 求一个学生的分数和
                sum+=grade[i][j];
                /*求一个学生的最高分*/
                if (max < grade[i][j]) {
                    max=grade[i][j];
                }
                /*求一个学生的最低分*/
                if (min > grade[i][j]) {
                    min=grade[i][j];
                }
            }
            System.out.println("第"+(i+1)+"个学生的总分为:"+sum+"\t最高分:"+max+"\t为最低分:"+min+"\t为平均分为:"+(sum*1.0/k));
        }
        sc.close();
    }
}
```

----------------



## 10 方法（code_p6)

### 10.1 什么是方法

方法(method)是一段具有固定功能的代码片段，当程序中需要这个功能时，可以直接调用该代码片段，不需要将代码反复编写。固定的功能形成模块。可以减少重复代码的编写，可以减少程序的维护工作。public static void main(String[] args){}也是一种特殊的方法。

-----



### 10.2 方法的组成

**方法头+方法体**

例：public static void main(String[] args){};

方法头：

`public`访问修饰符：控制方法的使用范围

| 修饰符    | 作用                               |
| --------- | ---------------------------------- |
| public    | 公共的，整个项目任意位置都可以使用 |
| private   | 私有的，仅能在当前类中使用         |
| protected | 受保护的                           |
| default   | 缺省的                             |

`static`：静态的

`void`:返回值类型（void指不返回任何数据）

`main`方法名：方法的标识符，方法查找和调用的依据

`(String[] args)`参数列表：方法调用时必须传入的数据

异常列表：标志着当前方法在使用过程中可能出现的问题

`{}`方法体：方法具体运算的代码

----------



### 10.3 方法的调用

通过方法名调用方法并传参。

code:

```java
public class code01 {
    //主方法是程序的入口，由虚拟机自动执行
    public static void main(String[] args) {
        System.out.println("主方法调用");
        //通过方法名调用方法，同时传参
        System.out.println("主方法得到的结果是"+add(10,20));
    }

    //这不是程序的入口，需要我们手写代码，手动调用
    public static int add(int a, int b){
        System.out.println("add方法调用");
        System.out.println("add方法运算的结果是:"+(a+b));
        return a + b;
    }
}
```



### 10.4 方法的分类

**是否静态：**

+ 静态方法：类方法，有static修饰

+ 成员方法：实例方法，没有static修饰 

**有无返回值和参数：**

+ 无参数无返回值 

+ 无参数有返回值

+ 有参数无返回值

+ 有参数由返回值

----------



### 10.5 方法的相互调用

不仅主方法可以调用其他方法，自定义方法也可以调用其他方法。

方法不能相互调用或形成循环调用，只能单链式调用。

code:

```java
public class code02 {
    public static int sum(int[] arr){
        int res = 0;
        for (int i:arr){
            res += i;
        }
        return res;
    }
    public static int average(int[] arr){
        return sum(arr)/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("数组arr的元素平均值是"+average(arr));
    }
}
```

--------



### 10.6 方法的文档注释

```java
/**
* 方法的说明
* @param 参数名 参数的说明
* ...
* @return 返回值说明
*/
```

-----------



### 10.7 方法练习——双色球

```java
import java.util.Arrays;

public class code03 {
    /**
     * 该方法用于判断给定的数组中是否包含指定元素
     * @param arr 给定的数组
     * @param ele 要查找的元素
     * @return 查找不到返回false，查找到返回true
     */
    public static boolean eleInArray(int[] arr, int ele){
        for (int i : arr){
            if (i == ele){
                return true;
            }
        }
        return false;
    }
    public static int[] getLottery(){
        int[] lottery = new int[6], res = new int[7];
        //生成随机数
        for (int i = 0; i < 6; i++){
            int num = (int)(Math.random()*33+1);
            //避免出现重复值重复值
            while (eleInArray(lottery,num)){
                num = (int)(Math.random()*33+1);
            }
            //放入数组
            lottery[i]=num;
        }
        Arrays.sort(lottery);
        System.arraycopy(lottery,0,res,0,6);
        res[6] = (int)(Math.random()*33+1);
        return res;
    }

    public static void main(String[] args) {
        int[] lottery = getLottery();
        System.out.println("生成双色球数："+Arrays.toString(lottery));
    }
}
```

--------



### 10.8 方法执行的内存流程

<img src="https://img-blog.csdnimg.cn/20210209134218634.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl81MTY1NzgzMw==,size_16,color_FFFFFF,t_70" alt="image-20210209134010627" style="zoom:150%;" />

-----------



### 10.9 参数处理-按值传递和按引用传递

参数分两种，形式上的参数和实际运行的时候使用的参数。

**实参(实际运行的时候使用的参数）：**当调用方法时，我们实际传入的值

**形参(形式上的参数)：**方法的参数列表叫做形参，仅仅是形式上占位，它引导着我们的数据在方法体中如何使用，在方法体中，可以把形参当做有值的数据使用。



code:

```java
public class code04 {
    private static void changeValTo100(int a){
        a = 100;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        changeValTo100(x);
        System.out.println(x);
    }
}
```

上面的例子，**实参传递给形参的数据，是值，内存上形参和实参是不同的，分别独立，修改形参不会对实参造成影响。**这就是按值传递。

code：

```java
import java.util.Arrays;

public class code05 {
    private static void changeArrValTo100(int[] arr, int index){
        arr[index] = 100;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        changeArrValTo100(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
```

上面的例子，**实参传递给形参的数据不是真实的值，是数据所在地址，是引用的堆内存中的地址，形参和实参指向的是内存中的同一个数据，修改形参会对实参造成影响。**这就是按引用传递。

结论：**当参数是基本数据类型时，数据不占用堆内存，按值传递；当参数是引用数据类型时，数据占用堆内存，按引用传递。**

练习：定义一个方法 对一个整数类型的数组进行升序排列

code:

```java
import java.util.Arrays;

public class code06 {
    public static void sortArr_Ascending(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,41,58,97,654,351,487,9};
        System.out.println(Arrays.toString(arr));
        sortArr_Ascending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

------------



### 10.10 方法的挎包跨类调用

code:

code_p6\code07_add.java

```java
import java.util.Arrays;

public class code07_add {
    public static void sort_1(int[] arr){
        Arrays.sort(arr);
    }
}
```

code_6_add\code07_add2.java

```java
import java.util.Arrays;

public class code07_add2 {
    public static void sort_2(int[] arr){
        Arrays.sort(arr);
    }
}
```

code_p6\code07.java

```java
import java.util.Arrays;
import code_p6_add.code07_add2;

public class code07 {
    public static void main(String[] args) {
        int[] arr = {5,41,58,97,654,351,487,9};
        System.out.println(Arrays.toString(arr));
        code07_add.sort_1(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {45,87,698,3521,78,5889,248};
        System.out.println(Arrays.toString(arr1));
        code07_add2.sort_2(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}

```

导包：但我们调用的方法在不同包下的某个类时，需要将该类的路径导入进来。

*：通配符，包含当前包下所有类

-----



### 10.11 可变参数

当   `数据类型... 参数名`  作为形参时，给定参数可变（可以是多个单独的值，也可以是个数组），但在方法体内部仍然作为数组使用，如果传入多个单独变量，程序会自动将多个单独变量放入数组。

好处：

+ 可以传入数组
+ 可以传入多个单独变量
+ 传入多个单独变量的数量没有要求，是可以变化的。

code:

```java
public class code08 {
    public static void printArr(int... arr){
        for (int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArr(arr);
        printArr(1,2,3,4,5,6,7,8,9);
    }
}
```

 **可变参数使用要求**

+ 可变参数必须是参数列表中最后一个参数
+ 一个方法的参数列表只能有一个可变参数
+ 在方法重载时，可变参数和数组作为方法参数认为是相同参数

-------------



### 10.12方法重载

在同一个类中，多个同名方法的编写。

**通过传参不同实现。**

方法重载的条件：

+ 名字必须相同
+ 参数必须不同:
  在调用同名方法时无法根据方法名区分多个同名方法，但是可以根据传入的实参去匹配多个同名方法中的某一方法。
+ 参数可以有哪些不同：
  1. 个数不同
  2. 参数数据类型的顺序不同
  3. 参数数据类型不同

code:

```java
public class code09 {
    private static void method(){
        System.out.println("method1 invoked!");
    }
    private static void method(int a){
        System.out.println("method2 invoked!");
    }
    private static void method(int a, int b){
        System.out.println("method3 invoked!");
    }
    private static void method(int a, double b){
        System.out.println("method4 invoked!");
    }
    private static void method(double a, int b){
        System.out.println("method5 invoked!");
    }
    public static void main(String[] args) {
        method();
        method(1);
        method(1,2);
        method(1,1.0);
        method(1.0,1);
    }
}

```

练习：

定义一个方法 返回一个圆的周长  半径

定义一个方法 返回一个圆的面积  半径

定义一个方法 返回一个矩形的周长 长  宽

定义一个方法 返回一个矩形的面积 长  宽

定义一个方法 返回一个三角形的周长 三个边

定义一个方法 返回一个三角形的面积 三个边 海伦公式(百度)

要求 所有求周长的方法使用同一个方法名

​	 所有求面积的方法使用同一个方法名

输入为正整数，返回值保留两位小数，考虑四舍五入。

code:

```java
import java.util.Scanner;

public class code10 {
    static final double PI = 3.1415926;
    static Scanner sc = new Scanner(System.in);

    private static double get2decimal(double num){
        return ((int)((num*100)+0.5))/100.0;
    }

    private static double getC(int r){ //圆形周长
        return get2decimal(PI*2*r);
    }
    private static double getS(int r){ //圆形面积
        return get2decimal(PI*Math.pow(r,2));
    }
    private static double getC(int w, int h){ //矩形周长
        return get2decimal( 2*(w+h));
    }
    private static double getS(int w, int h){ //矩形面积
        return get2decimal(w*h);
    }
    private static boolean isT(int... arr){ //判断是不是三角形
        boolean res = arr[0] + arr[1] > arr[2];
        return res;
    }
    private static double getC(int a, int b, int c){ //三角形周长
        if (isT(a,b,c)){
            return get2decimal(a+b+c);
        }
        else {
            return -1;
        }
    }
    private static double getS(int a, int b, int c){ //三角形面积
        if (isT(a,b,c)){
            int p = (a+b+c)/2;
            return get2decimal(Math.sqrt(((p-a)*(p-b)*(p-c))));
        }
        else {
            return -1;
        }
    }

    private static int inputInt(String text){
        System.out.print(text);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("圆的周长为："+(getC(inputInt("求圆的周长。输入圆半径："))));
        System.out.println("圆的面积为："+(getS(inputInt("求圆的面积。输入圆半径："))));
        System.out.println("矩形的周长为："+(getC(inputInt("求矩形的周长。输入宽："),inputInt("输入高："))));
        System.out.println("矩形的面积为："+(getS(inputInt("求矩形的面积。输入宽："),inputInt("输入高："))));
        System.out.println("三角形的周长为："+(getC(inputInt("求三角形的周长。输入第一条边："),inputInt("输入第二条边："),inputInt("输入第三条边："))));
        System.out.println("三角形的面积为："+(getS(inputInt("求三角形的面积。输入第一条边："),inputInt("输入第二条边："),inputInt("输入第三条边："))));
        sc.close();
    }
}
```

-----



### 10.13 封装数组工具类

code:

```java
public class code11_ArraysUtil {
    // 6个
    /**
     * 升序排列一个byte数组
     * @param arr 要排序的byte数组
     */
    public static void sortASC(byte[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    byte temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个short数组
     * @param arr 要排序的short数组
     */
    public static void sortASC(short[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    short temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * 升序排列一个int数组
     * @param arr 要排序的int数组
     */
    public static void sortASC(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个long数组
     * @param arr 要排序的byte数组
     */
    public static void sortASC(long[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    long temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个float数组
     * @param arr 要排序的float数组
     */
    public static void sortASC(float[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    float temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 升序排列一个double数组
     * @param arr 要排序的double数组
     */
    public static void sortASC(double[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    double temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
// 6个
    /**
     * 降序排列一个byte数组
     * @param arr 要排序的byte数组
     */
    public static void sortDESC(byte[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    byte temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个short数组
     * @param arr 要排序的short数组
     */
    public static void sortDESC(short[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    short temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * 降序排列一个int数组
     * @param arr 要排序的int数组
     */
    public static void sortDESC(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个long数组
     * @param arr 要排序的byte数组
     */
    public static void sortDESC(long[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    long temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个float数组
     * @param arr 要排序的float数组
     */
    public static void sortDESC(float[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    float temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    /**
     * 降序排列一个double数组
     * @param arr 要排序的double数组
     */
    public static void sortDESC(double[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    double temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

// 查找第一次 8个
    /**
     * 在给定的int数组中查找指定的int元素第一次出现的位置
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int firstIndexOf(int[] arr,int b){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的byte数组中查找指定的byte元素第一次出现的位置
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int firstIndexOf(byte[] arr,byte b){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    // short long float double char boolean



// 查找最后一次 8个
    /**
     * 在给定的byte数组中查找指定的byte元素最后一次出现的位置
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(byte[] arr,byte b){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的int数组中查找指定的int元素最后一次出现的位置
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(int[] arr,int b){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    // short long float double char boolean

    // 判断包含 8个
    /**
     * 判断给定的int数组是否包含指定的int元素
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(int[] arr,int b){
        int index = firstIndexOf(arr, b);
        return index>=0?true:false;
    }
    /**
     * 判断给定的byte数组是否包含指定的byte元素
     * @param arr 给定的byte数组
     * @param b 指定的byte元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(byte[] arr,byte b){
        int index = firstIndexOf(arr, b);
        return index>=0?true:false;
    }
    // byte short int long float double boolean char



//判断给定数组 包含指定元素多少次 8个
    /**
     * 判断给定int数组 包含指定int元素多少次
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 元素在数组中出现的次数
     */
    public static int containTimes(int[] arr,int b){
        int t =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }
        }
        return t;
    }


    // 判断给定数组 是否包含且仅包含一次给定的元素  8个

    /**
     * 判断给定int数组 是否包含且仅包含一次给定int的元素
     * @param arr 给定的int数组
     * @param b 要查找的in元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(int[] arr,int b){
        int i = containTimes(arr, b);
        return i==1?true:false;
    }
}
```

---------

