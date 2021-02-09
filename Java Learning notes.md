# Java Learning notes  

### 一、互联网技术概念入门

##### （1）互联网软件的两种模式

* Client（Customer）/Server： **CS模式**，客户端/服务器模式
  需要下载客户端，且软件由客户端和服务端两部分组成。
  缺点：更新较麻烦——所有客户端都需要更新。
  优点：运算压力可以分摊给各个终端（服务器运算压力大大减少）
* Browser/Server： **BS模式**，浏览器/服务器模式
  不需要下载客户端，只需要有一个浏览器，软件全部部署在服务器端。
  缺点：运算压力基本在服务端 一般不会用来做大型游戏
  优点：更新较简——只要更新服务器即可

##### （2）互联网三大基石 ——  URL、HTTP协议、HTML

互联网依赖的三种基础技术。

* URL：统一资源定位符
* HTTP协议：数据解析的规范
* HTML：数据传递的载体





### 二、HTML入门

#### 1.什么是HTML？

**HTML**(**H**yper **T**ext **M**arkup **L**anguage)指超文本标记语言,是用来描述网页的一种语言

a) 超文本：比普通文本更牛逼的文本 不仅仅可以展示文字 可以展示各种媒体内容

b) 一般由前端工作人员来完成,后台研发人员不需要编写

c) 标记：(标签/元素/标记)

标记通常被称为 HTML 标签 (HTML tag)。

* HTML 标签是由尖括号包围的关键词，比如 `<html>`
* 封闭类型标记（也叫双标记），必须成对出现,如`<p></p>`
* 标签对中的第一个标签是开始标签，第二个标签是结束标签
* 开始和结束标签也被称为开放标签和闭合标签
*  非封闭类型标记，也叫作空标记，或者单标记，如`<br/>`

---------------------



#### 2.HTML基本结构

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



#### 3.HTML专业词汇和概念

**标签（tag）：**

* 分为单标签（如meta）和  双标签（如html head  body title）  
* 标记(签)是HTML语言的基本部分 
* 标签是分层次的；多数标记总是成对出现，包括开始标签和结束标签； 
* 根标签是html，包括两个子标签head和body 
* 标签不区分大小写。例如`<html>或<HTML>`都可以 

**属性和属性值（attribute）**

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

##### 文本（text）

* 标签的内容可以是子标签或者普通文本 

* 最内层标签的内容称为文本 

* 外层标签的内容也可以统称为文本 

```html
<!--文本处理标签-->
<font color="green"> 好家伙er </font>
```
如上例，好家伙er就是文本

**元素(element)**

* 开始标记+中间内容+结束标记 
* HTML文档包括两部分：头部部分和主体部分
* 一个完整的标签我们也称之为为网页上的一个元素

------------------



#### 4.HTML标签

#### 4.1 `<head></head>`标签：

Head标签用于定义文档的头部，它是所有头部元素的容器。`<head>` 中的元素可以引用脚本、指示浏览器在哪里找到样式表。文档的头部描述了文档的各种属性和信息，包括文档的标题、在 Web 中的位置以及和其他文档的关系等。绝大多数文档头部包含的数据都不会真正作为内容显示给读者。

下面这些标签可用在 head 部分：

```html
<title>、<meta>、<link>、<style>、 <script>。
```

应该把` <head> `标签放在文档的开始处，紧跟在`<html> `后面，并处于 `<body> `标签之前。

文档的头部经常会包含一些` <meta> `标签，用来告诉浏览器关于文档的附加信息。

***title标签***

可定义文档的标题。它显示在浏览器窗口的标题栏或状态栏上。title写和你网页相关的关键词有利于SEO优化

***meta标签***

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

#### 4.2 标题标签和段落标签

##### 标题标签

`<h1></h1>`~`<h6></h6>`：一级标签到六级标题。注意：h7,h8,h9等是无效的

##### 段落标签

`<br/>`：换行标签

`<p>`：段落标签 被段落标签包裹的文本就是独立的一个段落，段落内部不换行，段落和段落之间换行

##### 格式化标签

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

##### 字符实体

对无法直接显示的字符进行转义 比如若想在网页上显示“<”，就得写&lt。

##### 特殊符号

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

#### 4.3 超链接和多媒体标签

##### 超链接标签：

a标签，可以给文字，图片，音乐，其他标签添加超链接功能。

