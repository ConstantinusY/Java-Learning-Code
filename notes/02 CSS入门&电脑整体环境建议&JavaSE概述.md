# 三、CSS入门

## 1.什么是CSS？

CSS：层叠样式表(Cascading Style Sheets)可以静态地修饰网页，还可以配合各种脚本语言动态地对网页各元素进行格式化。 能够对网页中元素位置的排版进行像素级精确控制，支持几乎所有的字体字号样式，拥有对网页对象和模型样式编辑的能力。**人话：让网页更好康**

HTML用来搭建网页主体结构，是毛坯房；而CSS用来修饰网页，相当于精装修。

-------------------



## 2.CSS的引入



* ### **行内式引入：**

  借助标签的style属性引入，style属性中的值语法为`样式名:样式值; 样式名:样式值; ......`
  例：

  ```html
  <span style="font-size: 20px; 
               color: darkslateblue; 
               background-color: lightcoral;">
      CSS!你值得拥有
  </span>
  ```

* ### **内嵌式**

  将css样式的代码抽取出来，通过选择器确定样式作用范围。在head中使用一对style标签定义css样式

  在style中写注释要用/* */

  减少相同代码编写量，减少代码维护工作量
  例：

  ```html
  <head>
  	<style>
  		/* 选择器 */
  		span{
  		   "font-size: 20px; 
  		    color: darkslateblue; 
  			background-color: lightcoral;"
  		}
  	</style>
  </head>
  <body>
  	<span>aaaaaaa</span>
  	<span>bbbbbbb</span>
  	<span>ccccccc</span>
  </body>
  ```

* ### **链接式**

  行内式只能将样式作用于当前标签；内嵌式可以将样式作用与多个标签，但不能作用于其他网页。

  链接式可以将CSS代码放入独立的.css文件中，可以使当前页面简洁，可以将样式作用扩大到多个不同网页。
  每一个需要引入样式的HTML，在head中使用link标签即可。

  | 属性 | 作用                       |
  | ---- | -------------------------- |
  | rel  | 告诉浏览器链接的文件的类型 |
  | href | 链接文件路径               |

* 当三种引用同时作用与同一个标签，优先级原则：**就近原则**

code（multifile）：

.css:

```css
span{
   "font-size: 20px; 
    color: darkslateblue; 
	background-color: lightcoral;"
}
```

.html:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>11 CSS的引入方式</title>
		
		<link rel="stylesheet" href="css/11 CSS的引入方式.css" />
		
		<!--<style>
			/* 选择器 */
			span{
			   "font-size: 20px; 
			    color: darkslateblue; 
				background-color: lightcoral;"
			}
		</style>-->
	</head>
	<body>
		<!--<span style="font-size: 20px; 
			     	 color: darkslateblue; 
					 background-color: lightcoral;">
			CSS!你值得拥有
		</span>-->
		<span>aaaaaaa</span>
		<span>bbbbbbb</span>
		<span>ccccccc</span>
	</body>
</html>
```

-----------



## 3.CSS选择器

### 3.1基本选择器

| 选择器       | 作用&写法                                                    |
| ------------ | ------------------------------------------------------------ |
| 标签名选择器 | 给页面所有同名的标签定义样式的选择器<br />写法：标签名{样式} |
| id选择器     | 一般body任何一个标签都有id属性，<br />它帮助我们定位给到页面上唯一的一个标签，不允许重复值<br />id属性命名有规则：不能有空格和一些特殊符号<br />（特殊符号中仅可以使用_和$，不推荐$，会和jquery命名冲突，不可以数字开头）<br />推荐写法：英文字母开头，数字放在后面。<br />写法：#id值{样式} |
| 类选择器     | 一般body任何一个标签都有class属性<br />多个不同的标签可以有相同的calss属性<br />通过标签的class属性确定样式的作用范围<br />写法：.class属性值{样式} |

code:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>12 CSS基本选择器</title>
		<style>
			/* 标签名选择器 */
			span{
				border: 4px solid red;
			}
			/* id选择器 */
			#p1{
				border: 4px solid green;
			}
			/* 类选择器 */
			.c1{
				border: 4px solid blue;
			}
		</style>
	</head>
	<body>
		<span>ohhhhhhh</span>
		<p id="p1">ohhhhhhh</p>
		<h1 class="c1">ohhhhhhh</h1>
		<h2 class="c1">ohhhhhhh</h2>
	</body>
</html>

```



