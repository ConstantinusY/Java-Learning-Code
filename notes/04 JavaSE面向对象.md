# 六、JavaSE——面向对象

## 1.面向对象和面向过程

面向过程和面向对象都是对软件分析、设计和开发的一种思想,它指导着人们以不同的方式去分析、设计和开发软件。

早期先有面向过程思想，随着软件规模的扩大，问题复杂性的提高，面向过程的弊端越来越明显的显示出来，出现了面向对象思想并成为目前主流的方式。两者都贯穿于软件分析、设计和开发各个阶段，对应面向对象就分别称为面向对象分析（OOA）、面向对象设计（OOD）和面向对象编程（OOP）。C语言是一种典型的面向过程语言，Java是一种典型的面向对象语言。

**总结：**

都是解决问题的思维方式，都是代码组织的方式。

面向过程是一种“执行者思维”，解决简单问题可以使用面向过程。面向对象是一种“设计者思维”，解决复杂、需要协作的问题可以使用面向对象。面向对象离不开面向过程：

宏观上：通过面向对象进行整体设计

微观上：执行和处理数据，仍然是面向过程。。

------



## 2.面向对象初探(code_p7)

### 2.1 什么是类和对象

类可以看做是一个模版，或者图纸，系统根据类的定义来造出对象。我们要造一个汽车，怎么样造？类就是这个图纸，规定了汽车的详细信息，然后根据图纸将汽车造出来。

**类：我们叫做class。 对象：我们叫做Object,instance(实例)**。我们说某个类的对象，某个类的实例。是一样的意思。

**总结：**

类可以看成一类对象的模板，对象可以看成该类的一个具体实例。

类是用于描述同一类型的对象的一个抽象概念，类中定义了这一类对象所应具有的共同的属性、方法。



**2.2 定义类和创建对象**

属性：**`field` 成员变量**

属性用于定义该类或该类对象包含的数据或者说静态特征。属性作用范围是整个类体。

在定义成员变量时可以对其初始化，如果不对其初始化，Java使用默认的值对其初始化。

| 数据类型     | 默认值   |
| ------------ | -------- |
| 整型         | 0        |
| 浮点型       | 0.0      |
| 字符型       | '\u0000' |
| 布尔型       | false    |
| 所有引用类型 | null     |

属性定义格式：

**[修饰符]  属性类型  属性名 = [默认值] ;**



方法：**`method`**

方法用于定义该类或该类实例的行为特征和功能实现。方法是类和对象行为特征的抽象。方法很类似于面向过程中的函数。面向过程中，函数是最基本单位，整个程序由一个个函数调用组成。面向对象中，整个程序的基本单位是类，方法是从属于类和对象的。

方法定义格式：

**[修饰符]  方法返回值类型  方法名(形参列表) { }**

void代表没有返回值；方法的作用：**重用代码，封装功能，便于修改**



**总结：**

 总结1：如何创建对象

**`类名 对象名 = new 类名();`**
  new 后面是构造方法

总结2：如何操作属性：

**`对象名.属性名`**

总结3：如何调用方法: 

**`对象名.方法名(实参列表)`**



code:

```java
package code_p7.code01;

public class Person {
    String name;
    int age;

    public void eat(){
        System.out.println(name+"さんはご飯を食べました。");
    }
    public void work(){
        System.out.println(name+"さんは働きました。");
    }
    public void rest(String site){
        System.out.println(name+"さんは"+site+"で休みました。");
    }
}
```

```java
package code_p7.code01;

public class code01 {
    public static void main(String[] args){
        Person P1 = new Person();
        P1.name = "リック·アストリ";
        P1.age = 24;
        P1.eat();
        P1.rest("アメリカ");
        P1.work();
    }
}
```

--------------



### 2.3 成员变量和局部变量

|                      | **成员变量**         | **局部变量**                       |
| -------------------- | -------------------- | ---------------------------------- |
| 代码中位置不同       | 类中定义的变量       | 方法或代码块中定义的变量           |
| 内存中位置不同       | 堆内存               | 栈内存                             |
| 是否有默认值         | 有                   | 没有                               |
| 代码作用范围（空间） | 当前类的方法         | 当前一个方法或代码块               |
| 作用时间不同         | 当前对象从创建到销毁 | 定义变量到所属方法或代码块执行完毕 |

----------------



### 2.4练习——计算器类

code:

Calculator.java:

```java
package code_p7.code02;

public class Calculator {
    String brand;
    double size;

    public int add(int... nums){
        int res = 0;
        for (int i : nums){
            res += i;
        }
        return res;
    }
    public int sub(int... nums){
        int res = nums[0]*2;
        for (int i : nums){
            res -= i;
        }
        return res;
    }
    public void show(){
        System.out.printf("购买了一个%s计算器，尺寸为%f\n",brand,size);
    }
}
```

code02.java:

```java
package code_p7.code02;

import java.util.Scanner;
public class code02 {
    private static int inputInt(String text){
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.brand = "A";
        calc.size = 11.4514;
        System.out.println("加法运算：");
        System.out.println("计算结果为"+calc.add(inputInt("输入第一个数"),inputInt("输入第二个数"),inputInt("输入第三个数")));
        System.out.println("减法运算：");
        System.out.println("计算结果为"+calc.sub(inputInt("输入第一个数"),inputInt("输入第二个数"),inputInt("输入第三个数")));
    }
}
```

-------------



### 2.5 构造方法及其重载

**构造方法**

对于一个类来说，一般有三种常见的成员：属性field、方法method、构造器constructor。这三种成员都可以定义零个或多个。

构造方法(constructor)也叫构造器，用于对象的初始化。构造器是一个创建对象时被自动调用的特殊方法，目的是对象的初始化。构造器的名称应与类的名称一致。**Java通过new关键字来调用构造器**，从而返回该类的实例，是一种特殊的方法。

 

**声明格式：**

**`[修饰符] 类名(形参列表){}`**

 

**构造器的4个要点：**

+ 构造器的方法名必须和类名一致！

+ 构造器通过new关键字调用！！

+ 构造器虽然有返回值，但是不能定义返回值类型(返回值的类型肯定是本类)，不能在构造器里使用return返回某个值。 

+ 如果我们没有定义构造器，则编译器会自动定义一个无参的构造方法。如果已定义则编译器不会自动添加！

构造方法也是方法，只不过有特殊的作用而已。与普通方法一样，构造方法也可以重载。

**注意：**

创建一个对象分为如下四步：

1. 分配对象空间，并将对象成员变量初始化为0或空
2. 执行属性值的显示初始化
3. 执行构造方法
4. 返回对象的地址给相关的变量

如果方法构造中形参名与属性名相同，需要使用this关键字区分属性与形参。   this.id 表示属性id；id表示形参id

------------



### 2.6 对象数组

code:

```java
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
```

---------------



### 2.7 this

**对象创建的过程和this的本质**

构造方法是创建Java对象的重要途径，通过new关键字调用构造器时，构造器也确实返回该类的对象，但这个对象并不是完全由构造器负责创建。创建一个对象分为如下四步：

1.  分配对象空间，并将对象成员变量初始化为0或空

2.  执行属性值的显示初始化

3.  执行构造方法

4.  返回对象的地址给相关的变量

this的本质就是“创建好的对象的地址”！  由于在构造方法调用前，对象已经创建。因此，在构造方法中也可以使用this代表“当前对象” 。

 

**this常见用法：**

+ 调用成员变量：如果成员变量和局部变量同名，this必须书写，用来区分两者；如果没有同名的局部变量，this可以不写

+ 调用成员方法：这种情况下，this可以省略

+ 调用构造方法：使用this关键字调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用，并且必须位于构造方法的第一句。

+ this不能用于static方法中。

code:

student.java:

```java
package code_p7.code05;

public class Student {
    //成员变量
    private final int sno;//学号
    private final String name;//姓名
    private final String sex;//性别
    private double score;//分数
    //构造方法
    public Student(int sno,String name,String sex ){
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }
    public Student(int sno,String name,String sex ,double score){
        this(sno,name,sex);
        this.score = score;
    }
    //成员方法
    public void study(){
        this.shout();
        System.out.println("在教室努力的学习中，代码量一行行提升了.....");
    }
    public void shout(){
        System.out.println("好好学习，天天向上。");
    }
    public void show(){
        System.out.printf("我是%d号学生%s，%s性，分数是%.0f",this.sno,this.name,this.sex,this.score);
    }
}
```

code05.java:

```java
package code_p7.code05;

public class code05 {
    public static void main(String[] args) {
        Student stu = new Student(114,"田所浩二","男",514);
        stu.study();
        stu.show();
    }
}
```

-------------



### 2.8 static变量

在类中，用static声明的成员变量为静态成员变量，也称为类变量。 类变量的生命周期和类相同，在整个应用程序执行期间都有效。它有如下特点：

+ 为该类的公用变量，属于类，被该类的所有实例共享，在类被载入时被显式初始化。

+ 对于该类的所有对象来说，static成员变量只有一份。被该类的所有对象共享！！

+ 一般用“类名.类属性/方法”来调用。（也可以通过对象引用或类名（不需要实例化）访问静态成员。）

+ 在static方法中不可直接访问非static的成员。

**总结：static变量和非static变量的区别：**

1. 份数不同：静态变量：1份；非静态变量：1个对象一份

2. 存储位置不同：静态变量：方法区；非静态变量：堆中

3. 内存分配空间的时间不同：静态变量：第一次加载类的时候；非静态变量：创建对象的时候

4. 生命周期不同。静态变量和类的生命周期相同；非静态变量的生命周期和所属对象相同

5. 调用方式不同

   + 静态变量：  通过类名调用  Student.classRoom

   ​       也可以通过对象名调用stu1.classRoom ="301" 不推荐

   + 非静态变量：通过对象名调用	stu1.name ="小张"; 

code:

Student.java

```java
package code_p7.code06;

public class Student {
    //成员变量
    final int sno;//学号
    final String name;//姓名
    final String sex;//性别
    double score;//分数
    String cup;
    static String waterMachine = "黑色高级饮水机";


    //构造方法
    public Student(int sno,String name,String sex ){
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }
    public Student(int sno,String name,String sex ,double score, String cup){
        this(sno,name,sex);
        this.score = score;
        this.cup = cup;
    }

    //成员方法
    public void study(){
        this.shout();
        System.out.println("在教室努力的学习中，代码量一行行提升了.....");
    }

    public void shout(){
        System.out.println("好好学习，天天向上。");
    }

    public void show(){
        System.out.printf("我是%d号学生%s，%s性，分数是%.0f\n我班饮水机是%s\n",this.sno,this.name,this.sex,this.score,waterMachine);
    }

    public void drink(){
        System.out.printf("我拿着我的%s在我班%s接水\n",cup,waterMachine);
    }
}
```

code06.java:

```java
package code_p7.code06;

public class code06 {
    public static void main(String[] args) {
        Student stu = new Student(114,"田所浩二","男",514,"黑色高级杯子");
        stu.study();
        stu.show();
        stu.drink();
        Student stu1 = new Student(1,"张三","男",600,"牙杯");
        stu1.show();
        stu1.drink();
        Student.waterMachine = "美的高级饮水机";
        stu.drink();
        stu1.drink();
    }
}
```

------------



### 2.9 static 方法

**static方法的作用**

访问static变量和static方法

static方法的调用方式

+ 通过类名调用

+ 通过对象名访问  

**使用注意：**

不可以

+ 静态方法中不可以访问非静态变量

+ 静态方法中不可以访问非静态方法

+ 静态方法中不可以访问this

理解：加载类的时候就加载静态变量和静态方法，此时可能还没有创建对象，所以非静态变量和非静态的方法还没有分配空间，无法访问

可以

+ 非静态方法中可以访问静态变量

+ 非静态方法中可以访问静态方法

理解：加载类的时候就已经加载静态变量和静态方法，创建对象后，非静态变量和非静态的方法才分配空间，此时静态变量和静态方法已经存在，可以访问

code:

Student.java:

```java
package code_p7.code07;

public class Student {
    private final String name;
    private static String classRoom;

    public Student(String name){
        this.name = name;
    }
    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }
    public static String getClassRoom() {
        return classRoom;
    }

    public void show(){
        System.out.printf("我是%s的%s\n",classRoom,name);
    }
}
```

