# 一、互联网技术概念入门

### （1）互联网软件的两种模式

* Client（Customer）/Server： **CS模式**，客户端/服务器模式
  需要下载客户端，且软件由客户端和服务端两部分组成。
  缺点：更新较麻烦——所有客户端都需要更新。
* 优点：运算压力可以分摊给各个终端（服务器运算压力大大减少）
* Browser/Server： **BS模式**，浏览器/服务器模式
  不需要下载客户端，只需要有一个浏览器，软件全部部署在服务器端。
  缺点：运算压力基本在服务端 一般不会用来做大型游戏
  优点：更新较简——只要更新服务器即可

### （2）互联网三大基石 ——  URL、HTTP协议、HTML

互联网依赖的三种基础技术。

* URL：统一资源定位符
* HTTP协议：数据解析的规范
* HTML：数据传递的载体





# 二、HTML入门

## 1.什么是HTML？

**HTML**(**H**yper **T**ext **M**arkup **L**anguage)指超文本标记语言,是用来描述网页的一种语言

a) 超文本：比普通文本更牛逼的文本 不仅仅可以展示文字 可以展示各种媒体内容

b) 一般由前端工作人员来完成,后台研发人员不需要编写

c) 标记：(标签/元素/标记)

标记通常被称为 HTML 标签 (HTML tag)。

* HTML 标签是由尖括号包围的关键词，比如 `<html>`
* 封闭类型标记（也叫双标记），必须成对出现,如`<p></p>`
* 标签对中的第一个标签是开始标签，第二个标签是结束标签
* 开始和结束标签也被称为开放标签和闭合标签
* 非封闭类型标记，也叫作空标记，或者单标记，如`<br/>`

---------------------



## 2.HTML基本结构

注释：给人看的提示，不显示出来的内容，不执行的代码。写法：`<!-- 内容 -->` 。快捷键：ctrl + shift + /

```html
<html> <!-- 根标签， 所有其他的标签都放入该标签中，根标签有两个一级子标签:head,body -->

    <head> <!--头标签，不显示在网页上，但是又比较重要的信息-->

    </head>

    <body> <!--体标签,显示在页面上的内容 -->

    <body> 

</html>
```

--------------------



## 3.HTML专业词汇和概念

### **标签（tag）：**

* 分为单标签（如meta）和  双标签（如html head  body title）  
* 标记(签)是HTML语言的基本部分 
* 标签是分层次的；多数标记总是成对出现，包括开始标签和结束标签； 
* 根标签是html，包括两个子标签head和body 
* 标签不区分大小写。例如`<html>或<HTML>`都可以 

### **属性和属性值（attribute）**

* 附属于标签，对标签的特征进行设置 
* 属性的值可以用双引号引起来（单引号也可以） 
* 属性和属性值不区分大小写 
* 属性之间无先后次序，属性也可省略（即取默认值） 
* 属性都是写在开始标签中 

```html
 <!--画一条长300像素，粗15像素的深青色直线,居右>
<hr width="300"  color="darkcyan" size="15" align ="right"/> 
```

如上例，width,color,size,align为hr标签的属性

### 文本（text）

* 标签的内容可以是子标签或者普通文本 

* 最内层标签的内容称为文本 

* 外层标签的内容也可以统称为文本 

```html
<!--文本处理标签-->
<font color="green"> 好家伙er </font>
```

如上例，好家伙er就是文本

### **元素(element)**

* 开始标记+中间内容+结束标记 
* HTML文档包括两部分：头部部分和主体部分
* 一个完整的标签我们也称之为为网页上的一个元素

------------------



## 4.HTML标签

### 4.1 `<head></head>`标签：

Head标签用于定义文档的头部，它是所有头部元素的容器。`<head>` 中的元素可以引用脚本、指示浏览器在哪里找到样式表。文档的头部描述了文档的各种属性和信息，包括文档的标题、在 Web 中的位置以及和其他文档的关系等。绝大多数文档头部包含的数据都不会真正作为内容显示给读者。

下面这些标签可用在 head 部分：

```html
<title>、<meta>、<link>、<style>、 <script>。
```

应该把` <head> `标签放在文档的开始处，紧跟在`<html> `后面，并处于 `<body> `标签之前。

文档的头部经常会包含一些` <meta> `标签，用来告诉浏览器关于文档的附加信息。

#### ***title标签***

可定义文档的标题。它显示在浏览器窗口的标题栏或状态栏上。title写和你网页相关的关键词有利于SEO优化

#### ***meta标签***