### 3.2其他选择器

| 选择器     | 作用&写法                                                    |
| ---------- | ------------------------------------------------------------ |
| 层级选择器 | 通过层级关系定位样式的作用范围<br />写法：第一层 第二层 ...... 目标层（目标层里所有目标标签全部被选择）<br />（每层可以是标签，id，class……） |
| 属性选择器 | 根据标签的某个属性的特定值确定样式的作用范围<br />写法：标签\|\|id\|\|class[值]{样式} |
| 分组选择器 | 将多个不同层级关系 不同class属性 id 标签名同时使用相同的样式效果<br />写法：标签\|\|id\|\|class,标签\|\|id\|\|class,...{样式} |

code：

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>13 CSS其他选择器</title>
		<style type="text/css">
			/* 层级选择器 */
			p span{
				border: 4px solid red;
			}
			/* 属性选择器 */
			input[type="password"]{
				border: 4px solid green;
			}
			/* 分组选择器 */
			#ha, .c2{
				border: 4px solid blue;
			}
		</style>
	</head>
	<body>
			<span>ohhhhhhh</span>
			<p><span>ohhhhhhh</span><p>
				
			<input type="password" /><br /><br />
			
			<input type="text" id="ha" />
			<input type="text" class="c2"/>
	</body>
</html>
```

------------



### 3.3 伪类选择器

伪类选择器用于向某些选择器添加特殊效果

写法：选择器:伪类名{样式}

伪类选择器顺序要求严格，如hover必须置于link/visited后，而active必须置于hover后。

code：

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>14 CSS伪类选择器</title>
		<style>
			a:link{
				color: black;
			}
			a:visited{
				color: darkgrey;
			}
			a:hover{
				color: green;
			}
			a:active{
				color: red;
			}
			div{
				border: 2px double cyan;
				width: 100px;
				height: 100px;
				background-color: lightcoral;
			}
			div:hover{
				background-color: coral;
			}
		</style>
	</head>
	<body>
		<a href="https://www.baidu.com">打开百度</a>
		<div>	</div>
	</body>
</html>
```

--------------



## 4.网页的布局

网页要有格局，网页的布局就是网页内容的主体规划

要想完成网页的布局，需要三种基本技术

+ 盒子模型——标签和标签存在包含关系时位置的调整
+ 浮动——多个块标签处于同一行的位置处理问题
+ 定位——块标签在页面指定位置的处理问题

块标签→独立站用一行的标签，行内标签→不会独占一行的标签

一般布局时使用的是块标签div，它可以帮助我们将网页划分为多个小方块

div边线类型：dotted,dashed,solid,double,groove,ridge,inset,outset

--------------

### 4.1盒子模型

标签和标签存在包含关系时位置的调整，好比两个一大一小的盒子大的装小的，小盒子在大盒子内部的位置调整

#### 内边距：

当前块标签内部的元素和当前块标签边缘的距离

内边距不会向内占用空间，而是会将块标签放大

写法1——padding: 内边距px;  同时设定上下左右四个内边距 

写法2——padding: 上下内边距px 左右px

写法3——padding：顶部内边距px 右内边距px 底部内边距px 左内边距px（顺时针）

写法4——padding-top/bottom/left/right 

#### 外边距：

当前块标签外部的元素和父级标签边缘的距离

写法1——margin: 外边距px;  同时设定上下左右四个外边距 

写法2——margin: 上下外边距px 左右px

写法3——margin：顶部外边距px 右外边距px 底部外边距px 左外边距px（顺时针）