| 属性   | 作用                                                         |
| ------ | ------------------------------------------------------------ |
| href   | 设置链接地址<br />* 超链接锚点设置：通过`<a name = '锚点名'>内容</a>`设置锚点，使用`<a href = '#锚点名'>内容</a>`跳转 |
| target | 设置连接打开方式：<br />\_blank表示新建标签页，\_self是在当前标签页打开 |

##### **多媒体标签**

**img图片标签**

| 属性  | 作用         |
| ----- | ------------ |
| src   | 图片路径     |
| title | 鼠标悬停文字 |
|  alt |图片加载失败时提示的文字 |

图片标签可以作为超链接

**audio音频标签**

可以的写法：在audio标签下使用source添加音频

| 属性     | 作用     |
| -------- | -------- |
| src      | 音频路径 |
| controls | 添加控件 |
| loop     | 循环播放 |
| autoplay | 自动播放 |

**video视频标签**

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

#### 4.4 列表标签

##### 有序列表

有序列表：order list → `<ol></ol> `

列表项：list item→ `<li></li>`

使用type属性设置序号

##### 无序列表

无序列表：unorder list →`<ul></ul>`

列表项：list item→ `<li></li>`

使用type属性设置每一项前符号

**列表可以嵌套**

##### 定义列表

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

#### 4.5表格标签

表格标签：table

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

#### 4.6 输入标签和表单标签

##### 输入标签：input

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

##### **表单标签：**form

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

#### 4.7 框架标签

**iframe标签：可以在当前网页引入其他网页，使用src属性设置路径**

iframe与超链接：

1. 给iframe定义name属性
2. 让超链接标签的target属性指向iframe的name

**frameset标签：划分网页区域**

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

#### 4.8 块标签和行内标签

**块标签**:div

页面上独占一行的标签

一般用于做网页布局

**行内标签**:span

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



### 三、CSS入门

#### 1.什么是CSS？

CSS：层叠样式表(Cascading Style Sheets)可以静态地修饰网页，还可以配合各种脚本语言动态地对网页各元素进行格式化。 能够对网页中元素位置的排版进行像素级精确控制，支持几乎所有的字体字号样式，拥有对网页对象和模型样式编辑的能力。**人话：让网页更好康**

HTML用来搭建网页主体结构，是毛坯房；而CSS用来修饰网页，相当于精装修。

-------------------



#### 2.CSS的引入



* **行内式引入：**
  借助标签的style属性引入，style属性中的值语法为`样式名:样式值; 样式名:样式值; ......`
  例：

  ```html
  <span style="font-size: 20px; 
               color: darkslateblue; 
               background-color: lightcoral;">
      CSS!你值得拥有
  </span>
  ```
  
* **内嵌式**
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

* **链接式**

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



#### 3.CSS选择器

#### 3.1基本选择器

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



#### 3.2其他选择器

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



#### 3.3 伪类选择器

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



#### 4.网页的布局

网页要有格局，网页的布局就是网页内容的主体规划

要想完成网页的布局，需要三种基本技术

+ 盒子模型——标签和标签存在包含关系时位置的调整
+ 浮动——多个块标签处于同一行的位置处理问题
+ 定位——块标签在页面指定位置的处理问题

块标签→独立站用一行的标签，行内标签→不会独占一行的标签

一般布局时使用的是块标签div，它可以帮助我们将网页划分为多个小方块

div边线类型：dotted,dashed,solid,double,groove,ridge,inset,outset

--------------

#### 4.1盒子模型

标签和标签存在包含关系时位置的调整，好比两个一大一小的盒子大的装小的，小盒子在大盒子内部的位置调整

##### 内边距：

当前块标签内部的元素和当前块标签边缘的距离

内边距不会向内占用空间，而是会将块标签放大

写法1——padding: 内边距px;  同时设定上下左右四个内边距 

写法2——padding: 上下内边距px 左右px

写法3——padding：顶部内边距px 右内边距px 底部内边距px 左内边距px（顺时针）

写法4——padding-top/bottom/left/right 

##### 外边距：

当前块标签外部的元素和父级标签边缘的距离

写法1——margin: 外边距px;  同时设定上下左右四个外边距 

写法2——margin: 上下外边距px 左右px

写法3——margin：顶部外边距px 右外边距px 底部外边距px 左外边距px（顺时针）

写法4——margin-top/bottom/left/right 

##### 调整盒子位置：

可以选择调整外部盒子内边距或内部盒子外边距

##### 外边距设置居中：

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



##### 块标签和行内标签的转换：

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

##### 注意：

width：块标签**实际容量**宽度

height：块标签**实际容量**高度