META标签用来描述一个HTML网页文档的属性，元素可提供有关页面的元信息（meta-information），用来向浏览器或搜索引擎描述页面。比如文档的描述和关键词。它只可以放在head中。属于元信息标签。

常用属性：

* charset属性：用于定义当前页面的字符集，告诉浏览器以什么字符集解析当前页面
* name属性： 一般用于定义当前网页的一些简单描述 便于在搜索引擎上根据描述搜索到当前网页
* author属性：作者
* description属性：描述 一段陈述文字,描述当前网页
* html 属性值使用单引号或者是双引号 皆可
* http-equiv:相当于http的文件头作用，它可以向浏览器传回一些有用的信息，以帮助正确和精确地显示网页内容，与之对应的属性值为content，content中的内容其实就是各个参数的变量值。 

code:

```html
<html>
	<head>		
		<meta charset = "utf-8" /> 
		<meta name="keywords" content="关键字1,关键字2"/>
		<meta name="author" content="COnY" />
		<meta name="description" content="哦我的上帝" />
        
		<!--在多少秒后对网页进行刷新-->
		<!--<meta http-equiv="refresh" content="5;https://www.baidu.com" />-->

		<title>第一个小网页</title>		
	</head>
	
	<body>
		<body bgcolor="aliceblue"><!--不只有head可以写属性-->	
            
		没人比我更懂这个html
	</body>
</html>

```

-----------------

### 4.2 标题标签和段落标签

#### 标题标签

`<h1></h1>`~`<h6></h6>`：一级标签到六级标题。注意：h7,h8,h9等是无效的

#### 段落标签

`<br/>`：换行标签

`<p>`：段落标签 被段落标签包裹的文本就是独立的一个段落，段落内部不换行，段落和段落之间换行

#### 格式化标签

| 标签       | 描述           |
| :--------- | :------------- |
| `<b>`      | 定义粗体文本。 |
| `<big>`    | 定义大号字。   |
| `<em>`     | 义着重文字。   |
| `<i>`      | 定义斜体字。   |
| `<small>`  | 定义小号字。   |
| `<strong>` | 定义加重语气。 |
| `<sub>`    | 定义下标字。   |
| `<sup>`    | 定义上标字。   |
| `<ins>`    | 定义插入字。   |
| `<del>`    | 定义删除字。   |

#### 字符实体

对无法直接显示的字符进行转义 比如若想在网页上显示“<”，就得写&lt。

#### 特殊符号

如果我想打α，可以使用&Alpha

code:

<!--标题标签-->
		<h1>一级标题</h1>
		<h2>二级标题</h2>
		<h3>三级标题</h3>
		<h4>四级标题</h4>
		<h5>五级标题</h5>
		<h6>六级标题</h6><hr />

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>03 标题标签 格式化标签 字符实体和特殊符号</title>
	</head>
	<body>
		<!--标题标签-->
		<h1>一级标题</h1>
		<h2>二级标题</h2>
		<h3>三级标题</h3>
		<h4>四级标题</h4>
		<h5>五级标题</h5>
		<h6>六级标题</h6><hr />

		<p>美利坚合众国，简称“美国”，是由华盛顿哥伦比亚特区、50
			个州和关岛等众多海外领土组成的联邦共和立宪制国家。其
			主体部分位于北美洲中部，美国中央情报局《世界概况》19
			89年至1996年初始版美国总面积是937.3万平方公里，人口
			3.3亿   ，通用英语，是一个移民国家。 </p>
		<p>美国原为印第安人的聚居地，15世纪末，西班牙、荷兰、法国<br/>
			和英国等相继移民至此。 18世纪前，英国在美国大西洋沿岸<br/>
			建立了13个英属北美殖民地。1775年，爆发了美国人民反抗<br/>
			大英帝国殖民统治的独立战争。1776年7月4日，在费城召开<br/>
			了第二次大陆会议，由乔治·华盛顿任大陆军总司令，发表<br/>
			《独立宣言》，宣布美利坚合众国正式成立。 1783年独立<br/>
			战争结束，英国承认13个殖民地独立。1787年通过美国宪<br/>
			法，成立联邦制国家。</p><hr />
	
		<!--格式化标签-->
		<b>我粗了</b>                          <br />
		<big>我大了</big>                      <br />
		<em>我着重了</em>                      <br />
		<i>我斜体了</i>                        <br />
		<small>我小了</small>                  <br />
		<strong>我加重了</strong>              <br />
		<sub>我是下标字</sub>                  <br />
		<sup>我是上标字</sup>                  <br />
		<ins>我是插入字</ins>                  <br />
		<del>我被删了</del>                    <br />
		<b><big><i>我是样式嵌套</i></big></b>  <br /><hr />
		
		<!--字符实体-->
		html的根标签是&lt;html&gt; <br /><hr />
		
		<!--特殊符号-->
		特殊符号，比如&alpha;<br /><hr />
	</body>