写法4——margin-top/bottom/left/right 

#### 调整盒子位置：

可以选择调整外部盒子内边距或内部盒子外边距

#### 外边距设置居中：

利用auto实现

code:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>15 盒子模型_1</title>
		<style>
			#outerDiv{
				border: 3px dotted darkcyan;
				width: 500px;
				height: 500px;
				/*内边距设定 */
				/*padding: 100px;
				/*padding: 10px 20px;
				/*padding: 10px 20px 30px 40px;/*按照顺时针设置内边距*/
				padding-top: 20px;
				padding-bottom: 20px;
				padding-left: 20px;
				padding-right: 20px;

				/*外边距设定*/
				/*margin: 100px;
				/*margin: 10px 20px;
				/*margin: 10px 20px 30px 40px;/*按照顺时针设置外边距*/
				/*margin-top: 20px;
				margin-bottom: 20px;
				margin-left: 20px;
				margin-right: 20px;*/
				margin: 20px auto;
			}
			#innerDiv{
				border: 1px solid cyan;
				width: 100%;
				height: 100%;
			}
		</style>
	</head>
	<body style="border: 1px inset darkblue ;">
		<div id="outerDiv" >
			<div id="innerDiv"></div>
		</div>
	</body>
</html>

```



#### 块标签和行内标签的转换：

span是一个行内元素，行内元素没有盒子模型，不可以设置内外边距，只有块标签才有盒子模型，如果一个行内标签非要使用盒子模型，那么可以将行内元素转换为块元素。

转换方法：display: **block/inline**

block转换为块，inline转换为行内

code:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>16 块标签和行内标签的转换</title>
		<style>
			#div1_16{
				border: 3px double blue;
				background-color: lightcyan;
				width: 500px;
				height: 500px;
				margin: 0px auto;
			}
			#span1_16{
				display: block;
				width: 300px;
				margin: 20px auto;
				background-color: darkcyan;
				color: lightgoldenrodyellow;
			}
		</style>
	</head>
	<body>
		<div id="div1_16">
			<span id="span1_16">我是行内标签，但我被转换为了块标签</span>
		</div>1
		
	</body>
</html>
```

**注意**：

width：块标签**实际容量**宽度

height：块标签**实际容量**高度

盒子模型无论内边距还是外边距的调整都不会影响块标签内部容量

---------



### 4.2浮动

可以让多个块标签处于同一行（在父标签下浮动）而不用转换成行内元素，这使块标签的样式可以保留。使用float实现

code： 

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>17 浮动</title>
		
		<style>
			.d1,.d2,.d3{
				width: 197px;
				height: 497px;
				border: 3px double darkgray;
				
				/*浮动*/
				float: left;
				
				margin-left: 20px;
			}
			.d1{
				background-color: lightcoral;
			}
			.d2{
				background-color: lightgoldenrodyellow;
			}
			.d3{
				background-color: lightblue;
			}

		</style>
	</head>
	<body>
		<div class = "d1">
			1
		</div>
		<div class = "d2">
			2
		</div>
		<div class = "d3">
			3
		</div>
	</body>
</html>

```

浮动案例：12306广告位

-------------

### 4.3定位

页面布局手段。

#### **绝对定位**

绝对的位置

当位置发生改变时，会释放原来的位置，其他标签可以占用原来的位置

使用absolute实现

#### **相对定位**

相对于原来的位置

当位置发生改变时，不会释放原来的位置，其他标签不可以占用原来的位置

使用relative实现

#### **相对浏览器窗口定位**

相对于浏览器窗口定位

使用fixed实现

code:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>19 定位</title>
		<style>
			.blocks{
				width: 97px;
				height: 97px;
				background-color: lightcoral;
				border: 3px double red;
			}
			#div1_19{
				position: absolute;
				top: 200px;
				left: 500px;
			}
			#div2_19{
				position: absolute;
				top: 500px;
				left: 100px;
			}
			#div3_19{
				position: relative;
				top: 200px;
				left: 200px;
			}
			#div4_19{
				position: fixed;
				top: 800px;
				left: 800px;
			}
		</style>
	</head>
	<body ">
		<div class="blocks" id="div1_19">1</div>
		<div class="blocks" id="div2_19">2</div>
		<div class="blocks" id="div3_19">3</div>
        <div class="blocks" id="div4_19">4</div>
	</body>
</html
```