盒子模型无论内边距还是外边距的调整都不会影响块标签内部容量

---------



#### 4.2浮动

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

#### 4.3定位

页面布局手段。

**绝对定位**

绝对的位置

当位置发生改变时，会释放原来的位置，其他标签可以占用原来的位置

使用absolute实现

**相对定位**

相对于原来的位置

当位置发生改变时，不会释放原来的位置，其他标签不可以占用原来的位置

使用relative实现

**相对浏览器窗口定位**

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



### *电脑整体环境建议

+ 电脑上尽量不放文件

+ 除系统组件外，软件尽量安装到其他盘（可以做分类——program_it，program_other
+ 新安装软件时给软件安排一个文件夹
+ 软件安装路径中尽量避免中文和空格
+ 灵活划分盘符
+ 使用一个文件来列出软件名方便快速重装，配置部署

----------------



### 四、JAVA概述

#### 1.Java历史

#### 1.1公司

最初由美国 SUN（Stanford University Network)公司发明，后被Oracle收购

#### 1.2Java为什么被发明

Green项目。应用环境：像电视盒这样的消费类电子产品。要求：语言本身中立，可以跨平台。

#### 1.3Java的发明人

**James Gosling** 

#### 1.4经历阶段

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

+ 2019年9月，JAVA 13

SUN公司已经被oracle公司收购，目前每半年更新一次java的版本。但是，企业中的主流仍然以7和8为主。

#### 2.Java特点

#### 2.1 Java体系结构

**JavaSE（Java  Standard  Edition）：标准版，定位在个人计算机上的应用**

这个版本是Java平台的核心，它提供了非常丰富的API来开发一般个人计算机上的应用程序，包括用户界面接口AWT及Swing，网络功能与国际化、图像处理能力以及输入输出支持等。在上世纪90年代末互联网上大放异彩的Applet也属于这个版本。Applet后来为Flash取代，Flash被HTML5取代。

**JavaEE（Java  Enterprise Edition）：企业版，定位在服务器端的应用**

JavaEE是JavaSE的扩展，增加了用于服务器开发的类库。如：JDBC是让程序员能直接在Java内使用的SQL的语法来访问数据库内的数据；Servlet能够延伸服务器的功能，通过请求-响应的模式来处理客户端的请求；JSP是一种可以将Java程序代码内嵌在网页内的技术；

**JavaME（Java  Micro  Edition）：微型版，定位在消费性电子产品的应用上**

JavaME是JavaSE的内伸，包含J2SE的一部分核心类，也有自己的扩展类,增加了适合微小装置的类库：javax.microedition.io.*等。该版本针对资源有限的电子消费产品的需求精简核心类库，并提供了模块化的架构让不同类型产品能够随时增加支持的能力。

#### 2.2Java特性和优势

**跨平台/可移植性**

这是Java的核心优势。Java在设计时就很注重移植和跨平台性。比如：Java的int永远都是32位。不像C++可能是16，32，可能是根据编译器厂商规定的变化。这样的话程序的移植就会非常麻烦。

 **安全性**

Java适合于网络/分布式环境，为了达到这个目标，在安全性方面投入了很大的精力，使Java可以很容易构建防病毒，防篡改的系统。

 **面向对象**

面向对象是一种程序设计技术，非常适合大型软件的设计和开发。由于C++为了照顾大量C语言使用者而兼容了C，使得自身仅仅成为了带类的C语言，多少影响了其面向对象的彻底性！Java则是完全的面向对象语言。

 **简单性**

Java就是C++语法的简化版。

 **高性能**

Java最初发展阶段，总是被人诟病“性能低”；客观上，高级语言运行效率总是低于低级语言的，这个无法避免。Java语言本身发展中通过虚拟机的优化提升了几十倍运行效率。比如，通过JIT(JUST IN TIME)即时编译技术提高运行效率。 将一些“热点”字节码编译成本地机器码，并将结果缓存起来，在需要的时候重新调用。这样的话，使Java程序的执行效率大大提高，某些代码甚至接待C++的效率。

因此，Java低性能的短腿，已经被完全解决了。业界发展上，我们也看到很多C++应用转到Java开发，很多C++程序员转型为Java程序员。

 **分布式**

Java是为Internet的分布式环境设计的，因为它能够处理TCP/IP协议。事实上，通过URL访问一个网络资源和访问本地文件是一样简单的。Java还支持远程方法调用(RMI,Remote Method Invocation)，使程序能够通过网络调用方法。

 **多线程**