</html>

```

--------------------------

### 4.3 超链接和多媒体标签

#### 超链接标签：

a标签，可以给文字，图片，音乐，其他标签添加超链接功能。

| 属性   | 作用                                                         |
| ------ | ------------------------------------------------------------ |
| href   | 设置链接地址<br />* 超链接锚点设置：通过`<a name = '锚点名'>内容</a>`设置锚点，使用`<a href = '#锚点名'>内容</a>`跳转 |
| target | 设置连接打开方式：<br />\_blank表示新建标签页，\_self是在当前标签页打开 |

#### **多媒体标签**

##### **img图片标签**

| 属性  | 作用                     |
| ----- | ------------------------ |
| src   | 图片路径                 |
| title | 鼠标悬停文字             |
| alt   | 图片加载失败时提示的文字 |

图片标签可以作为超链接

##### **audio音频标签**

可以的写法：在audio标签下使用source添加音频

| 属性     | 作用     |
| -------- | -------- |
| src      | 音频路径 |
| controls | 添加控件 |
| loop     | 循环播放 |
| autoplay | 自动播放 |

##### **video视频标签**

可以的写法：在video标签下使用source添加音频

| 属性     | 作用     |
| -------- | -------- |
| src      | 视频路径 |
| controls | 添加控件 |
| loop     | 循环播放 |
| autoplay | 自动播放 |

code:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>04 超链接标签和多媒体标签</title>
	</head>
	<body>
		<!-- 超链接 -->
		<a href="https://www.baidu.com">前往百度</a> <br />
		<a href="02 head标签.html">前往02</a> <br />
	
		<!--超链接的锚点设置-->
		<a name="top">顶部/a>
		<a href="#middle">跳转至中部</a>
		
		<br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
		
		<a name="middle">中部</a>
		<a href="#bottom">跳转至底部</a>
		
		<br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
        <br /><br /><br /><br /><br />
            
		<a name="bottom">底部</a>
		<a href="#top">跳转至顶部</a><hr />
		
		<!--多媒体标签-->
		<!--图片-->
		<!--本地图片              图片做超链接-->
		<a href="https://baike.baidu.com/item/羊驼" target="_blank">
			<img src="img/alpaca.png" width="400px" height="300px" title="These're alpacas~'" alt="cute alpacas"/><br />	
		</a>
		<!--网络图片-->
		<img src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20180621%2F7a04b5104ab1474d8269376abeb7d788.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1614684290&t=76d661a3dbf5251443bdeaeb039aa5ed" width="400px" height="300px" /><br />
	
		<!--音乐-->
		<audio controls>
			<source src="audio/music1.mp3" loop="loop"></source>
		</audio><br />
		
		<!--视频-->
		<video controls loop autoplay width="30%"> 
			<source src="video/16-9春季新星.mp4"></source>
		</video>
	</body>
</html>

```

-------------

### 4.4 列表标签

#### 有序列表

有序列表：order list → `<ol></ol> `

列表项：list item→ `<li></li>`

使用type属性设置序号

#### 无序列表

无序列表：unorder list →`<ul></ul>`

列表项：list item→ `<li></li>`

使用type属性设置每一项前符号

**列表可以嵌套**

#### 定义列表

定义列表：definition  list →`<dl></dl>`

列表项：`<dt></dt>`一般用于图片，`<dd></dd>`一般用于文字

使用type属性设置每一项前符号