----------------







# *电脑整体环境建议

+ 电脑上尽量不放文件

+ 除系统组件外，软件尽量安装到其他盘（可以做分类——program_it，program_other
+ 新安装软件时给软件安排一个文件夹
+ 软件安装路径中尽量避免中文和空格
+ 灵活划分盘符
+ 使用一个文件来列出软件名方便快速重装，配置部署







# 四、JAVA概述

## 1.Java历史

### 1.1公司

最初由美国 SUN（Stanford University Network)公司发明，后被Oracle收购

### 1.2Java为什么被发明

Green项目。应用环境：像电视盒这样的消费类电子产品。要求：语言本身中立，可以跨平台。

### 1.3Java的发明人

**James Gosling** 

### 1.4经历阶段

1991年，James Gosling在SUN公司的工程师小组想要设计这样一种小型计算机语言。该语言主要用于像电视盒这样的消费类电子产品。另外，由于不同的厂商选择不同的CPU和操作系统，因此，要求该语言不能和特定的体系结构绑在一起，要求语言本身是中立的，也就是跨平台的。所以，将这个语言命名为“Green”，类似于绿色软件的意思。后来，改名为Oak，橡树的意思。改名后发现已经有一种语言叫这个名字了，再改名叫Java。Java语言发展到今天经历了一系列的过程：

+  1991年，SUN公司的Green项目，Oak

+  1995年，推出Java测试版

+  1996年，JDK1.0

+  1997年，JDK1.1

+  1998年，JDK1.2，大大改进了早期版本缺陷，是一个革命性的版本，更名为Java2。

+  2004年，J2SE 5.0 (1.5.0)  Tiger老虎 成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE1.5更名为Java SE 5.0

+  2005年，Java的各种版本已经更名，以取消其中的数字"2"： J2ME更名为Java ME， J2SE更名为Java SE， J2EE更名为Java EE；

+  2006年，J2SE 6.0 (1.6.0)  Mustang野马

+  2009年，甲骨文(oracle)收购SUN，交易高达价格74亿

+  2011年，JavaSE7.0  Dolphin海豚

+  2014年，JavaSE8.0 

+  2017年，JAVA 9.0

+  2018年3月，JAVA 10

+  2018年9月，JAVA 11

+  2019年3月，JAVA 12

+  2019年9月，JAVA 13

SUN公司已经被oracle公司收购，目前每半年更新一次java的版本。但是，企业中的主流仍然是7和8。

## 2.Java特点

### 2.1 Java体系结构

**JavaSE（Java  Standard  Edition）：标准版，定位在个人计算机上的应用**

这个版本是Java平台的核心，它提供了非常丰富的API来开发一般个人计算机上的应用程序，包括用户界面接口AWT及Swing，网络功能与国际化、图像处理能力以及输入输出支持等。在上世纪90年代末互联网上大放异彩的Applet也属于这个版本。Applet后来为Flash取代，Flash被HTML5取代。

**JavaEE（Java  Enterprise Edition）：企业版，定位在服务器端的应用**

JavaEE是JavaSE的扩展，增加了用于服务器开发的类库。如：JDBC是让程序员能直接在Java内使用的SQL的语法来访问数据库内的数据；Servlet能够延伸服务器的功能，通过请求-响应的模式来处理客户端的请求；JSP是一种可以将Java程序代码内嵌在网页内的技术；

**JavaME（Java  Micro  Edition）：微型版，定位在消费性电子产品的应用上**