多线程的使用可以带来更好的交互响应和实时行为。 Java多线程的简单性是Java成为主流服务器端开发语言的主要原因之一。

 **健壮性**

Java是一种健壮的语言，吸收了C/C++ 语言的优点，但去掉了其影响程序健壮性的部分（如：指针、内存的申请与释放等）。Java程序不可能造成计算机崩溃。即使Java程序也可能有错误。如果出现某种出乎意料之事，程序也不会崩溃，而是把该异常抛出，再通过异常处理机制加以处理。

#### 2.3Java核心机**制**

**垃圾回收机制**

垃圾收集的目的在除不再使用的对象，当对象建立的时候垃圾收集期，就开始监控对象的动态情况，垃圾收集主要是对内存的释放。创建对象的时候申请一个空间

1. 不再使用的内存空间应回收→垃圾收集；

2. Java消除了程序员回收无用内存空间的职责；提供一种系统级线程跟踪存储空间的分配情况。在JVM的空闲时，检查并释放可被释放的存储器空间。

3. 垃圾收集在Java程序运行过程中自动进行，程序员无法精确控制和干预；

4. GC的自动回收，提高了内存空间的利用效率，也提高了编程人员的效率，很大程度上减少了因为没有释放空间而导致的内存泄露。 

**跨平台机制**

JAVA的跨平台性能优越 同样的代码可以在不同的终端使用

互联网的发展 需要程序在多种不同的平台上 终端上运行 要求我们的程序在跨平台处理上有这非常方便形式和优秀的性能

JVM(Java Virtual Machine)就是一个虚拟的用于执行bytecode字节码的”虚拟计算机”。他也定义了指令集、寄存器集、结构栈、垃圾收集堆、内存区域。JVM负责将Java字节码解释运行，边解释边运行，这样，速度就会受到一定的影响。

不同的操作系统有不同的虚拟机。Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，随处运行”。 Java虚拟机是实现跨平台的核心机制。

### 五、JAVA SE初探

#### 1.第一个Java程序

##### 1.1 准备JDK

##### 1.2编写代码

1. 创建文件
2. 创建类
3. 定义主方法
4. 向主方法中添加代码
5. 编译(javac,java)和解释

##### 1.2配置环境变量

**Path**:

%JAVA_HOME%\bin

**JAVA_HOME**:

(JDK安装目录)

**classpath**:

(Java到哪里寻找.class)

eg.<big>**`. ; (path)`**</big>



#### 2.JAVA编程风格

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



#### 3.JAVA注释

为了方便程序的阅读，Java语言允许程序员在程序中写上一些说明性的文字，用来提高程序的可读性，这些文字性的说明就称为注释。

注释不会出现在字节码文件中，即Java编译器编译时会跳过注释语句。

在Java中根据注释的功能不同，主要分为单行注释、多行注释和文档注释。

**单行注释**

单行注释使用“//”开头，“//”后面的单行内容均为注释。

**多行注释**

多行注释以“/*”开头以“*/”结尾，在“/*”和“*/”之间的内容为注释，我们也可以使用多行注释作为行内注释。但是在使用时要注意，多行注释不能嵌套使用。

**文档注释**

文档注释以“/**”开头以“*/”结尾，注释中包含一些说明性的文字及一些JavaDoc标签（后期写项目时，可以生成项目的API）



#### 4. 标识符，关键字，字符集

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



#### 5.变量和常量(code_p1)

##### 5.1 什么是变量和常量

变量 可以变化的量 

常量 不会变化的量

+ 字面常量(其实就是具体的值) 

+ 符号常量(真理数字,类似于PI这样的数据)



##### 5.2变量的创建

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



##### 5.3变量的作用范围

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



##### 5.4常量拓展

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





#### 6 数据类型(code_p2)

##### 6.1 进制及其转换

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



##### 6.3 整数型

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



##### 6.4浮点型

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



##### 6.5科学计数法

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





##### 6.6布尔类型

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



##### 6.7字符型

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





##### 6.8 Java中的转义字符

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



##### 6.9数据类型的转换

从小到大，正常转换

byte→short→int→long→float→double

从大到小，必须强制转换，可能会损失数据

为了尽量避免数据损失，应该让大的变量的值尽量在小的变量的范围内。

-----------------



##### 6.10数据类型转换练习

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

#### 7 运算符(code_p3)

*在Java中，如果除法两端都是整数，那么结果仅保留整数部分。如果除法两端任意一端师傅点数，那么结果以浮点数保存。（double)