code：

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>05 列表标签</title>
	</head>
	<body>
		<!--有序列表-->
		<ol type="I">
			<li>有序列表第一项</li>
			<li>有序列表第二项</li>
			<li>有序列表第三项</li>
		    <li>有序列表第四项</li>
			<li>有序列表第五项</li>
		</ol>
		<!--无序列表-->
		<ul type="square">
			<li>无序列表第一项</li>
			<li>无序列表第二项</li>
			<li>无序列表第三项</li>
		    <li>无序列表第四项</li>
			<li>无序列表第五项</li>
		</ul>
		<!--列表嵌套-->
		<ul type="circle">
			<li>英文字母
				<ol>
					<li>a</li>
					<li>b</li>
					<li>c</li>
					<li>d</li>
					<li>e</li>
				</ol>
			</li>
			<li>日文假名
				<ol>
					<li>あ</li>
					<li>い</li>
					<li>う</li>
					<li>え</li>
					<li>お</li>
				</ol>
			</li>
		</ul>
		<!--定义列表-->
		<dl style="border: 1px solid darkcyan ; width: 400px;"><!--css叠加样式-->
			<dt><!--放图片-->
				<img src="img/alpaca.png" width="400px" height="300px"/>
			</dt>
			<dd><!--放文字-->
				<font color="green">可爱的<small>小</small>羊驼能有什么坏心眼呢</font>
				<hr size="2" width="300px">
			</dd>
			<dt><!--放图片-->
				<img src="img/alpaca1.png" width="400px" height="300px"/>
			</dt>
			<dd><!--放文字-->
				<font color="green">可爱的<small>小</small>羊驼能有什么坏心眼呢（梅开二度</font>
				<hr size="2" width="300px">
			</dd>
		</dl>
	</body>
</html>
```

-------------

### 4.5表格标签

#### 表格标签：table

行：tr，列：td（也可使用th——自带加粗居中效果的td)

表头：thead，表体：tbody，表尾：tfoot

跨行和跨列：使用rowspan和colspan

表格可以嵌套

code：

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>06 表格标签</title>
	</head>
	<body>
		<!--表格-->
		<table   width="500px" cellspacing="0.05px" align="center" border="2px">
			<thead bgcolor="lightyellow">
				<tr><!--行-->
					<th>name</th><!--列-->
					<th>age</th>
					<th>class</th>
					<th>score</th>
				</tr>
			</thead>
			<tbody bgcolor="lightblue">
				<tr>
					<td>A</td>
					<td>11.4514</td>
					<td>Class 1</td>
					<td>100</td>
				</tr>
				<tr>
					<td>B</td>
					<td>19.1919810</td>
					<td>Class 10</td>
					<td>100</td>
				</tr>
			</tbody>
			<tfoot bgcolor="aquamarine">
				<tr>
					<td>总人数</td>
					<td>2</td>
					<td>总分数</td>
					<td>200</td>
				</tr>
			</tfoot>
		</table>
		<br /><hr /><br />
			
		<!--表格的跨行和跨列-->
		<table   width="500px" cellspacing="0.05px" align="center" border="2px">
		<thead>
			<tr>
				<th colspan="3">学生成绩单</th>
			</tr>
			<tr>
				<td>姓名</td>
				<td>科目</td>
				<td>分数</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td rowspan="3">张三</td>
				<td>数学</td>
				<td>90</td>
			</tr>
			<tr>
				<td>语文</td>
				<td>95</td>
			</tr>
			<tr>
				<td>英语</td>
				<td>120</td>
			</tr>
		</tbody>
		</table>
		<br /><hr  /><br />
		
		<!--表格嵌套-->
		<table   width="500px" cellspacing="0.05px" align="center" border="2px">
			<thead>
				<tr>
					<th colspan="3">学生成绩单</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>姓名</td>
					<td>科目</td>
					<td>分数</td>
				</tr>
				<tr>
					<td rowspan="3">李四</td>
					<td colspan="2" rowspan="3" >
                        <table border="1px" cellspacing="0px" width="100%">
                            <tr>
                                <td>数学</td>
                                <td>90</td>
                            </tr>
                            <tr>
                                <td>语文</td>
                                <td>105</td>
                            </tr>
                            <tr>
                                <td>英语</td>
                                <td>120</td>
                            </tr>
                        </table>	
					</td>
				</tr>
            </tbody>
		</table>
	</body>
</html>

```

--------------------

### 4.6 输入标签和表单标签

#### 输入标签：input

通过type属性选择输入类型

**type= “text”：文字输入**

**type="password"：密码输入**

**type=“radio”：单选**

若要让多个单选框互斥，需要定义值相同的name属性，可以通过checked属性设置某一选项默认选中

**type="checkbox"：复选**

**type="file"：文字**

**\*  textarea标签输入多行文本**

\*  **select标签下拉框**

通过option标签添加选项，selected标签设定默认选中，multiple可以设置全部显示

#### **表单标签：**form

form标签在网页上没有任何显示效果，起到将页面上的数据上传到后台的作用，form包裹的信息就是可以上传的信息。使用：

1. 使用form标签报过数据提交范围
2. 通过action属性确定数据要提交的地址
3. 通过method属性确定提交的方式
   get——数据通过地址栏传递 地址栏有长度限制 传递的数据量有限 只能传递文本 数据相对不安全
   post——数据不通过地址栏传递 单独打成数据包（大小认为没有限制）传输数据量大 数据相对安全