JavaME是JavaSE的内伸，包含J2SE的一部分核心类，也有自己的扩展类,增加了适合微小装置的类库：javax.microedition.io.*等。该版本针对资源有限的电子消费产品的需求精简核心类库，并提供了模块化的架构让不同类型产品能够随时增加支持的能力。

### 2.2Java特性和优势

##### **跨平台/可移植性**

这是Java的核心优势。Java在设计时就很注重移植和跨平台性。比如：Java的int永远都是32位。不像C++可能是16，32，可能是根据编译器厂商规定的变化。这样的话程序的移植就会非常麻烦。

#####  **安全性**

Java适合于网络/分布式环境，为了达到这个目标，在安全性方面投入了很大的精力，使Java可以很容易构建防病毒，防篡改的系统。

#####  **面向对象**

面向对象是一种程序设计技术，非常适合大型软件的设计和开发。由于C++为了照顾大量C语言使用者而兼容了C，使得自身仅仅成为了带类的C语言，多少影响了其面向对象的彻底性！Java则是完全的面向对象语言。

#####  **简单性**

Java就是C++语法的简化版。

#####  **高性能**

Java最初发展阶段，总是被人诟病“性能低”；客观上，高级语言运行效率总是低于低级语言的，这个无法避免。Java语言本身发展中通过虚拟机的优化提升了几十倍运行效率。比如，通过JIT(JUST IN TIME)即时编译技术提高运行效率。 将一些“热点”字节码编译成本地机器码，并将结果缓存起来，在需要的时候重新调用。这样的话，使Java程序的执行效率大大提高，某些代码甚至接待C++的效率。

因此，Java低性能的短腿，已经被完全解决了。业界发展上，我们也看到很多C++应用转到Java开发，很多C++程序员转型为Java程序员。

#####  **分布式**

Java是为Internet的分布式环境设计的，因为它能够处理TCP/IP协议。事实上，通过URL访问一个网络资源和访问本地文件是一样简单的。Java还支持远程方法调用(RMI,Remote Method Invocation)，使程序能够通过网络调用方法。

#####  **多线程**

多线程的使用可以带来更好的交互响应和实时行为。 Java多线程的简单性是Java成为主流服务器端开发语言的主要原因之一。

#####  **健壮性**

Java是一种健壮的语言，吸收了C/C++ 语言的优点，但去掉了其影响程序健壮性的部分（如：指针、内存的申请与释放等）。Java程序不可能造成计算机崩溃。即使Java程序也可能有错误。如果出现某种出乎意料之事，程序也不会崩溃，而是把该异常抛出，再通过异常处理机制加以处理。

### 2.3Java核心机制

##### **垃圾回收机制**

垃圾收集的目的在除不再使用的对象，当对象建立的时候垃圾收集期，就开始监控对象的动态情况，垃圾收集主要是对内存的释放。创建对象的时候申请一个空间

1. 不再使用的内存空间应回收→垃圾收集；

2. Java消除了程序员回收无用内存空间的职责；提供一种系统级线程跟踪存储空间的分配情况。在JVM的空闲时，检查并释放可被释放的存储器空间。

3. 垃圾收集在Java程序运行过程中自动进行，程序员无法精确控制和干预；

4. GC的自动回收，提高了内存空间的利用效率，也提高了编程人员的效率，很大程度上减少了因为没有释放空间而导致的内存泄露。 

##### **跨平台机制**

JAVA的跨平台性能优越 同样的代码可以在不同的终端使用

互联网的发展 需要程序在多种不同的平台上 终端上运行 要求我们的程序在跨平台处理上有这非常方便形式和优秀的性能

JVM(Java Virtual Machine)就是一个虚拟的用于执行bytecode字节码的”虚拟计算机”。他也定义了指令集、寄存器集、结构栈、垃圾收集堆、内存区域。JVM负责将Java字节码解释运行，边解释边运行，这样，速度就会受到一定的影响。

不同的操作系统有不同的虚拟机。Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，随处运行”。 Java虚拟机是实现跨平台的核心机制。