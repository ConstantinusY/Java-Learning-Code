# 八、JavaSE集合

## 1 引入集合

### 1.1 集合的适用场合

举例：新闻列表、就业喜报、就业明星、邮件列表、购物车；当我们需要将一些相同结构的个体整合在一起时，就可以考虑使用集合了 。



### 1.2 集合？数组？

##### 集合和数组相似点

+ 都可以存储多个对象，对外作为一个整体存在

##### 数组的缺点

+ 长度必须在初始化时指定，且固定不变 
+ 数组采用连续存储空间，删除和添加效率低下
+ 数组无法直接保存映射关系
+ 数组缺乏封装，操作繁琐 



### 1.3 集合框架

Java集合框架提供了一套性能优良、使用方便的接口和类，它们位于java.util包中。存放在集合中的数据，被称为元素(element)

![image-20210329203011583](https://i.loli.net/2021/03/29/xeMp5GSY1VczKP6.png)

##### 集合架构

+ Collection 接口存储一组不唯一，无序的对象

+ List 接口存储一组不唯一，有序（索引顺序）的对象

+ Set 接口存储一组唯一，无序的对象

+ Map接口存储一组键值对象，提供key到value的映射

  + Key 唯一 无序   

  + value  不唯一 无序 



## 2 集合——List

### 2.1 List概述

List的特点：**有序  不唯一**

#### ArrayList 

在内存中分配连续的空间，实现了长度可变的数组

优点：遍历元素和随机访问元素的效率比较高

缺点：添加和删除需大量移动元素效率低，按照内容查询效率低

![img](https://i.loli.net/2021/03/29/aocEifbILsHgSv3.png) 



#### LinkedList 

采用双向链表存储方式。

缺点：遍历和随机访问元素效率低下

优点：插入、删除元素效率比较高（但是前提也是必须先低效率查询才可。如果插入删除发生在头尾可以减少查询次数）

![img](https://i.loli.net/2021/03/29/NCDEvhcjf3o6mze.jpg)



### 2.2 ArrayList

#### 方法摘要

|返回值   |方法|说明|
|--------|------------------------|---------------------------|
|boolean |add(E e)            |将指定的元素添加到此列表的尾部。 |
|void           |add(int index, E element) |将指定的元素插入此列表中的指定位置|
|boolean |addAll(Collection<? extends E> c) |按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。 |
| boolean |addAll(int index, Collection<? extends E> c) |从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。 |
|void |clear() |移除此列表中的所有元素。 |
|Object| clone() |返回此 ArrayList 实例的浅表副本。 |
| boolean |contains(Object o) |如果此列表中包含指定的元素，则返回 true。 |
| void| ensureCapacity(int minCapacity) |如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。 |
|E |get(int index) |返回此列表中指定位置上的元素。 |
| int| indexOf(Object o) |返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。 |
| boolean| isEmpty() |如果此列表中没有元素，则返回 true |
| int| lastIndexOf(Object o) |返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。 |
| E |remove(int index) |移除此列表中指定位置上的元素。 |
| boolean| remove(Object o) |移除此列表中首次出现的指定元素（如果存在）。 |
| protected | void removeRange(int fromIndex, int toIndex) |移除列表中索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素。 |
| E| set(int index, E element) |用指定的元素替代此列表中指定位置上的元素。 |
| int |size() |返回此列表中的元素数。 |
| Object[] |toArray() |按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。 |
|\<T> T[] | toArray(T[] a) |按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。 |
| void| trimToSize() |将此 ArrayList 实例的容量调整为列表的当前大小。 |

#### 初探ArrayList

code:

```java
import java.util.ArrayList;

public class code01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Integer(100));//手动装箱
        list.add(200);//自动装箱
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//输出集合

        list.add(2,99);//添加到指定位置，底层发生元素后移

        System.out.println(list);//输出集合

        ArrayList list2 = new ArrayList();
        list2.add(114514);
        list2.add(1919810);

        list.addAll(list2);//将另一个集合添加进来
        list.addAll(1,list2);//将另一个集合添加到指定位置

        System.out.println(list.size());//集合元素个数
        System.out.println(list);//输出集合
    }
}
```

#### 遍历ArrayList

+ for循环遍历
+ foreach循环遍历
+ 迭代器遍历

code:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class code02 {
    //for
    public static void printArrayList_for(ArrayList arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    //foreach
    public static void printArrayList_foreach(ArrayList arr){
        for (Object o:arr) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
    //Iterator
    public static void printArrayList_Iterator(ArrayList arr){
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        printArrayList_for(list);
        printArrayList_foreach(list);
        printArrayList_Iterator(list);
    }
}
```



#### 使用泛型保证集合操作的安全和简便

**泛型语法：`类名<数据类型> 标识符 = new 类名<数据类型【可省略】>(构造方法传参);`**

code：

```java
import java.util.ArrayList;

public class code03 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList</*Integer*/>();
        intList.add(1);
        intList.add(3);
        intList.add(1,2);
        //intList.add(new String("哦我的上帝这不就没法添加了"));
        code02.printArrayList_for(intList);
        code02.printArrayList_foreach(intList);
        code02.printArrayList_Iterator(intList);
    }
}
```



#### ArrayList的更多方法

```java
import java.util.ArrayList;
import java.util.Arrays;

public class code04 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("张三");

        System.out.println(names);

        System.out.println("names中"+(names.contains("赵六")?"":"不")+"包含“赵六”");
        System.out.println("“张三”在names中第一次出现是第"+ (names.indexOf("张三")+1)+"个");
        System.out.println("names"+(names.isEmpty()?"":"不")+"为空");
        System.out.println("“张三”在names中最后一次出现是第"+ (names.lastIndexOf("张三")+1)+"个");

        names.remove(1);
        names.remove("老八");
        System.out.println(names);

        System.out.println(Arrays.toString(names.toArray()));

    }
}
```



#### 初步理解ArrayList的源码

ArrayList底层就是一个长度可以动态增长的Object数组；

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable{
       private static final int DEFAULT_CAPACITY = 10;
       private static final Object[] EMPTY_ELEMENTDATA = {};
       private static final Object[]  DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
       transient Object[] elementData;
       private int size;
}
```

注意：接口是可以一个方法也不提供的，比如 RandomAccess, Cloneable, java.io.Serializable

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{}
```

JDK1.7中，使用无参数构造方法创建ArrayList对象时，默认底层数组长度是10。JDK1.8中，使用无参数构造方法创建ArrayList对象时，默认底层数组长度是0；第一次添加元素，容量不足就要进行扩容了。

```java
public ArrayList() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}
private static int calculateCapacity(Object[] elementData, int minCapacity) {
    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        return Math.max(DEFAULT_CAPACITY, minCapacity);
    }
    return minCapacity;
}
```

容量不足时进行扩容，默认扩容50%。如果扩容50%还不足容纳新增元素，就扩容为能容纳新增元素的最小数量

```java
private void grow(int minCapacity) {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity < 0)
        newCapacity = minCapacity;
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity); 
    elementData = Arrays.copyOf(elementData, newCapacity);
}
```

ArrayList中提供了一个内部类Itr，实现了Iterator接口，实现对集合元素的遍历

```java
public Iterator<E> iterator() {
    return new Itr();
}
private class Itr implements Iterator<E> {
}	
```



### 2.3 LinkedList

#### LinkedList与ArrayList的异同

同：

+ 运算结果没有变
+ 执行功能的代码没有变

异：

+ 底层的结构不同，ArrayList底层是数组，LinkedList底层是双向链表
+ 具体执行过程不同，如ArrayList添加元素需要大量后移元素，而LinkedList不需要大量移动元素，只需要修改节点指向。

依据场合选择ArrayList与LinkedList的使用。

+ 当需要大量的根据索引查询的操作，大量的遍历操作时，建议使用ArrayList
+ 当需要大量的的添加、删除操作，建议使用LinkedList



**注意**

定义ArrayList或LinkedList时，我们更喜欢形如

```java
List<Integer> list = new ArrayList<Integer>();
```

的写法，而较少使用形如`ArrayList<Integer> list = new ArrayList<Integer>();`的写法



#### 使用LinkedList

LinkedList的方法与ArrayList基本一致。

code:

```java
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class code05 {
    public static void printList_Iterator(List arr){
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,5);

        printList_Iterator(list);

    }
}
```



#### 初步理解LinkedList的源码

底层结构是一个双向链表。

```java
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable
{
   transient int size = 0;//节点的数量
   transient Node<E> first; //指向第一个节点
   transient Node<E> last; //指向最后一个节点
   public LinkedList() {}
}
```

有一个静态内部类Node，表示双向链表的节点。

```java
private static class Node<E> {
    E item;//存储节点的数据
    Node<E> next;//指向后一个节点
    Node<E> prev; //指向前一个节点
    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
```

LinkedList实现了Deque接口，所以除了可以作为线性表来使用外，还可以当做队列和栈来使用



### 2.4 栈和队列

```java
public  class Stack<E> extends Vector<E> 
```

Vector过时了，被ArrayList替代了，Stack也就过时了



所以我们使用Deque和Queue：

```java
public interface Queue<E> extends Collection<E>
public interface Deque<E> extends Queue<E>
```

**Deque和Queue的实现类**

1. ArrayDeque  顺序栈  数组
2. LinkedList  链栈  链表



**Deque和Queue的操作**

+ push：入栈
+ pop：出栈
+ peek：获取栈顶元素



code:

```java
import java.util.Deque;
import java.util.LinkedList;

public class code06 {
    public static void main(String[] args) {
        //摞盘子
        Deque<String> deque1 = new LinkedList<String>();
        deque1.push("盘子1");
        deque1.push("盘子2");
        deque1.push("盘子3");

        System.out.println(deque1.size());
        System.out.println(deque1.peek());//get 获取栈顶元素，不移除
        System.out.println(deque1.peek());//get 获取栈顶元素，不移除
        while(!deque1.isEmpty()){
            String elem = deque1.pop();
            System.out.println(elem);
        }
        System.out.println(deque1.size());
    }
}
```