code07.java:

```java
package code_p7.code07;

public class code07 {
    public static void main(String[] args) {
        Student stu = new Student("张三"),stu2 = new Student("李四");
        Student.setClassRoom("一班");
        stu.show();
        stu2.show();
        /*stu不建议*/Student.setClassRoom("二班");
        stu.show();
        stu2.show();
    }
}
```

---------------



### 2.11 局部代码块：

位于方法中，可以有多个，依次执行,定义的变量和作用范围是当前局部代码块

**`{代码}`**

code:

```java
package code_p7.code08;

public class code08 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a="+a);//可以访问a
        {
            System.out.println("a="+a);//可以访问a
            int b = 10;
            System.out.println("b="+b);//可以访问b
        }
        /*System.out.println("b="+b);*/ //不可以访问b
        {
            System.out.println("a="+a);//可以访问a
            /*System.out.println("b="+b);*/ //不可以访问b
            int c = 10;
            System.out.println("c="+c);//可以访问c
        }
        /*System.out.println("c="+c);*/ //不可以访问c
    }
}
```

---------------



### 2.12 成员代码块

位于类中，可以有多个，依次执行。

**每次创建对象的时候都执行。先执行代码块，再执行构造方法。**

可以将各个构造方法中公共的代码提取到代码块。

**匿名内部类不能提供构造方法，此时初始化操作放到代码块中**

code:

```java
package code_p7.code09;

public class code09 {
    {
        System.out.println("代码块1执行");
    }
    public code09(){
        System.out.println("构造函数执行");
    }
    {
        System.out.println("代码块2执行");
    }
    public static void main(String[] args) {
        code09 o1 = new code09();
        code09 o2 = new code09();
    }
    {
        System.out.println("代码块3执行");
    }
}
```

------



### 2.13 static代码块

位于类中，可以有多个，依次执行。

**第一次加载类的时候执行，只执行一次。**

**给静态变量赋初始值。  一般用于执行一些全局性的初始化操作**，比如加载数据库初始信息

code:

```java
package code_p7.code10;

public class code10 {
    static {
        System.out.println("static代码块执行");
    }
    {
        System.out.println("成员代码块执行");
    }
    public code10(){
        System.out.println("构造方法执行");
    }

    public static void main(String[] args) {
        code10 o1 = new code10();
    }
}
```

------------



## 3. 面向对象初探plus（code_p8)

### **3.1 package包**

为什么使用包?

文件太多，并且会有同名文件，需要不同级别的文件夹来存储；

包机制是Java中管理类的重要手段。开发中，我们会遇到大量同名的类，通过包我们很容易对解决类重名的问题，也可以实现对类的有效管理。

**除了以上考虑外，还和访问权限有密切关系**

如何定义包?

我们通过package实现对类的管理，package的使用有两个要点：

1. 包名：域名倒着写即可，再加上模块名，便于内部管理类。

2. 包名一律小写。

如何使用包?

通常是类的第一句非注释性语句。必须以；结尾。



**Java常用包**

|                    |                                                              |
| ------------------ | ------------------------------------------------------------ |
| **Java中的常用包** | **说明**                                                     |
| java.lang          | 包含一些Java语言的核心类，如String、Math、Integer、System和Thread，提供常用功能。 |
| java.awt           | 包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。 |
| java.net           | 包含执行与网络相关的操作的类。                               |
| java.io            | 包含能提供多种输入/输出功能的类。                            |
| java.util          | 包含一些实用工具类，如定义系统特性、使用与日期日历相关的函数。 |

-----------------



### 3.2 import导入

如果我们要使用其他包的类，需要使用import导入，从而可以在本类中直接通过类名来调用，否则就需要书写类的完整包名和类名。import后，便于编写代码，提高可维护性。

 

**注意要点**

+  默认是当前包的类和接口

+  Java会默认导入java.lang包下所有的类，因此这些类我们可以直接使用。

+  可以使用通配符，比如import com.bjsxt.oop.object.*; 
   会导入该包下所有类和接口（但不包括下级包）

+  如果导入两个同名的类，只能用包名+类名来显示调用相关类：java.util.Date date  = new  java.util.Date();

静态导入(static  import)是在JDK1.5新增加的功能，其作用是用于导入指定类的静态属性和静态方法，这样我们可以直接使用静态属性和静态方法。

code:

导入:

```java
package code_p8.code01;

import java.util.Vector;

public class code01 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        for (Integer i : v){
            System.out.print(i+"\t");
        }
    }
}
```

静态导入：

```java
package code_p8.code02;

import static java.lang.Math.*;

public class code02 {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(sqrt(64));
        System.out.println(pow(7, 2));
    }
}
```

----------



### 3.3 使用JavaDoc生成API帮助文档

IntelliJ IDEA 本身提供了很好的 JavaDoc 生成功能，以及标准 JavaDoc 注释转换功能，其实质是在代码编写过程中，按照标准 JavaDoc 的注释要求，为需要暴露给使用者的类、方法以及其他成员编写注释。然后使用 IDEA 的功能自动调用 javadoc.exe（JDK 自带的工具）根据源代码中的注释内容自动生成 JavaDoc 文档（超文本格式）。

code：

ArrayUtil.java

```java
package code_p8.code03;

/**
 * 此类封装了数组常用功能（迫真
 */
public class ArrayUtil {
    /**
     * 此方法用于在一个int数组中添加元素
     * @param arr 目标数组
     * @param ele 添加的元素（可以有多个）
     * @return 返回新数组
     */
    public static int[] addEle(int[] arr, int... ele){
        int[] res = new int[arr.length+ele.length];
        System.arraycopy(arr,0,res,0,arr.length);
        System.arraycopy(ele,0,res,arr.length,ele.length);
        return res;
    }

    /**
     * 此方法用于输出一个int数组
     * @param arr 目标数组
     * @param split 元素与元素之间分割的符号
     */
    public static void printArr(int[] arr,String split){
        for (int i:arr){
            System.out.print(i+split);
        }
        System.out.println();
    }
}
```

code03.java

```java
package code_p8.code03;

public class code03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayUtil.printArr(arr,"\t");
        arr = ArrayUtil.addEle(arr,6);
        ArrayUtil.printArr(arr,"\t");
        arr = ArrayUtil.addEle(arr,7,8,9);
        ArrayUtil.printArr(arr,"\t");
    }
}
```

生成文档：

<img src="https://img-blog.csdnimg.cn/20210214124651486.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl81MTY1NzgzMw==,size_16,color_FFFFFF,t_70" alt="帮助文档" style="zoom: 67%;" />

------------



### 3.4 封装性——权限修饰符

Java使用“访问控制符”来控制哪些细节需要封装，哪些细节需要暴露。 Java中4种“访问控制符”分别为private、默认、protected、public，它们说明了面向对象的封装性，所以我们要利用它们尽可能的让访问权限降到最低，从而提高安全性。

| 修饰符    | 同一个类 | 同一个包中 | 子类 | 所有包的所有类 |
| --------- | -------- | ---------- | ---- | -------------- |
| private   | √        | ×          | ×    | ×              |
| 默认      | √        | √          | ×    | ×              |
| protected | √        | √          | √    | ×              |
| public    | √        | √          | √    | √              |

1. private 表示私有，只有自己类能访问

2. default表示没有修饰符修饰，只有同一个包的类能访问

3. protected表示可以被同一个包的类以及其他包中的子类访问

4. public表示可以被该项目的所有包中的所有类访问

 code:
Vals.java

```java
package code_p8.code04;

public class Vals {
    private final static int privateVal = 10;
    final static int defaultVal = 20;
    protected final static int protectedVal = 30;
    public final static int publicVal = 40;

    public static void main(String[] args) {
        System.out.println("--------同类开始访问--------");
        System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
```

SamePackTest.java

```java
package code_p8.code04;

public class SamePackTest {
    public static void main(String[] args) {
        System.out.println("--------同包不同类开始访问--------");
        //System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
```

SamePackSonTest.java

```java
package code_p8.code04;

public class SamePackSonTest extends Vals{
    public static void main(String[] args) {
        System.out.println("--------同包子类开始访问--------");
//        System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
```

dif_pack_test/DifPackTest.java

```java
package code_p8.code04.dif_pack_test;

import code_p8.code04.Vals;

public class DifPackTest {
    public static void main(String[] args) {
        System.out.println("--------不同包不同类开始访问--------");
        //System.out.println("Vals.privateVal="+ Vals.privateVal);
        //System.out.println("Vals.defaultVal="+Vals.defaultVal);
        //System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
```

dif_pack_son_test/DifPackSonTest.java

```java
package code_p8.code04.dif_pack_son_test;

import code_p8.code04.Vals;

public class DifPackSonTest extends Vals {
    public static void main(String[] args) {
        System.out.println("--------不同包子类开始访问--------");
        //System.out.println("Vals.privateVal="+Vals.privateVal);
        //System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
```

**封装Person类**

code:

person_pakage\Person.java

```java
package code_p8.code05.person_pakage;

public class Person {
    private String name;
    private int age;
    public Person(){
        this.name = "无名氏";
        this.age = 18;
    }
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public void setAge(int age) {
        if(age > 150 || age < 0){
            this.age = 18;return;
        }
        this.age = age;
    }
    public void setName(String name) {
        if(name.length()>10){
            this.name = name.substring(0,10);return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("Person[name=%s, age=%d]",name,age);
    }
}
```

code05.java

```java
package code_p8.code05;

import code_p8.code05.person_pakage.Person;

public class code05 {
    public static void main(String[] args) {
        Person p = new Person("张三",15);
        System.out.printf("p=%s\n",p.toString());
        Person p1 = new Person("一二三四五六七八九十一二三",999);
        System.out.printf("p1=%s\n",p1.toString());
    }
}
```

-------------



### 3.5 封装性——类的成员的处理

+ 一般使用private访问权限。

+ 提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作（注意：boolean变量的get方法是is开头!）。

+ 一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰。

类的处理:

+ 类只能使用public和默认来修饰

+ 默认：当前包

+ public：当前项目的所有包

+ public类要求类名和文件名相同，一个java文件中至多一个public类

---------------------



### 3.6 继承性——extends继承

继承（Inheritance）是面向对象编程的三大特征之一，它让我们更加容易实现对于已有类的扩展、更加容易实现对于现实世界的建模。

**继承及其作用**

继承让我们更加容易实现类的扩展。 比如，我们定义了人类，再定义Boy类就只需要扩展人类即可。实现了代码的重用，不用再重新发明轮子(don’t  reinvent  wheels)。

从英文字面意思理解，extends的意思是“扩展”。子类是父类的扩展。

在我们编程中，如果新定义一个Student类，发现已经有Person类包含了我们需要的属性和方法，那么Student类只需要继承Person类即可拥有Person类的属性和方法。



**继承使用要点**

1. 父类也称作超类、基类。子类：派生类等。

2. Java中只有单继承，没有像C++那样的多继承。多继承会引起混乱，使得继承链过于复杂，系统难于维护。

3. 子类继承父类，可以得到父类的全部属性和方法 (除了父类的构造方法)，但不见得可以直接访问(比如，父类私有的属性和方法)。

4. 如果定义一个类时，没有调用extends，则它的父类是：java.lang.Object。

**方法重写**

父类的方法已经无法满足子类的需求，怎么办？可通过方法重写（override）解决，或者称为方法覆盖。



code:

Person.java

```java
package code_p8.code06;

public class Person /*extends java.lang.Object*/{
    private String name;
    private String gender;
    private short age;

    public void setName(String name) {
        if(name.length()>10){
            this.name = name.substring(0,10);return;
        }
        this.name = name;
    }
    public void setAge(short age) {
        if (age > 150 || age < 0){
            this.age = 18;return;
        }
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public short getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public Person(){
        this.name = "unknown";
        this.gender = "女";
        this.age = 18;
    }
    public Person(String name, String gender, short age){
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。你好。\n",name,gender,age);
    }

    @Override
    public String toString(){
        return String.format("Person[name=%s,gender=%s,age=%d]",name,gender,age);
    }
}
```

Student.java