4. 准备一个提交按钮（不能是button，应该用submit,必须在表单内，提交当前所在表单）
5. 需要提交数据的输入框添加name属性（和value属性）
   name属性是给数据起名字的，为了让后台区分不同的数据的含义

快速清除功能：`<input type="reset">`

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>07 输入标签和表单标签</title>
	</head>
	<body>
		<form  action="https:www.baidu.com" method="get">
			<table>
				<tr>
					<td>账号</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="password" />  </td>
				</tr>
				<tr>
					<td>性别</td>
					<td>
						<input type="radio" name="gender" value = "male" checked />男
						<input type="radio" name="gender" value = "female"/>女
					</td>
				</tr>
				<tr>
					<td>爱好</td>
					<td>
						<input type="checkbox" value="singing"/>唱 
						<input type="checkbox" value="dancing"/>跳
						<input type="checkbox" value="raping"/>rap 
					  	<input type="checkbox" value="playingBasketball"/>篮球       
					</td>
				</tr>
				<tr>
					<td>照片</td>
					<td><input type="file" name=""/>  </td>
				</tr>
				<tr>
					<td>个人简介</td>
					<td>
						<textarea style="width: 200px; 
									height :120px;
									border: 2px 
									solid darkcyan;"
									name="introduction"></textarea>	
					</td>
				</tr>
				<tr>
					<td>地区</td>
					<td>
						<select name="hometown">
				        	<option value="Heilongjiang">黑龙江</option>
				        	<option value="Jilin">吉林</option>
				        	<option value="Liaoning">辽宁</option>
				        	<option selected>-请选择你的地区-</option>
		       			</select>
					</td>
				</tr>
			</table><br /><hr /><br />
		<input type="submit" value="提 交" />
		<input type="reset" value="清 空"/>
		</form>
	</body >
</html>
```

----------------

### 4.7 框架标签

#### **iframe标签：可以在当前网页引入其他网页，使用src属性设置路径**

iframe与超链接：

1. 给iframe定义name属性
2. 让超链接标签的target属性指向iframe的name

#### **frameset标签：划分网页区域**

注意！使用frameset时不可以存在body标签

frameset标签允许嵌套

code（multifile):

09-1:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<img src="img/top.png" />
	</body>
</html>

```

09-2:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<img src="img/bottom.png"  />
	</body>
</html>

```

09-3:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<p>美利坚合众国，简称“美国”，是由华盛顿哥伦比亚特区、50
		个州和关岛等众多海外领土组成的联邦共和立宪制国家。其
		主体部分位于北美洲中部，美国中央情报局《世界概况》19
		89年至1996年初始版美国总面积是937.3万平方公里，人口
		3.3亿   ，通用英语，是一个移民国家。 </p>
	</body>
</html>

```

09-4:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body bgcolor="aqua">
	</body>
</html>

```

09-5:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body bgcolor="aquamarine">
	</body>
</html>

```

main:

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>09 frameset标签</title>
	</head>

	<frameset rows="200px,*,250px" border="0px">
		<frame src="09-1 top.html" />
		<frameset cols="100px,*,100px">
			<frame src="09-4 left.html" />
			<frame src="09-3 main.html" />
			<frame src="09-5 right.html" />
		</frameset>
		<frame src="09-2 bottom.html" />
	</frameset>
</html>

```

### 4.8 块标签和行内标签

#### **块标签**:div

页面上独占一行的标签

一般用于做网页布局

#### **行内标签**:span

在页面上不会独占一行的标签

一般用于在网页上划定一个范围，结合css样式，帮助我们确定某些效果的作用范围。

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>10 span和div</title>
	</head>
	<body>
		<p>
			<span style="color: lightcoral;">美利坚合众国，简称“美国”，是由华盛顿哥伦比亚特区、50</span>
			<span style="color: coral;">个州和关岛等众多海外领土组成的联邦共和立宪制国家。其</span>
			<span style="color: lightcyan;">主体部分位于北美洲中部，美国中央情报局《世界概况》19</span>
			<span style="color: cyan;">9年至1996年初始版美国总面积是937.3万平方公里，人口</span>
			<span style="color: darkcyan;">3.3亿   ，通用英语，是一个移民国家。</span>
		</p>
		<div style="border:1px solid red; width: 200px; height: 200px;">
			哦！我的上帝
		</div>
		awwwwwwwwwww 
	</body>
</html>
```

--------