##### 7.1赋值运算符

**=**  

将右边的值赋值给左边的变量 一定要等右边所有的代码运算完毕再进行赋值

---------------



##### 7.2算术运算符

**\+ - * / %**

1. 在算数运算符使用的过程中,注意运算结果的数据类型 可能和参与运算的变量类型不一致

2. 在进行除法运算, 整数除以整数,不会保留小数位,除非其中一方是浮点数

3. 取模运算对于浮点数同样有效

-------



##### 7.3拓展算术运算符

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



##### 7.4练习

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



##### 7.5 关系运算符

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



##### 7.6 逻辑运算**符**

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



##### 7.7位运算符

**\>> << >>>  & | ^ ~** 

位运算符是在二进制上运算的符号

| 运算符 | 名字 | 说明 |
| ---- | ---- | ---- |
| <<   | 左移运算 | 左移n位就相当于  原值×2<sup>n</sup>，不会移动符号位，第一位舍去 |
| >>   | 右移运算 | 右移n位就相当于 原值×2<sup>-n</sup>，不会移动符号位，最后一位舍去 |
| >>>  | 不带号右移运算 | 直接将每一位右移，不考虑符号 |
| &    | 按位与运算 | 对比每一位，同为1则为1，一方为0则为0，后生成新数 |
| \|   | 按位或运算 | 对比每一位，同为0则为0，一方为1则为1，后生成新数 |
| ^    | 按位异或运算 | 相同为0，不同为1，后生成新数 |
| ~    | 按位取反运算 | 若n为正数，~n=-(n+1)，若n为负数，~n=\|n\|-1 |

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



##### 7.8 条件运算符

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



##### 7.9运算符优先级

算数运算符>条件运算符>关系运算符>逻辑运算符>赋值运算符

----------



#### 8.流程控制（code_p4)

##### 8.1 流程控制的分类

+ 顺序结构 从上到下一行一行执行
+ 分支结构 根据条件选择不同分支执行
+ 循环结构 需要反复执行的结构

-------



##### 8.2 分支结构-if

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



##### 8.3 从键盘录入信息

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



##### 8.4 分支语句-switch

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



##### 8.5 循环结构-while

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



##### 8.6 生成随机数

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



##### 8.7 循环的嵌套

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



##### 8.8 循环结构-do while

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



##### 8.9 循环结构-for

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



##### 8.10 循环控制关键字

**break continue return** 

+ break可以停止循环继续执行，但只能停止最内层的循环，如果想要停止外层循环，那么需要给外层做标记。
+ continue可以停止当前循环执行一次，循环从下一次继续执行
+ return可以停止当前的方法，回到主调方法。

---------



#### 9 数组(code_p5)

##### 9.1 什么是数组

数组（Array）是一种**引用数据类型**，可以解决大量数据的命名问题和大量数据存储和传递问题。

------------



##### 9.2 数组的创建

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



##### 9.3  数组的属性，特点，使用细节

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



##### 9.4 数组的遍历

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



##### 9.5 查找数组中的最大值，最小值及其索引

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



##### 9.6 查找数组中元素的索引

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



##### 9.7 数组的合并(向数组中追加元素)

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



##### 9.8 数组的缩容（删除数组中的元素）

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



##### 9.9 练习

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



##### 9.10 Arrays 工具类

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



##### 9.11 数组的复制

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



##### 9.12 二维数组

一个元素是数组的数组。

**二维数组的创建：**

+ 静态创建：**`数据类型 [][]  数组名={{},{},}{}....};`**
		               **`数据类型[][]  数组名=new 数据类型[][]{{},{},{}......};`**

+ 动态创建：**`数据类型 [][]  数组名=new 数据类型[外围数组长度][内部数组长度];`**

**二维数组的遍历：**

使用循环。

**二维数组应用：**

code:

​	从键盘录入学生人数 考试科目数 以及每个学生的每科分数

​	输出每个学生的最高分 最低分 总分 平均分

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





































































### \*IDEA的使用

#### 隐藏项目文件夹和.iml文件：

File-Settings-Editor-File Types-底端输入`.idea;*.iml;`

#### IDEA创建包：

包：受保护的资源目录，其实就是文件夹，只不过该种文件夹放在src中，一般专用于放代码和配置文件。

包的命名：必须是小写字母开头，其余规则略。

包可以帮助我们给项目划分模块，可以对不同代码文件进行分类存储，可以解决同名源代码文件冲突问题