```java
package code_p8.code06;

public class Student extends Person{
    private String schoolName;
    private String classNum;

    private void setDefaultStuInfo() {
        this.schoolName = "uknSchool";
        this.classNum = "uknClass";
    }
    public Student(){
        super();
        setDefaultStuInfo();
    }
    public Student(String name,String gender,short age){
        super(name,gender,age);
        setDefaultStuInfo();
    }
    public Student(String name,String gender,short age,String schoolName,String classNum){
        this(name,gender,age);
        this.schoolName=schoolName;
        this.classNum=classNum;
    }
    @Override
    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。在%s%s班学习。你好。\n",getName(),getGender(),getAge(),schoolName,classNum);
    }
    @Override
    public String toString(){
        return String.format("Student[name=%s,gender=%s,age=%d,schoolName=%s,classNum=%s]",getName(),getGender(),getAge(),schoolName,classNum);
    }
}
```

code06.java

```java
package code_p8.code06;

public class code06 {
    public static void main(String[] args) {
        Person[] p = {new Person(),
                      new Person("张三","男",(short)20)};
        for (Person i : p){
            System.out.println("i="+i.toString());
            i.selfIntro();
            System.out.println();
        }
        Student[] stu = {new Student(),
                         new Student("李四","男",(short)19),
                         new Student("王五","女",(short)8,"摩尔曼斯克希望小学","1.991")};
        for (Student i : stu){
            System.out.println("i="+i.toString());
            i.selfIntro();
            System.out.println();
        }

    }
}
```

--------------------



### 3.7 Object类

Object类是所有Java类的根基类，也就意味着所有的Java对象都拥有Object类的属性和方法。如果在类的声明中未使用extends关键字指明其父类，则默认继承Object类。


| 方法     | 摘要                                                         |
| -------- | ------------------------------------------------------------ |
| boolean  | **[equals](#equals(java.lang.Object))**(Object obj) 指示其他某个对象是否与此对象“相等”。 |
| Class<?> | **[getClass](#getClass())**() 返回此 Object 的运行时类。     |
| int      | **[hashCode](#hashCode())**() 返回该对象的哈希码值。         |
| void     | **[notify](#notify())**() 唤醒在此对象监视器上等待的单个线程。 |
| void     | **[notifyAll](#notifyAll())**()  唤醒在此对象监视器上等待的所有线程。 |
| String   | **[toString](#toString())**() 返回该对象的字符串表示。       |
| void     | **[wait](#wait())**() 在其他线程调用此对象的 [notify()](#notify()) 方法或 [notifyAll()](#notifyAll()) 方法前，导致当前线程等待。 |
| void     | **[wait](#wait(long))**(long timeout)  在其他线程调用此对象的 [notify()](#notify()) 方法或 [notifyAll()](#notifyAll()) 方法，或者超过指定的时间量前，导致当前线程等待。 |
| void     | **[wait](#wait(long, int))**(long timeout, int nanos)   在其他线程调用此对象的 [notify()](#notify()) 方法或 [notifyAll()](#notifyAll()) 方法，或者其他某个线程中断当前线程，或者已超过某个实际时间量前，导致当前线程等待。 |

 

 以上方法是Object类所有的public方法。 除此之外可能还有private、protected、默认的方法

| 方法              | 摘要                                                         |
| ----------------- | ------------------------------------------------------------ |
| protected  Object | **[clone](#clone())**()   创建并返回此对象的一个副本。       |
| protected  void   | **[finalize](#finalize())**() 当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。 |

 

扩展：**native关键字**

+ 一个native方法就是一个Java调用非Java代码的接口。一个native方法是指该方法的实现由非Java语言实现，比如用C或C++实现。
+ 在定义一个native方法时，并不提供实现体，因为其实现体是由非Java语言在外面实现的。Java语言本身不能对操作系统底层进行访问和操作，但是可以通过JNI接口调用其他语言来实现对底层的访问。
+ JNI是Java本机接口（Java Native Interface），是一个本机编程接口，它是Java软件开发工具箱（Java Software Development Kit，SDK）的一部分。JNI允许Java代码使用以其他语言编写的代码和代码库。Invocation API（JNI的一部分）可以用来将Java虚拟机（JVM）嵌入到本机应用程序中，从而允许程序员从本机代码内部调用Java代码。




 **成员变量的隐藏**

如果父类和子类中有同名的成员变量，不存在变量的重写，分别占有自己的空间。子类的成员变量优先，称为成员变量的隐藏。

code:

Animal.java

```java
package code_p8.code07;

public class Animal {
    private String name = "Animal的name";
    public String getName() {
        return name;
    }
}
```

Cat.java

```java
package code_p8.code07;

public class Cat extends Animal{
    private String name = "Cat的name";

    public String getSuperName(){
        return super.getName();
    }

    public String getName() {
        return this.name;
    }

    public void show(){
        String name = "方法的name";
        System.out.println(name);
        System.out.println(getName());
        System.out.println(getSuperName());
    }
}
```

code07.java

```java
package code_p8.code07;

public class code07 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
        System.out.println(cat.getName());
        System.out.println(cat.getSuperName());
    }
}
```



**继承条件下构造方法的执行顺序**

+ 构造方法的第一条语句默认是super(),含义是调用父类无参数的构造方法
+ 构造方法的第一条语句可以显式的指定为父类的有参数构造方法：super(.....)
+ 构造方法的第一条语句可以显式的指定为当前类的构造方法：this(.....)

code:

Animal.java

```java
package code_p8.code08;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Animal(){
        System.out.println("Animal无参构造调用");
    }
    public Animal(String name) {
        System.out.println("Animal有参构造调用");
        this.setName(name);
    }
}
```

Cat.java

```java
package code_p8.code08;

public class Cat extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Cat() {
        /*super()*/ //调用super无参构造方法，不过省略
        System.out.println("Cat无参构造函数调用");
    }
    public Cat(String name,String breed) {
        super(name);
        System.out.println("Cat有参构造函数调用");
        this.setBreed(breed);
    }
    public void MwM(){
        System.out.printf("我是%s品种的猫，叫做%s,喵！\n",breed,super.getName());
    }
}
```

code08.java

```java
package code_p8.code08;

public class code08 {
    public static void main(String[] args) {
        Cat catA = new Cat();
        catA.MwM();
        Cat catB = new Cat("田所浩二","114514号");
        catB.MwM();
    }
}
```

**注意事项**

+ 每个类最好要提供无参数的构造方法

+ 构造方法的第一条语句可以是通过super或者this调用构造方法，须是第一条语句

+ 构造方法中不能同时使用super和this调用构造方法，但并不是说不能同时出现this和super

--------------



### 3.8 super关键字

super“可以看做”是直接父类对象的引用。每一个子类对象都会有一个super引用指向其直接父类对象。

super的作用：

1) 调用成员变量  
2) 调用成员方法  
3) 调用构造方法  

**注意**

+  使用super调用普通方法，语句没有位置限制，可以在子类中随便调用。
+  在一个类中，若是构造方法的第一行代码没有显式的调用super(...)或者this(...);那么Java默认都会调用super(),含义是调用父类的无参数构造方法。这里的super()可以省略。

code:

FatherClass.java

```java
package code_p8.code09;

public class FatherClass {
     int a = 10; //成员变量
    public  void a(){ //成员方法
        System.out.println("调用了父类的成员方法");
    }
    public FatherClass(){ //构造方法
        System.out.println("调用了父类构造方法");
    }
}
```

code09.java

```java
package code_p8.code09;

public class code09 extends FatherClass{
    public code09(){
        super();
        System.out.println(super.a);
        super.a();
    }
    public static void main(String[] args) {
        code09 c = new code09();
    }
}
```

---------------------------



### 3.9==和equals方法

“==”代表比较双方是否相同。如果是基本类型则表示值相等，如果是引用类型则表示地址相等即是同一个对象。

Object类中定义有：public boolean equals(Object obj)方法，提供定义“对象内容相等”的逻辑。比如，判断两个class是否相同，要求所有属性都相同。

Object 的 equals 方法默认就是比较两个对象的hashcode，是同一个对象的引用时返回 true 否则返回 false。显然，这无法满足子类的要求，可根据要求重写equals方法。 

code:

Person.java

```java
package code_p8.code10;

public class Person /*extends java.lang.Object*/{
    private final String name;
    private final String gender;
    private final short age;

    public Person(String name, String gender, short age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。你好。\n",name,gender,age);
    }

    @Override
    public boolean equals(Object obj){
        if (obj != null){
            if(this == obj){
                return true;
            }
            Person p = (Person)obj;
            return this.name.equals(p.name) || this.gender.equals(p.gender) || this.age == p.age;
        }
        return false;
    }

}
```

code10.java

```java
package code_p8.code10;

public class code10 {
    public static void main(String[] args) {
        Person p1 = new Person("张三","男",(short)18);
        Person p2 = p1;
        Person p3 = new Person("张三","男",(short)18);
        Person p4 = null;
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
    }
}
```

--------------



### 3.10 组合

继承和组合是复用代码的两种方式；

继承  is-a  Dog is-a Animal  Cat is-a Animal

组合   has-a  Computer has-a cpu memery mainBoard。

 

扩展： 面向对象的设计原则之一：**组合聚合复用原则**（优先使用组合，而不是继承）

+ 除非两个类之间是“is-a”的关系，否则不要轻易的使用继承，不要单纯的为了实现代码的重用而使用继承，因为过多的使用继承会破坏代码的可维护性，当父类被修改时，会影响到所有继承自它的子类，从而增加程序的维护难度和成本。
+ 不要仅仅为了实现多态而使用继承，如果类之间没有“is-a”的关系，可以通过实现接口与组合的方式来达到相同的目的。设计模式中的策略模式可以很好的说明这一点，采用接口与组合的方式比采用继承的方式具有更好的可扩展性

code:

Cpu.java

```java
package code_p8.code11;

public class Cpu {
    private final String type;

    public Cpu(String type) {
        this.type = type;
    }
    public void calc(){
        System.out.printf("--------%sCPU正在计算--------\n",type);
    }
}
```

Computer.java

```java
package code_p8.code11;
public class Computer {
    private static Cpu cpu = new Cpu("i9");
    public static void launch(){
        System.out.println("-------电脑启动了--------");
        cpu.calc();
    }
}
```

code11.java

```java
package code_p8.code11;

public class code11 {
    public static void main(String[] args) {
        Computer.launch();
    }
}
```

-----------

### 3.11 多态性——什么是多态？

多态（polymorphism）是面向对象三大特征之一。同一行为，通过不同的子类，可以体现出来的不同的形态。


### 3.12 引入和使用多态

多态指的是同一个方法调用，由于对象不同可能会有不同的行为。

编译器类型指的是‘=’左边的类型，运行期类型指的是‘=’右边的类型。当有继承关系时，可能发生编译期类型和运行期类型不同的情况，即编译期类型是父类类型，运行期类型是子类类型。即：父类引用指向子类对象

**多态的要点：**

+ 多态是方法的多态，不是属性的多态（多态与属性无关）。

+ 多态的存在要有3个必要条件：继承，方法重写，父类引用指向子类对象。

+ 父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。

使用父类做方法的形参，是多态使用最多的场合。即使增加了新的子类，方法也无需改变，符合开闭原则。

父类引用做方法的形参，实参可以是任意的子类对象，可以通过不同的子类对象实现不同的行为方式。另外即使增加了新的子类，方法也无需改变，提高了扩展性，符合开闭原则。

code:

Programmer.java

```java
package code_p8.code12;

public class Programmer {
    private String name = "proName";

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeCode() { //此类由子类继承
        System.out.println("程序员"+name+"正在写代码。");
    }

    public void eat() {//此类由子类重写
        System.out.println("程序员"+name+"正在吃饭。");
    }
}
```

ChinesePro.java

```java
package code_p8.code12;

public class ChinesePro extends Programmer {
    private String name = "ChProName";

    public ChinesePro(String name) {
        super(name);
        this.name = name;
    }

    //writeCode方法从父类继承了
    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void eat() { //重写父类吃饭方法
        System.out.println("中国程序员" + name + "正在用筷子吃米饭");
    }

    public void playTaichi() { //子类特有方法
        System.out.println("中国程序员" + name + "正在打太极拳");
    }
}
```

EnglishPro.java

```java
package code_p8.code12;

public class EnglishPro extends Programmer {
    private String name = "EnProName";

    public EnglishPro(String name) {
        super(name);
        this.name = name;
    }

    //writeCode方法从父类继承了
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() { //重写父类吃饭方法
        System.out.println("英国程序员" + name + "正在用刀叉吃炸鱼配炸薯条");
    }

    public void playHorseRace() { //子类特有方法
        System.out.println("英国程序员" + name + "正在赛马");
    }
}
```

IndianPro.java

```java
package code_p8.code12;

public class IndianPro extends Programmer {
    private String name = "InProName";

    public IndianPro(String name) {
        super(name);
        this.name = name;
    }

    //writeCode方法从父类继承了
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() { //重写父类吃饭方法
        System.out.println("印度程序员" + name + "正在用手捧着恒河水喝");
    }

    public void dance() { //子类特有方法
        System.out.println("印度程序员" + name + "正在尬舞");
    }
}
```

code12.java

```java
package code_p8.code12;

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
```



扩展： 面向对象的设计原则之一：**开闭原则(OCP)**

+ 对扩展开放，对修改关闭
+ 更通俗翻译：软件系统中的各种组件，如模块（Modules）、类（Classes）以及功能（Functions）等，应该在不修改现有代码的基础上，引入新功能
+ 面向对象设计需要遵守的最高原则，也是最终目标

----------------------------



### 3.13 多态之向上转型

将子类对象赋给父类引用，称为向上转型（upcasting），自动进行类型转换。向上转型可以调用的子类继承的方法，但不能调用子类特有的方法。需要特别理解的是如果子类重写了父类的方法，向上转型后通过父类引用调用的却是真实子类重写的方法，

code:

```java
import code_p8.code12.*;

public class code13 {
    public static void main(String[] args) {
        //基本数据类型的自动转换
        int i = 10;
        double d = 1.23456789;
        d = i; //正常转换
        
        //引用数据类型的自动转换
        Programmer pro = new ChinesePro("张三"); //向上转型 右→左
        pro.writeCode();
        pro.eat();
        //pro.playTaichi(); 向上转型后不可以调用子类独有方法。
    }
}
```

----------------



### 3.14 多态之向下转型

将父类的引用变量转换为子类类型，称为向下转型（downcasting）。向下转型后就可以调用子类特有的方法了。

+ 需要进行强制转换Chinese ch = (Chinese)pro; 

+ 强制转换不是做手术，必须转换成真实子类型，否则ClassCastException；

+ 向下转型之前肯定发生了向上转型

+ 为了避免ClassCastException,向下转型之前使用instanceof先判断一下  
  **`对象   instanceof  类或者接口`**
  使用instancof的前提：**左边的对象和右边的类型在继承树上有上下级关系**

code:


注意：多态之和方法有关，和属性无关。

code:

----------------


3.14.简单工厂模式-返回值是父类类型

不仅可以使用父类做方法的形参，还可以使用父类做方法的返回值类型，真实返回的对象可以是该类的任意一个子类对象。

以上代码其实是简单工厂模式的实现，它是解决大量对象创建问题的一个解决方案。将创建和使用分开，工厂负责创建，使用者直接调用即可。简单工厂模式的基本要求是

1. 定义一个static方法，通过类名直接调用

2. 返回值类型是父类类型，返回的可以是其任意子类类型

3. 传入一个字符串类型的参数，工厂根据参数创建对应的子类产品

 

扩展：**设计模式**

+  有23中经典的设计模式，是一套被多数人知晓、经过分类编目的、反复使用的优秀代码设计经验的总结。每个设计模式均是特定环境下特定问题的处理方法。
+  面向对象设计原则是面向对象设计的基石，面向对象设计质量的依据和保障，设计模式是面向对象设计原则的经典应用。
+  简单工厂模式并不是23中经典模式的一种，是其中工厂方法模式的简化版

 

| 面向对象设计原则                                             | 创建型模式 5+1                                               | 结构型模式 7                                                 | 行为型模式                                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 单一职责原则<br/>开闭原则<br/>里氏替代原则<br/>依赖注入原则<br/>接口分离原则<br/>迪米特原则<br/>组合/聚合复用原则 | \*简单工厂模式<br/>工厂方法模式<br/>抽象工厂模式<br/>创建者模式<br/>原型模式<br/>单例模式 | 外观模式<br/>适配器模式<br/>代理模式<br/>装饰模式<br/>桥接模式<br/>组合模式<br/>享元模式 | 模板方法模式<br/>观察者模式<br/>状态模式<br/>策略模式<br/>职责链模式<br/>命令模式<br/>访问者模式<br/>调停者模式<br/>备忘录模式<br/>迭代器模式<br/>解释器模式 |

----------



## 4.面向对象进阶（code_p9)

### 4.1 final关键字

**`final`**
作用：

+ 修饰变量: 被他修饰的变量不可改变。一旦赋了初值，就不能被重新赋值。
  `final  int   常量名= 120;`
  注意：**常量名全部大写，用下划线分割**
+ 修饰方法：该方法不可被子类重写。但是可以被重载！
  `final  void  方法名(){}`
+ 修饰类: 修饰的类不能被继承。比如：Math、String、System等。
  `final   class  类名{}`
  code:

注意：

+ final不能修饰构造方法
+ final修饰基本数据类型,值只能赋值一次，后续不能再赋值

code:

```java
package code_p9.code01;

public class TestClassA {
    final void method1(){
        System.out.println("TestClassA的method1方法被调用!");
    }
}
```

```java
package code_p9.code01;

final public class TestClassB {
    void method2(){
        System.out.println("TestClassB的method2方法被调用!");
    }
}
```

```java
package code_p9.code01;

public class code01 /*extends TestClassA*/ /*extends TestClassB final修饰不可继承*/ {
    public static final int a = 10;

//    @Override final修饰无法重写
//    void method1(){}
    public static void main(String[] args) {
        System.out.println("a = "+a); //a = 20; 可以访问，不可以修改
        TestClassA tcA = new TestClassA();
        tcA.method1(); //可以调用，不可以重写
        TestClassB tcB = new TestClassB();
        tcB.method2(); //可以调用，不可以继承
    }
}
```

+ final修饰引用数据类型，不能变化的引用变量的值，可以变化的是对象的属性.

code:

```java
package code_p9.code02;

public class Animal {
    public final String name;
    public final int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intro(){
        System.out.println("我事叫"+name+"的动物，今年"+age+"岁。");
    }
}
```

```java
package code_p9.code02;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intro(){
        System.out.println("我叫"+name+"，今年"+age+"岁。");
    }
}
```

```java
package code_p9.code02;

public class code02 {
    public static void main(String[] args) {
        //final修饰引用数据类型，引用数据类型指向的地址不可变，但是对象的属性可变
        final Person p = new Person("张三",18);
        p.intro();
        //p = new Person("小A",1);
        p.name = "李四";
        p.intro();

        //final修饰类中的值，指向的地址可变，对象属性不可变。
        Animal a = new Animal("田所浩二",(int)11.4514);
        a.intro();
        a = new Animal("田所",(int)19.1919810);
        //a.name = "哼↑啊——";
        a.intro();
    }
}
```

-------------------



### 4.2 抽象类

使用**`abstract`**修饰的类。通过**`abstract`**方法定义规范，然后要求子类必须定义具体实现。通过抽象类，我们就可以做到严格限制子类的设计，使子类之间更加通用。

code:


抽象类的使用要点:

+ 有抽象方法的类只能定义成抽象类
+ 抽象类不能实例化，即不能用new来实例化抽象类。
+ 抽象类必须有构造方法，创建子类对象的时候使用
+ 一个抽象类至少0个抽象方法，至多（所有的方法都是抽象方法）个抽象方法
+ 子类必须重写父类的抽象方法，不重写就提示编译错误；或者子类也定义为抽象类
+ 父类的方法是抽象的，需要子类实现；父类的方法不是抽象的，子类可以重写

code:

```java
package code_p9.code03;

public abstract class Animal {
    public String name;
    public Animal(String name){this.name = name;}
    public void intro(){
        System.out.println("我是"+name);
    }
    public abstract void walk();
}
```

```java
package code_p9.code03;

public class Cat extends Animal{
    public String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void walk(){
        System.out.println(color+"小猫在走路.");
    }
}
```

```java
package code_p9.code03;

public class code03 {
    public static void main(String[] args) {
        Cat c = new Cat("张三","蓝色");
        c.intro();
        c.walk();
    }
}
```

-----------------



### 4.3 接口1

接口就是规范，定义的是一组规则，体现了现实世界中“如果你是…则必须能…”的思想。



声明格式：

```java
[访问修饰符]  interface 接口名   [extends  父接口1，父接口2…]  {
常量定义;
方法定义;
}
```

   定义接口的详细说明：

+ 访问修饰符：只能是public或默认。
+ 接口名：和类名采用相同命名机制。
+ extends：接口可以多继承。
+ 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。
+ 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。

要点

+ 子类通过**`implements`**来实现接口中的规范。
+ 接口不能创建实例，但是可用于声明引用变量类型。
+ 一个类实现了接口，必须实现接口中所有的方法，并且这些方法只能是public的。
+ JDK1.8（不含8）之前，接口中只能包含静态常量、抽象方法，不能有普通属性、构造方法、普通方法。
+ JDK1.8（含8）后，接口中包含普通的静态方法、默认方法。



code:

```java
package code_p9.code04;

public interface TestInterfaceFather1 {
    int fatherV1 = 10;
}
```

```java
package code_p9.code04;

public interface TestInterfaceFather2 {
    int fatherV2 = 20;
}
```

```java
package code_p9.code04;

public interface TestInterface extends TestInterfaceFather1,TestInterfaceFather2 {
    /*public static final*/ int CONST_INT = fatherV1+fatherV2;
    /*public abstract */ void helloInterface();
}
```

```javaa
package code_p9.code04;

public class code04 implements TestInterface{
    @Override
    public void helloInterface() {
        System.out.println("你好！接口！");
    }

    public static void main(String[] args) {
        System.out.println("接口中的常量为"+TestInterface.CONST_INT);
        code04 c = new code04();
        c.helloInterface();
    }
}
```

-------------------------



### 4.4 接口2

**接口的组成**

+ 接口和数组、类、抽象类是同一个层次的概念
+ 成员变量:接口中所有的变量都使用public static final修饰，都是全局静态常量
+ 成员方法： 接口中所有的方法都使用public abstract修饰，都是全局抽象方法
+ 构造方法：接口不能new，也没有构造方法
+ 接口做方法的形参，实参可以该接口的所有实现类

**接口和多继承**

+ C++  多继承
  + 好处 ：可以从多个父类继承更多的功能
  + 缺点：不安全 
+ Java 单继承
  + 好处：安全   缺点：功能受限
  + 解决方案：既安全，功能又强大，采用接口。接口变相的使Java实现了C++的多继承，又没有C++多继承的不安全性

 **`[修饰符] class 类名 extends 父类 implements 接口1,接口2.....`**

**必须先extends 再implements**

code:

```java
package code_p9.code05;

public interface Compareable {
    /**
     * 判断两个对象的大小关系
     * @param obj 另一个对象
     * @return 返回0，相等；返回正数，大于；返回负数，小于。
     */
    public int compareTo(Object obj);
}
```

```java
package code_p9.code05;

public interface Comparable {
    /**
     * 判断两个对象的大小关系
     * @param obj 另一个对象
     * @return 返回0，相等；返回正数，大于；返回负数，小于。
     */
    public int compareTo(Object obj);
}
```

```java
package code_p9.code05;

public class code05 {
    public static void comparePersons(Person p1, Person p2){
        if (p1.compareTo(p2) == 0){
            System.out.println(p1.name+"和"+p2.name+"年龄一样大");
        }else if(p1.compareTo(p2)<0){
            System.out.println(p1.name+"比"+p2.name+"年龄小");
        }else {
            System.out.println(p1.name+"比"+p2.name+"年龄大");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person(15,"张三");
        Person p2 = new Person(15,"李四");
        Person p3 = new Person(16,"王五");
        Person p4 = new Person(14,"赵六");
        comparePersons(p1,p2);
        comparePersons(p1,p3);
        comparePersons(p1,p4);
    }
}
```

----------------------



### 4.5  JDK1.8的接口新特征

+ JDK7及其之前
  + 接口的变量都是public final static 全局静态常量，无变化
  + 接口中都是抽象abstract方法，不能有static方法（因为abstract和static、final、private不能共存）

+ JDK1.8及其之后
  + 接口中可以添加非抽象方法（static），实现类不能重写，只能通过接口名调用。
  + 如果子类中定义了相同名字的静态方法，那就是完全不同的方法了，直接从属于子类。可以通过子类名直接调用

接口中可以添加非抽象方法（default），实现类可以重写，只能通过对象名调用

实现类可以直接使用default方法，可以重写default方法，但是必须去掉default。（default只能接口中使用）

上级接口中可以调用default方法

提供非抽象方法的目的

+ 为了解决实现该接口的子类代码重复的问题
+ 为了既有的成千上万的Java类库的类增加新功能，且不必对这些类重新进行设计。

code:

```java
package code_p9.code06;

public interface JDK8Interface {
    /*public static final*/ int CONST_V = 10;
    /*public abstract*/ void method1();
    //——————↓↓↓JDK8新特性↓↓↓——————
    public static void method2(){
        System.out.println("JDK8允许的非抽象方法第一种：static的");
    }
    public default void method3(){
        System.out.println("JDK8允许的非抽象方法第二种：default的");
    }

}
```

```java
package code_p9.code06;

public class code06 implements JDK8Interface {
    @Override
    public void method1() {
        System.out.println("JDK8之前的接口中的方法全部必须是public abstract，必须重写");
    }
    @Override
    public void method3(){
        System.out.println("default的方法可以重写");
    }

    public static void main(String[] args) {
        code06 c = new code06();
        c.method1();c.method3();
        System.out.println(JDK8Interface.CONST_V);
        JDK8Interface.method2();
    }
}
```

--------------------------------



### 4.6 面向接口编程

面向接口编程是面向对象编程的一部分。

为什么需要面向接口编程? 软件设计中最难处理的就是需求的复杂变化，需求的变化更多的体现在具体实现上。我们的编程如果围绕具体实现来展开就会陷入”复杂变化”的汪洋大海中，软件也就不能最终实现。我们必须围绕某种稳定的东西开展，才能以静制动，实现规范的高质量的项目。

接口就是规范，就是项目中最稳定的核心。 面向接口编程可以让我们把握住真正核心的东西，使实现复杂多变的需求成为可能。

通过面向接口编程，而不是面向实现类编程，可以大大降低程序模块间的耦合性，提高整个系统的可扩展性和和可维护性。

面向接口编程的概念比接口本身的概念要大得多。设计阶段相对比较困难，在你没有写实现时就要想好接口，接口一变就乱套了，所以设计要比实现难。

-----------------------



### 4.7 内部类

内部类是一类特殊的类，指的是**定义在一个类的内部的类。**

实际开发中，为了方便的使用外部类的相关属性和方法，这时候我们通常会定义一个内部类。

一般情况，我们把类定义成独立的单元。有些情况下，我们把一个类放在另一个类的内部定义，称为内部类(innerclasses)。

在Java中内部类主要分为成员**非静态成员内部类、静态成员内部类、局部内部类、匿名内部类。**

---------



### 4.8 非静态成员内部类

作为类的成员存在，和成员变量、成员方法、构造方法、代码块并列。因为是类的成员，所以非静态成员内部类可以使用**`public、protected 、默认、private`**修饰，而外部类只能使用**`public、默认`**修饰。

**基本特征**

+ 内部类可以直接访问外部类的成员
+ 外部类不能直接访问内部类的成员，需要先创建对象再通过对象名访问
  内部类如何访问外部类的同名成员变量：`外部类名.this.成员变量名`
+ 必须先创建外部类的对象，才能创建内部类的对象。非静态成员内部类是属于某个外部类对象的

**更多特征**

+ 非静态内部类不能有静态方法、静态属性和静态初始化块。

+ 外部类的静态方法、静态代码块不能访问非静态内部类，包括不能使用非静态内部类定义变量、创建实例。

**注意**
内部类**只是一个编译时概念**，一旦我们编译成功，就会成为完全不同的两个类。所以内部类是相对独立的一种存在，其成员变量/方法名可以和外部类的相同。

code:

```java
package code_p9.code07;

public class OClass {
    private final int a = 10, b = 15;

    public class IClass{
        private final int b = 20;
        public void IMethod1(){
            System.out.println("————————内部类方法1——————");
            System.out.println("外部类中的a="+a);
            System.out.println("内部类中的b="+b);
        }
        public void IMethod2(){
            System.out.println("————————内部类方法2——————");
            System.out.println("内部类中的b="+b);
            System.out.println("外部类中的b="+OClass.this.b);
        }
    }

    public void OMethod1(){
        System.out.println("————————外部类方法1——————");
        System.out.println("外部类中的a=" + a);
        System.out.println("内部类中的b=" + new IClass().b);
    }

}
```

```java
package code_p9.code07;

import code_p9.code07.OClass.IClass;

public class code07 {
    public static void main(String[] args) {
        OClass oc = new OClass();
        oc.OMethod1();
        /*OClass.IClass*/IClass ic = new OClass().new IClass();
        ic.IMethod1();
        ic.IMethod2();
    }
}
```

---------------------



### 4.9 静态成员内部类

+ 静态内部类只能够访问外部类的静态成员
+ 静态内部类如何访问外部类的同名的成员变量：`外部类名.成员变量名`
+ 静态内部类属于整个外部类的。创建静态内部类的对象，不需先创建外部类的对象
+ 外部类可以通过类名直接访问内部类的静态成员，访问非静态成员依旧需要先创建内部类对象。

code:

```java
package code_p9.code08;

public class OClass {
    private static final int a = 10,b = 15;
    private final int c = 30;

    public static class IClass{
        private final int b = 20;
        public static final int d = 40;
        public void IMethod1(){
            System.out.println("————————内部类方法1——————");
            System.out.println("外部类中的a="+a);//可以访问
            //System.out.println("外部类中的c="+c);//不可以访问
        }
        public void IMethod2(){
            System.out.println("外部类中的b="+OClass.b);
            System.out.println("内部类中的b="+b);
        }
    }

    public void OMethod1(){
        System.out.println("————————外部类方法1——————");
        System.out.println("直接访问内部类静态成员d="+IClass.d);

    }

}
```

```java
package code_p9.code07;

public class OClass {
    private final int a = 10, b = 15;

    public class IClass{
        private final int b = 20;
        public void IMethod1(){
            System.out.println("————————内部类方法1——————");
            System.out.println("外部类中的a="+a);
            System.out.println("内部类中的b="+b);
        }
        public void IMethod2(){
            System.out.println("————————内部类方法2——————");
            System.out.println("内部类中的b="+b);
            System.out.println("外部类中的b="+OClass.this.b);
        }
    }

    public void OMethod1(){
        System.out.println("————————外部类方法1——————");
        System.out.println("外部类中的a=" + a);
        System.out.println("内部类中的b=" + new IClass().b);
    }

}
```

------------------------



### 4.10 局部内部类

还有一种内部类，它是定义在方法内部的，作用域只限于本方法，称为局部内部类。

局部内部类的的使用主要是用来解决比较复杂的问题，想创建一个类来辅助我们的解决方案，到那时又不希望这个类是公共可用的，所以就产生了局部内部类。局部内部类和成员内部类一样被编译，只是它的作用域发生了改变，它只能在该方法中被使用，出了该方法就会失效。	

局部内部类在实际开发中应用很少。

**注意：局部内部类访问所在方法的局部变量，要求局部变量必须使用final修饰。JDK1.8中final可以省略，但是编译后仍旧会加final。**

code:

```java
package code_p9.code09;

public class OClass {
    int a = 10;
    public void OMethod(){
        System.out.println("——————外部类方法——————");
        /*final*/ int b = 20;
        class IClass{
            public void IMethod(){
                System.out.println("——————内部类方法———————");
                a = 100;
                //b = 200;
                System.out.println(b);
            }
        }
        IClass ic = new IClass();
        ic.IMethod();
    }
}
```

```java
package code_p9.code09;

public class code09 {
    public static void main(String[] args) {
        OClass oc = new OClass();
        oc.OMethod();
    }
}
```

-----------



### 4.11 匿名内部类

匿名内部类就是内部类的简化写法，是一种特殊的局部内部类。

前提：存在一个类或者接口，这里的类可以是具体类也可以是抽象类。
本质是是一个继承了该类或者实现了该接口的子类匿名对象。

适合那种只需要创建一次对象的类。比如：Java GUI编程、Android编程键盘监听操作、Java开发中的线程任务Runnble、外部比较器Comparator等。

如果某个功能只使用一次或者很少的次数，就可以不提供专门的类，而是使用匿名内部类。


+ 匿名内部类可以实现一个接口，也可以继承一个类（可以是抽象类）。
+ 匿名内部类只能实现一个接口，而不是多个
+ 必须实现所有的方法，匿名内部类不能是抽象类
+ 匿名内部类不可能有构造方法，因为类是匿名的
+ 匿名内部类没有访问修饰符
+ 如果想实现构造方法的一些初始化功能，可以通过代码块实现
+ 如果要访问所在方法的局部变量，该变量需要使用final修饰。（JDK1.8可省略final）

语法：

```java
new  父类构造器(实参类表) \实现接口 () {
	    //匿名内部类类体
}
```

code:

```java
package code_p9.code10;

public interface Comperator {
    /**
     * 此方法用于比较两个对象
     * @param obj1 第一个对象
     * @param obj2 第二个对象
     * @return 返回0，相等；返回整数，大于；返回负数，小于。
     */
    public int compare(Object obj1, Object obj2);
}
```

```java
package code_p9.code10;

public class Person {
    public int age;
    public String name;
    public int weight;

    public Person(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
}
```

```java
package code_p9.code10;

public class code10 {
    public static void main(String[] args) {
        Person p1 = new Person(18,"张三",67);
        Person p2 = new Person(18,"李四",58);
        System.out.println(
                new Comperator() { //比较年龄
                    @Override
                    public int compare(Object obj1, Object obj2) {
                        return Integer.compare(((Person)obj1).age,((Person)obj2).age);
                    }
                }.compare(p1,p2));

        System.out.println(
                new Comperator() {
                    @Override
                    public int compare(Object obj1, Object obj2) { //比较体重
                        Person p1 = (Person)obj1, p2 = (Person)obj2;
                        return (Integer.compare(p1.weight, p2.weight));
                    }
                }.compare(p1,p2));
    }
}
```



----------------



### 4.12 内部类的作用和使用场合

**内部类的作用：**

+ 内部类提供了更小的封装。只能让外部类直接访问，不允许同一个包中的其他类直接访问。
+ 内部类可以直接访问外部类的私有属性，内部类被当成其外部类的成员。 但外部类不能访问内部类的内部属性。
+ 接口只是解决了多重继承的部分问题，而内部类使得多重继承的解决方案变得更加完整。
+ 用匿名内部类实现回调功能。我们用通俗讲解就是说在Java中，通常就是编写一个接口，然后你来实现这个接口，然后把这个接口的一个对象作以参数的形式传到另一个程序方法中， 然后通过接口调用你的方法，匿名内部类就可以很好的展现了这一种回调功能

**内部类的使用场合：**

+ 由于内部类提供了更好的封装特性，并且可以很方便的访问外部类的属性。所以，在只为外部类提供服务的情况下可以优先考虑使用内部类。
+ 使用内部类间接实现多继承：每个内部类都能独立地继承一个类或者实现某些接口，所以无论外部类是否已经继承了某个类或者实现了某些接口，对于内部类没有任何影响。


---------



## 5 异常

### 5.1 引入异常


异常（ Exception  也称例外）就是在程序的运行过程中所发生的不正常的事件，它会中断正在运行的程序

+ 所需文件找不到
+ 网络连接不通或中断
+ 算术运算错误 (被零除…)
+ 数组下标越界
+ 装载一个不存在的类或者对null对象操作
+ 类型转换异常
+ ……
  当Java程序出现异常时，就会在所处的方法中产生一个异常对象。这个异常对象包括异常的类型，异常出现时程序的运行状态以及对该异常的详细描述。

面对异常该怎么办呢？

+ 方式1：由开发者通过if-else来解决异常问题
  + 代码臃肿：业务代码和异常处理代码放一起
  + 程序员要花很大精力"堵漏洞“
  + 程序员很难堵住所有“漏洞”，对程序员本身要求较高
+ 方式2：开发者不需要通过if-else来解决异常问题，而是Java提供异常处理机制。它将异常处理代码和和业务代码分离，使程序更优雅，更好的容错性，高键壮性

Java的异常处理是通过5个关键字来实现的：**`try、catch、 finally、throw、throws`**

具体的异常：

```java
package code_p9.code11;

import java.util.Scanner;

public class code11_exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入总分
        System.out.println("请输入总分");
        int sum = input.nextInt();
        //输入人数
        System.out.println("请输入人数");
        int count = input.nextInt();
        //求平均分并输出
        int result = sum / count;
        System.out.println("result="+result);
        System.out.println("谢谢使用");
        System.out.println("退出系统");
    }
}

```

情况1：总分和人数都正确输入，输出结果，并谢谢使用。


情况2：人数为零，后面结果和谢谢使用不再输出


情况3：输入非数字，后面结果和谢谢使用不再输出

优点：Java已经提供了异常处理机制，发生异常后，会给出异常类型、异常提示信息、异常的位置
缺点：出现异常后，后续语句不执行了；提示信息太专业，可读性差
解决：try-catch-finally  处理异常；throws  抛出异常不处理，调用者处理

---------------------------



### 5.2 try-catch-finally

**try-catch执行情况**

1. try块中代码没有出现异常
   不执行catch块代码，执行catch块后边的代码
2. try块中代码出现异常，catch中异常类型匹配（相同或者父类）
   执行catch块代码，执行catch块后边的代码
3. try块中代码出现异常， catch中异常类型不匹配
   不执行catch块代码，不执行catch块后边的代码，程序会中断运行

**注意：**

+ 出现异常后，Java会生成相应的异常对象，Java系统,寻找匹配的catch块，找到后将异常对象付给catch块异常参数。
+ 出现异常后，try块中尚未执行的语句不会执行；
+ 出现异常后并处理后，catch块后面的语句还会执行



**catch块中如何处理异常**

**输出用户自定义异常信息**
System.err.println("除数不能为零。");
System.err.println("被除数和除数必须是整数。");

**调用异常对象的方法输出异常信息**
toString ( )方法，显示异常的类名和产生异常的原因
void printStackTrace()   输出异常的堆栈信息
String getMessage()返回异常信息描述字符串，printStackTrace()信息一部分

**继续向上抛出异常**
throw 



| 异常类型                       | 说明                                 |
| ------------------------------ | ------------------------------------ |
| Exception                      | 异常层次结构的根类                   |
| ArithmeticException            | 算术错误情形，如以零作除数           |
| ArrayIndexOutOfBoundsException | 数组下标越界                         |
| NullPointerException           | 尝试访问 null 对象成员               |
| ClassNotFoundException         | 不能加载所需的类                     |
| InputMismatchException         | 欲得到数据类型与实际输入类型不匹配   |
| IllegalArgumentException       | 方法接收到非法参数                   |
| ClassCastException             | 对象强制类型转换出错                 |
| NumberFormatException          | 数字格式转换异常，如把"ab"转换成数字 |

**catch后面的语句不执行的情况**

1. throw xxx;

2. 发生的异常和catch中异常类型不匹配

3. return 

**finally语句—— 不管什么情况下（除了System.exit()），某些语句都执行**

**return和finally语句的执行顺序**
  	执行return之前的语句----执行finally语句-----执行return

**finally在实际开发中的使用场合**
  	IO流的管理，数据库连接的关闭   socket的关闭

**唯一的例外**
  	System.exit(0); 终止当前正在运行的 Java 虚拟机。

code:

```java
package code_p9.code11;

import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            //输入总分
            System.out.println("请输入总分");
            int sum = input.nextInt();
            //输入人数
            System.out.println("请输入人数");
            int count = input.nextInt();
            //求平均分并输出
            int result = sum / count;
            System.out.println("result="+result);
            System.out.println("谢谢使用");
            System.out.println("退出系统");
        }catch (Exception exception){
            //输出异常底层信息
            exception.printStackTrace();
            System.out.println(exception.toString());
            System.out.println(exception.getMessage());
            //输出自定义提示信息
            System.err.println("人数为0或输入非数字内容");
            //继续向上抛出异常，catch后语句不执行
            //throw exception;
        }
        System.out.println("谢谢使用");
        System.out.println("退出系统");
    }
}
```

--------------



### 5.3 **使用多重catch处理异常**

+ 当引发异常时，会按顺序来查看每个 catch 语句，并执行第一个与异常类型匹配的catch语句
+ 执行其中一条 catch 语句后，其后 catch 语句将被忽略 
+ 在安排catch语句的顺序时，首先应该捕获最特殊的异常，  然后再逐渐一般化，即先子类后父类  
+ JDK7异常新处理方式：catch(InputMismatchException | ArithmeticException e){}

code:

```java
package code_p9.code12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            //输入总分
            System.out.println("请输入总分");
            int sum = input.nextInt();
            //输入人数
            System.out.println("请输入人数");
            int count = input.nextInt();
            //求平均分并输出
            int result = sum / count;
            System.out.println("result="+result);
        }catch(InputMismatchException e){
            System.err.println("请检查是否输入了非数字内容");
        }catch(ArithmeticException e){
            System.err.println("请检查人数是否为0");
        }catch(Exception e){
            //输出异常的底层信息
            System.err.println("other exception:"+e.toString());
        }
        finally{
            System.out.println("谢谢使用");
        }
        System.out.println("退出系统");
    }
}

```

-----------------------------



## 6 常用类(code_p10)

### 6.1 包装类

**什么是包装类？**
Java是面向对象的语言，但并不是“纯面向对象”的，因为我们经常用到的基本数据类型就不是对象。但我们在实际应用中经常需要将基本数据转化成对象，以便于操作。

为了解决这个不足，Java在设计类时为每个基本数据类型设计了一个对应的类进行代表，这样八个和基本数据类型对应的类统称为包装类(Wrapper Class)。8种基本数据类型，分别对应一个包装类。包装类均位于java.lang包

| 基本数据类型 | 包装类    |
| ------------ | --------- |
| byte         | Byte      |
| boolean      | Boolean   |
| short        | Short     |
| char         | Character |
| int          | Integer   |
| long         | Long      |
| float        | Float     |
| double       | Double    |

**包装类的优点**

+ 某些方法的参数必须是对象，为了让基本数据类型的数据能作为参数，提供包装类。
+ 包装类还可以提供更多的功能
+ 其他特别重要的功能：比如可以实现字符串和基本数据类型之间的转换


**注意**

+ 包装类的对象需要占用栈内存和堆内存，而基本数据类型的（局部）变量只占用栈内存；基本数据类型的变量占用空间少，更简单，更灵活，更高效。
+ 作为成员变量，初始值不同。int  0；Integer null。
+ 在这八个类中，除了Character和Boolean以外，其他的都是“数字型“，“数字型”都是java.lang.Number的子类。


code:

```java
package code_p10.code01;

import java.util.ArrayList;
import java.util.List;

class code01 {
    public static void main(String[] args) {
        //某些方法参数必须是对象
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Double(1.23));
        list.add(5);//隐式转换为Integer
        System.out.println(list);
        //提供更多功能
        System.out.println("int类型占用"+Integer.SIZE+"bit");
        System.out.println("int最大值为"+Integer.MAX_VALUE);
        System.out.println("int最小值为"+Integer.MIN_VALUE);
        System.out.println("114514转换为二进制0B"+Integer.toBinaryString(114514));
        System.out.println("114514转换为八进制为0"+Integer.toOctalString(114514));
        System.out.println("114514转换为十六进制为0X"+Integer.toHexString(114514));
        System.out.println("0X114514转换为十进制为"+Integer.toString(0X114514));
        //其他重要功能
        String str1 = "10", str2 = "10.23";
        int a = Integer.parseInt(str1);
        double b = Double.parseDouble(str2);
        System.out.println(a);
        System.out.println(b);
    }
}

```

--------------------



### 6.2 使用包装类

**自动装箱和自动拆箱**

自动装箱和拆箱就是将基本数据类型和包装类之间进行自动的互相转换。JDK1.5后，Java引入了自动装箱(autoboxing)/拆箱(unboxing)。

自动装箱：基本类型的数据处于需要对象的环境中时，会自动转为“对象”。
自动拆箱：每当需要一个值时，对象会自动转成基本数据类型，没必要再去显式调用intValue()、doubleValue()等转型方法。
如` Integer i = 5;int j = i; `这样的过程就是自动拆箱。   

用一句话总结自动装箱/拆箱：
**自动装箱过程是通过调用包装类的valueOf()方法实现的，而自动拆箱过程是通过调用包装类的 xxxValue()方法实现的（xxx代表对应的基本数据类型，如intValue()、doubleValue()等）。**



code:

```java
public class code02 {
    public static void main(String[] args) {
        //自动拆装箱
        Integer in = 5;
        Integer in2 = new Integer(5);
        int num1 = in;
        int num2 = in2.intValue();
        System.out.println("in="+in);
        System.out.println("in1="+in);
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        //==   equals
        Integer in3 = new Integer(56);
        Integer in4 = new Integer(56);
        System.out.println(in3==in4); //false
        System.out.println(in3.equals(in4));//true

        Integer in5 = 25;
        Integer in6 = 25;
        System.out.println(in5 ==in6);//true
        System.out.println(in5.equals(in6));//true

        Integer in7 = 256;
        Integer in8 = 256;
        System.out.println(in7 ==in8);//false
        System.out.println(in7.equals(in8));//true
    }
}
```

----------------



### 6.3 理解Integer源码

Integer的父类是Number类；底层就是封装了一个int类型的value常量，可以通过构造方法、intValue()等赋值取值。

```java
public class Integer extends Number {
    private final int value;
    public Integer(int value) {
        this.value = value;
    }
    @Override
    public int intValue() {
        return value;
    }
}
```



•Integer类提供了一个静态内部类IntegerCache，对于定义一个静态数组cache，长度为256，赋值为-128—127。对于自动装箱时如果是-128—127范围内的数据，直接获取数组的指定值；对于这个范围之外的数据，通过new Integer()重新创建对象。这么做的目的是提高效率。

```java
public class Integer extends Number {    
    private static class IntegerCache {
        static final int low = -128;
        static final int high;
        static final java.lang.Integer cache[];
        static {
            int h = 127;
            high = h;
            cache = new java.lang.Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new java.lang.Integer(j++);
        }
        private IntegerCache() {}
    }
    public static java.lang.Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new java.lang.Integer(i);
    }
}
```



**注意**

+ JDK1.5以后，增加了自动装箱与拆箱功能
+ 自动装箱调用的是valueOf()方法，而不是new Integer()方法。
+ 自动拆箱调用的xxxValue()方法。
+ 包装类在自动装箱时为了提高效率，对于-128~127之间的值会进行缓存处理。超过范围后，对象之间不能再使用==进行数值的比较，而是使用equals方法。

-------------------



### 6.4 String类

`String`类、`StringBuilder`类、`StringBuffer`类是三个字符串相关类。String类是的对象代表不可变的字符序列，StringBuilder类和StringBuffer类代表可变字符序列。

**使用String类**

code:

```java
package code_p10.code03;

import java.util.Arrays;

public class code03 {
    public static void main(String[] args) {
        //创建String对象
        String str = "你好世界HelloWorld";
        //String str2 = null;
        //String str3 = "";
        //String str4 = new String("你好世界HelloWorld");

        //操作String对象
        //基本操作
        System.out.println("str="+str);
        System.out.println("str的长度为"+str.length()+"个字符");
        System.out.println("str是否为空："+str.isEmpty());
        System.out.println("str是否以“你好”开始："+str.startsWith("你好"));
        System.out.println("str是否以“Wrold结束："+str.endsWith("Wrold"));
        System.out.println("str全部字母大写："+str.toUpperCase());
        System.out.println("str全部字母小写："+str.toLowerCase());
        System.out.println("str="+str);
        str = str.toUpperCase();
        System.out.println("str="+str);

        //根据索引确定子串
        System.out.println("str第三个字符为："+str.charAt(2));
        System.out.println("str第五个字符到第十个字符为："+str.substring(4,9));//按索引，包括4，不包括10
        System.out.println("str第十个字符往后："+str.substring(9));//按索引，从9开始到末尾

        //按子串确定索引
        System.out.println("str中“世界”的索引为："+str.indexOf("世界"));
        //从第一个字符开始查找，返回第一个匹配的子串的序列
        System.out.println("str中第一个“O”的索引为："+str.indexOf("O"));
        System.out.println("str中最后一个“O”的索引为："+str.lastIndexOf("O"));
        System.out.println("str中从第10个字符开始找的“O”的索引为："+str.indexOf("O",9));
        /*找不到返回-1*/System.out.println(str.indexOf("aweeeeeeeeeeee"));

        //关于String和byte[]
        byte[] bs = str.getBytes();
        System.out.println(bs.length);
        System.out.println(Arrays.toString(bs));
        String str_ = new String(bs,0,6);
        System.out.println(str_);

        //拼接与替换
        str = str.concat("，小程序员儿能有什么坏心眼儿呢");
        str = str.concat("?你说").concat("是不是？         ");
        System.out.println("str="+str);
        str = str.replace("HELLO","こんにちは");
        System.out.println("str="+str);

        //其他
        System.out.println("str中是否包含”世界“："+str.contains("世界"));
        System.out.println(str.trim());
        
        //补充
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); //!!!true !!!!!!
        System.out.println(str1.equals(str2));//true

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4));//true

        String str5 = "";
        String str6 = null;
        System.out.println(str5.isEmpty());//true
        //System.out.println(str6.isEmpty());//NullPointerException

        String str7 = "123";
        str7 = str7.concat("321");//最后追加
        str7 = str7.concat("abc");
        str7 = str7.concat("xyz");
        System.out.println(str7);
    }
}

```

**方法摘要**

| 返回值   | 方法说明                                                     |
| -------- | ------------------------------------------------------------ |
| char     | [charAt](#charAt(int))(int index)       返回指定索引处的 char 值。 |
| int      | [compareTo](#compareTo(java.lang.String))(String anotherString)       按字典顺序比较两个字符串。 |
| String   | [concat](#concat(java.lang.String))(String str)       将指定字符串连接到此字符串的结尾。 |
| boolean  | [contains](#contains(java.lang.CharSequence))(CharSequence s)       当且仅当此字符串包含指定的 char 值序列时，返回 true。 |
| boolean  | [endsWith](#endsWith(java.lang.String))(String suffix)       测试此字符串是否以指定的后缀结束。 |
| boolean  | [equals](#equals(java.lang.Object))([Object](mk:@MSITStore:C:\Users\Administrator\Desktop\JDK_API_1_6_zh_CN.CHM::/java/lang/Object.html) anObject)       将此字符串与指定的对象比较。 |
| boolean  | [equalsIgnoreCase](#equalsIgnoreCase(java.lang.String))(String anotherString)       将此 String 与另一个 String 比较，不考虑大小写。 |
| int      | [hashCode](#hashCode())()       返回此字符串的哈希码。       |
| int      | [indexOf](#indexOf(int))(int ch)       返回指定字符在此字符串中第一次出现处的索引。 |
| int      | [indexOf](#indexOf(int, int))(int ch, int fromIndex)  返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 |
| int      | [indexOf](#indexOf(java.lang.String))(String str)       返回指定子字符串在此字符串中第一次出现处的索引。 |
| int      | [indexOf](#indexOf(java.lang.String, int))(String str, int fromIndex)  返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。 |
| boolean  | [isEmpty](#isEmpty())()       当且仅当 [length()](#length()) 为 0 时返回 true。 |
| int      | [lastIndexOf](#lastIndexOf(int))(int ch)       返回指定字符在此字符串中最后一次出现处的索引。 |
| int      | [lastIndexOf](#lastIndexOf(int, int))(int ch, int fromIndex)       返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 |
| int      | [lastIndexOf](#lastIndexOf(java.lang.String))(String str)       返回指定子字符串在此字符串中最右边出现处的索引。 |
| int      | [lastIndexOf](#lastIndexOf(java.lang.String, int))(String str, int fromIndex)       返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。 |
| int      | [length](#length())()       返回此字符串的长度。             |
| String   | [replace](#replace(char, char))(char oldChar, char newChar)       返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 |
| String   | [replace](#replace(java.lang.CharSequence, java.lang.CharSequence))(CharSequence target, CharSequence replacement)       使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 |
| String   | [replaceAll](#replaceAll(java.lang.String, java.lang.String))(String regex,String replacement)       使用给定的 replacement 替换此字符串所有匹配给定的[正则表达式](#sum)的子字符串。 |
| String[] | [split](#split(java.lang.String))(String regex)       根据给定[正则表达式](#sum)的匹配拆分此字符串。 |
| boolean  | [startsWith](#startsWith(java.lang.String))(String prefix)       测试此字符串是否以指定的前缀开始。 |
| boolean  | [startsWith](#startsWith(java.lang.String, int))(String prefix, int toffset)       测试此字符串从指定索引开始的子字符串是否以指定前缀开始。 |
| String   | [substring](#substring(int))(int beginIndex)       返回一个新的字符串，它是此字符串的一个子字符串。 |
| String   | [substring](#substring(int, int))(int beginIndex, int endIndex)       返回一个新字符串，它是此字符串的一个子字符串。 |
| String   | [toLowerCase](#toLowerCase())()       使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 |
| String   | [toString](#toString())()       返回此对象本身（它已经是一个字符串！）。 |
| String   | [toUpperCase](#toUpperCase())()       使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 |
| String   | [trim](#trim())()       返回字符串的副本，忽略前导空白和尾部空白。 |

-----------

### 6.5理解String类源码

```java
•String类是一个final类，意味着该类不能再有子类。
•String类底层是一个字符数组value。各种方法的操作其实都是对该数组的操作。
public final class String
     implements java.io.Serializable, Comparable, CharSequence {    
private final char value[];
    public String() {
        this.value = "".value;
    }
    public String(java.lang.String original) {
        this.value = original.value;
        //this.hash = original.hash;
    }
    public boolean isEmpty() {
        return value.length == 0;
    }
    public int length() {
        return value.length;
    }
    public char charAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }
    public java.lang.String toString() {
        return this;
    }
}
```

String类的equals()方法其实就是比较底层的字符数组的各个元素是否相同，只要发现一个字符不相同，就返回false。如果所有字符都相同，返回true。但是如果两个变量指向了同一个字符数组，直接返回true。

```java
public final class String
    implements java.io.Serializable, Comparable, CharSequence {
     public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof java.lang.String) {
            java.lang.String anotherString = (java.lang.String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
```

String类的concat()是创建一个新的字符数组，存放原来字符数组和新加入的字符数组内容，然后以该新数组创建一个新的字符串。

```java
public final class String
        implements java.io.Serializable, Comparable<java.lang.String>, CharSequence {
   public java.lang.String concat(java.lang.String str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = value.length;
        char buf[] = Arrays.copyOf(value, len + otherLen);
        str.getChars(buf, len);
        return new java.lang.String(buf, true);
    }
}
```

----------------------



### 6.6  StringBuffer和StringBuilder

StringBuffer和StringBuilder非常类似，均代表可变的字符序列。这两个类都是抽象类AbstractStringBuilder的子类，方法几乎一模一样。

StringBuffer  JDK1.0提供的类，**线程安全，做线程同步检查，效率较低。**

StringBuilder  JDK1.5提供的类，**线程不安全，不做线程同步检查，因此效率较高。** 

code:

```java
package code_p10.code04;

public class code04 {
    static StringBuilder sbd = new StringBuilder("我是StringBuilder字符串");
    static StringBuffer sbf = new StringBuffer("我是StringBuffer字符串");

    public static void out(){
        System.out.println("sbd= "+sbd);
        System.out.println("sbf= "+sbf+"\n");
    }

    public static void main(String[] args) {

        

        //末尾追加
        sbd.append(114514);
        sbf.append("。114514");
        out();

        //插入
        sbd.insert(0,"sbd：");
        sbf.insert(0,"sbf：");
        out();

        //放置字符
        sbd.setCharAt(1,'B');
        sbf.setCharAt(2,'F');
        out();

        //替换
        sbd.replace(0,3,"S B D");
        sbf.replace(0,3,"S B F");
        out();

        //删除
        sbd.deleteCharAt(3);
        sbf.delete(10,sbf.length());
        out();
        
        //翻转
        sbd.reverse();
        sbf.reverse();
        out();

        //转换为字符串
        String str = sbd.toString();
        System.out.println(str);
        String str2 = sbf.toString();
        System.out.println(str2);
    }
}
```

注意
实际开发中StringBuilder的使用场合：字符串的拼接（SQL语句）
 StringBuilder builder = new StringBuilder("123");
 builder.append("321");
 builder.append("abc");
 String str =builder.toString();

方法摘要


| 方法          | 说明                                                         |
| ------------- | ------------------------------------------------------------ |
| StringBuilder | [append](#append(boolean))(boolean b)       将 boolean 参数的字符串表示形式追加到序列。 |
| int           | [capacity](#capacity())()       返回当前容量。               |
| char          | [charAt](#charAt(int))(int index)       返回此序列中指定索引处的 char 值。 |
| StringBuilder | [delete](#delete(int, int))(int start, int end)       移除此序列的子字符串中的字符。 |
| StringBuilder | [deleteCharAt](#deleteCharAt(int))(int index)       移除此序列指定位置上的 char。 |
| void          | [ensureCapacity](#ensureCapacity(int))(int minimumCapacity)       确保容量至少等于指定的最小值。 |
| int           | [indexOf](#indexOf(java.lang.String))(String str)       返回第一次出现的指定子字符串在该字符串中的索引。 |
| int           | [indexOf](#indexOf(java.lang.String, int))(String str, int fromIndex)       从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。 |
| StringBuilder | [insert](#insert(int, boolean))(int offset, boolean b)       将 boolean 参数的字符串表示形式插入此序列中。 |
| int           | [lastIndexOf](#lastIndexOf(java.lang.String))(String str)       返回最右边出现的指定子字符串在此字符串中的索引。 |
| int           | [lastIndexOf](#lastIndexOf(java.lang.String, int))(String str, int fromIndex)       返回最后一次出现的指定子字符串在此字符串中的索引。 |
| int           | [length](#length())()       返回长度（字符数）。             |
| StringBuilder | [replace](#replace(int, int, java.lang.String))(int start, int end,String str)       使用给定 String 中的字符替换此序列的子字符串中的字符。 |
| StringBuilder | [reverse](#reverse())()       将此字符序列用其反转形式取代。 |
| String        | [substring](#substring(int))(int start)       返回一个新的 String，它包含此字符序列当前所包含字符的子序列。 |
| String        | [substring](#substring(int, int))(int start, int end)       返回一个新的 String，它包含此序列当前所包含字符的子序列。 |
| String        | [toString](#toString())()       返回此序列中数据的字符串表示形式。 |

-----------



### 6.7 理解StringBuilder源码

StringBuilder类底层和String类一样，也是一个字符串数组value，但是不是final的。变量count表示的是底层字符数组的元素的真实个数，不是底层字符数组的长度。

默认数组的长度是16。也可以通过构造方法直接指定初始长度。length()方法返回的是字符数组元素的真实个数，capacity()返回的是底层数组的长度；

```java
public final class StringBuilder {//省略父类AbstractStringBuilder
    char[] value;
    int count;
	public StringBuilder() {
       super(16);
		//value = new char[capacity];
    }
	public StringBuilder(int capacity) {
       super(capacity);
    }
	public int length() {
        return count;
    }
    public int capacity() {
        return value.length;
    }
    public String toString() {
        return new String(value, 0, count);
    }
}
```



每次添加字符串时要扩容，扩容的默认策略时候增加到原来长度的2倍再加2。

```java
public AbstractStringBuilder append(String str) {
    //如果添加的字符串是null，特殊处理
    if (str == null){
        return appendNull();
    }
    //获取要新增的字符串的长度
    int len = str.length();
    //要扩容，要扩容多少呢？
    ensureCapacityInternal(count + len);
    //扩容后将新的字符串追加到最后
    str.getChars(0, len, value, count);
    //字符串的长度增加了
    count += len;
    //返回最新的StringBuilder
        return this;
    }
    private void ensureCapacityInternal(int minimumCapacity) {
    //如果长度不足，就扩容
    if (minimumCapacity - value.length > 0) {
            value = Arrays.copyOf(value,
                    newCapacity(minimumCapacity));
        }
    }
    private int newCapacity(int minCapacity) {
    //默认策略：数组原来长度的2倍+2
    int newCapacity = (value.length << 1) + 2;
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        return (newCapacity <= 0 ||MAX_ARRAY_SIZE-newCapacity < 0)
            ? hugeCapacity(minCapacity)
            : newCapacity;
}
```



+ **String：不可变字符序列。**
+ **StringBuffer：可变字符序列，并且线程安全，但是效率低。**

+ **StringBuilder：可变字符序列，线程不安全，但是效率高。**

-----------------------------



### 6.8 日期类

时间是一维的。所以我们需要一把刻度尺来表达和度量时间。在计算机世界，我们把1970 年 1 月 1 日 00:00:00定为基准时间，每个度量单位是毫秒。



我们用long类型的变量来表示时间，从基准时间往前几亿年，往后几亿年都能表示。如果想获得现在时刻的“时刻数值”，可以使用：

```java
long now = System.currentTimeMillis();
```


这个“时刻数值”是所有时间类的核心值，年月日都是根据这个“数值”计算出来的。我们工作学习涉及的时间相关类如下

-----------------



### 6.9Date类

在标准Java类库中包含一个Date类。它的对象表示一个特定的瞬间，精确到毫秒。在网上商城下单时，在对报销单进行审核时，都需要获取当前的时间，通过Date类就可以完成。

Date类中的很多方法都已经过时了。JDK1.1之前的Date包含了日期操作、字符串转化成时间对象等操作。JDK1.1之后，日期操作一般使用Calendar类，而字符串的转化使用DateFormat类。

code:

```java
package code_p10.code05;

import java.util.*;

public class code05 {
    public static void main(String[] args) {
        //获取当前时间
        Date now = new Date();

        //输出当前时间
        System.out.println(now.toString());
        System.out.println(now.toLocaleString());
        System.out.println("现在时间:\n"+(now.getYear()+1900)+"年");//年  //比实际结果小1900
        System.out.println((now.getMonth()+1)+"月");//月  //getMonth的结果为0~11
        System.out.println(now.getDate()+"日");//日
        System.out.println("星期"+((now.getDay()==0)?"日":now.getDay()));//星期几  //0~6,0：星期日
        System.out.println(now.getHours()+"时");//时
        System.out.println(now.getMinutes()+"分");//分
        System.out.println(now.getSeconds()+"秒");//秒

        //其他方法
        long lTime = now.getTime();//1970年1月1日00:00:00 GMT以来的毫秒数
        System.out.println("\n"+"lTime= "+lTime);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        /*
        1970-1-1【new Date(0)】前推到1969-12-1：
        1000【1秒=1000毫秒】*3600【1小时=3600毫妙】*24【1天=24小时】*31【12月有31天】
         */
        System.out.println(new Date(-(1000*3600*24*31L)).toLocaleString());

        /*
        子类:java.sql中的Date，Time，Timestamp
        java.util.Date     >>  yyyyMMdd hh:mm:ss
        java.sql.Date      >>  yyyyMMdd
        java.sql.Time      >>  hh:mm:ss
        java.sql.Timestamp >>  yyyyMMdd hh:mm:ss
         */
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
        System.out.println(new java.sql.Time(System.currentTimeMillis()));
        System.out.println(new java.sql.Timestamp(System.currentTimeMillis()));
    }
}

```

----------------------



### 6.10 理解Date类的源码

```java
public class Date
    implements java.io.Serializable, Cloneable, Comparable<Date> {
    private transient long fastTime;
    public Date() {
        this(System.currentTimeMillis());
    }
    public Date(long date) {
        fastTime = date;
    }
    public long getTime() {
        return getTimeImpl();
    }
    private final long getTimeImpl() {
        if (cdate != null && !cdate.isNormalized()) {
            normalize();
        }
        return fastTime;
    }     
}
```

Date类中提供一个成员变量fastTime，表示相应时间对应的毫秒数。

------------------



### 6.11 DateFormat类

DateFormat是一个抽象类，一般使用它的的子类SimpleDateFormat类来实现。主要作用就是把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象。

code:

```java
package code_p10.code06;

import java.util.*;
import java.text.*;

public class code06 {
    public static void main(String[] args) {
        String str = "2021-03-06 10:59:48";
        String str2 = "";
        
        //String >> Date
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try{
            date = sdf.parse(str);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(date);
        
        //Date >> String
        DateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        str2 = sdf2.format(date);
        System.out.println(str2);
        
    }
}
```

**关于日期和时间模式**

| 字母 | 日期或时间元素           | 表示              | 示例                                  |
| ---- | ------------------------ | ----------------- | ------------------------------------- |
| G    | Era 标志符               | Text              | AD                                    |
| y    | 年                       | Year              | 1996; 96                              |
| M    | 年中的月份               | Month             | July; Jul; 07                         |
| w    | 年中的周数               | Number            | 27                                    |
| W    | 月份中的周数             | Number            | 2                                     |
| D    | 年中的天数               | Number            | 189                                   |
| d    | 月份中的天数             | Number            | 10                                    |
| F    | 月份中的星期             | Number            | 2                                     |
| E    | 星期中的天数             | Text              | Tuesday; Tue                          |
| a    | Am/pm 标记               | Text              | PM                                    |
| H    | 一天中的小时数（0-23)    | Number            | Number                                |
| k    | 一天中的小时数（1-24）   | Number            | 24                                    |
| K    | am/pm 中的小时数（0-11） | Number            | 0                                     |
| h    | am/pm 中的小时数（1-12） | Number            | 12                                    |
| m    | 小时中的分钟数           | Number            | 30                                    |
| s    | 分钟中的秒数             | Number            | 55                                    |
| S    | 毫秒数                   | Number            | 978                                   |
| z    | 时区                     | General time zone | Pacific Standard Time; PST; GMT-08:00 |
| Z    | 时区                     | RFC 822 time zone | -0800                                 |

--------------------



### 6.12 Calendar类

Calendar 类是一个抽象类，为我们提供了关于日期计算的相关功能，比如：年、月、日、时、分、秒的展示和计算。GregorianCalendar 是 Calendar 的一个具体子类，提供了世界上大多数国家/地区使用的标准日历系统。

code：

```java
package code_p10.code07;

import java.util.*;

public class code07 {
    //创建日历
    static Calendar cal = new GregorianCalendar();

    public static void out(){
        //输出日期中各个部分
        System.out.print("现在时间：\n"+cal.get(Calendar.YEAR)+"年");
        System.out.print((cal.get(Calendar.MONTH)+1)+"月");//0~11月
        System.out.println(cal.get(Calendar.DATE)+"日");
        System.out.print(cal.get(Calendar.HOUR)+"时");
        System.out.print(cal.get(Calendar.MINUTE)+"分");
        System.out.print(cal.get(Calendar.SECOND)+"秒 ");
        System.out.println("星期"+((cal.get(Calendar.DAY_OF_WEEK)-1)==0?"日":(cal.get(Calendar.DAY_OF_WEEK)-1)));//1~7,对应周日~周六

    }
    public static void main(String[] args) {
        out();

        //修改日期中各个部分
        cal.set(Calendar.YEAR,2000);
        cal.set(Calendar.MONTH,0);
        cal.set(Calendar.DATE,1);
        out();

        //其他方法
        System.out.println(cal.getActualMaximum(Calendar.DATE));//给出当前日历可取的最大的值
        System.out.println(cal.getActualMinimum(Calendar.DATE));//给出当前日历可取的最小的值

        //输出Calendar对象
        System.out.println(cal);
        //Date--Calendar之间的转换
        Date now = new Date();
        cal.setTime(now);
        Date now2 = cal.getTime();
    }
}
```

------------



### 6.13 万年历

code:

```java
package code_p10.code08;

/*
 * 可视化日历
 * Calendar
 * 可以判断这个月一共多少天
 * 判断某一天是星期几
 * 1.实现思路
 *     按照提示输入任何一个日期
 *  2.打印日历
 *     打印日历头：日  一  二  三  四  五  六
 *     打印1日之前的空格（循环）
 *     打印每一天（循环），周六换行
 */

import java.util.*;
import java.text.*;

public class code08 {
    public static void main(String[] args) {
        //1. 按照提示从键盘输入日期字符串
        System.out.println("请输入日期(按照格式：2030-3-10)：");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        //2.将字符串转换成日期
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);
            //3.将日期转换成日历
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            //4.把日期中的Date（23）取出来
            int  day = calendar.get(Calendar.DATE);
            //5.日历变成了当月的1日
            calendar.set(Calendar.DATE, 1);
            //6.打印日历头信息
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //7.打印1日之前的空格（关键是知道1日时星期几）
            for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
                System.out.print('\t');
            }
            //8.打印日历1-31/28/30
            int maxDate =
                    calendar.getActualMaximum(Calendar.DATE);//获取当月的最大天数
            for(int i=1;i<=maxDate;i++){
                //8.1如果是当天，打印*
                if(i==day){
                    System.out.print("*");
                }
                //8.2打印该天
                System.out.print(i+"\t");
                //8.3如果是周六，换行
                int  w = calendar.get(Calendar.DAY_OF_WEEK);
                if(w==Calendar.SATURDAY){
                    System.out.print('\n');
                }
                //8.4日历改为下一天
                calendar.add(Calendar.DATE, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
```

---------------



### 6.14 Math类

java.lang.Math提供了一系列静态方法用于科学计算；其方法的参数和返回值类型一般为double型。如果需要更加强大的数学运算能力，计算高等数学中的相关内容，可以使用apache commons下面的Math类库。

code:

```java
package code_p10.code09;

public class code09 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.round(3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.sqrt(64));//开平方
        System.out.println(Math.pow(2,5));//幂

        System.out.println(Math.abs(-5)); //绝对值
        System.out.println(Math.max(30,40));
        System.out.println(Math.min(30,40));

        System.out.println(Math.random());//[0.0,1.0)
    }
}
```

--------------



6.15 Random类
Math类中虽然为我们提供了产生随机数的方法Math.random()，但是通常我们需要的随机数范围并不是[0, 1)之间的double类型的数据，这就需要对其进行一些复杂的运算。如果使用Math.random()计算过于复杂的话，我们可以使用例外一种方式得到随机数，即Random类，这个类是专门用来生成随机数的，并且Math.random()底层调用的就是Random的nextDouble()方法。

code:

```java
package code_p10.code10;

import java.util.Random;

public class code10 {
    public static void main(String[] args) {
        //Random rand = new Random(10000);
        Random rand = new Random((int)System.currentTimeMillis());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());
        for (int i = 0; i < 10; i++) {
            System.out.print(rand.nextInt(10)+"  ");
        }
    }
}

```

只要种子数和nextInt()中的参数一致的话，每次生成的随机数都是一样的（所以这是伪随机数）。

-----------------



### 6.15 枚举

JDK1.5引入了枚举类型。枚举类型的定义包括枚举声明和枚举体。枚举体就是放置一些常量。
定义枚举要使用enum关键字。对于性别、季节、星期几等内容，如果定义为字符串类型，是很难限制其取值的。采用枚举可以轻松解决该问题。

所有的枚举类型隐性地继承自 java.lang.Enum。枚举实质上还是类。而每个被枚举的成员实质就是一个枚举类型的实例，他们默认都是public static final修饰的。可以直接通过枚举类型名使用它们。

code:

```java
package code_p10.code11;

public enum Seasons {
    SPRING,SUMMER,FALL,WINTER
}
```

```java
package code_p10.code11;

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
```



### 6.16File类

File类用来代表文件和文件夹。主要作用有两个：获取文件或者文件夹的属性； 实现对文件、文件夹的创建和删除。 文件夹：file folder  目录：directory

code：

```java
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
```



### 6.17 File类删除，创建文件和文件夹

```java
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
```

**注意**

+ **File不仅可以指向一个文件，也可以指向一个文件夹（作为一个文件对待）**
+ **File不能对文件的内容进行操作，需要借助IO流实现**