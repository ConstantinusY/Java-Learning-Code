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



### 2.5 补充

+ List针对Collection增加了一些关于索引位置操作的方法 get(i) add(i,elem),remove(i),set(i,elem) 
+ List的遍历有三种方式：for循环、for-each循环、Iterator迭代器



## 3 集合——set

### 3.1 Set集合类型概述

特点：**无序  唯一（不重复）**

Set集合：

+ **Set**
普通Set
+ **HashSet** 
	采用Hashtable哈希表存储结构
	优点：添加速度快  查询速度快 删除速度快
	缺点：无序
+ **LinkedHashSet** 
	采用哈希表存储结构，同时使用链表维护次序
	有序（添加顺序）
+ **TreeSet** 
	采用二叉树（红黑树）的存储结构
	优点：有序  查询速度比List快（按照内容查询）
	缺点：查询速度没有HashSet快

### 3.2 补充

+ Set是无序的，不可能提供关于索引位置操作的方法，set针对Collection没有增加任何方法
+  Set的遍历有两种方式： for-each循环、Iterator迭代器

### 3.3 Set存储自定义数据类型

Q.HashSet、LinkedHashSet :为什么String有重复，会保持唯一；为什么Student有重复，不会保持唯一。

A.HashSet、LinkedHashSet 需要Student实现hashCode()和equals()

Q.：TreeSet:为什么String可以添加，而Student就不让添加到TreeSet中呢？ 而是抛出异常：

java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable

A：TreeSet 需要Student实现Comparable接口并指定比较的规则

code:

```java
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class code08 {
    public static class Student implements Comparable<Student>{
        private int number;
        private String name;
        private int age;
        private double score;

        public Student(int number, String name, int age, double score) {
            this.number = number;
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public int compareTo(Student o) { //返回负数：小于，返回0：等于，返回正数：大于
            return -(this.number - o.number);//通过学号比较
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;

            Student student = (Student) o;

            if (number != student.number) return false;
            if (age != student.age) return false;
            if (Double.compare(student.score, score) != 0) return false;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = number;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            temp = Double.doubleToLongBits(score);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String[] args) {
        //创建集合set对象
        Set<Student> set = new LinkedHashSet<>();
        Set<Student> set2 = new TreeSet<>();

        //添加多个学生
        set.add(new Student(1, "A", 23, 90));
        set.add(new Student(2, "B", 23, 98));
        set.add(new Student(3, "C", 22, 87));
        set.add(new Student(1, "A", 23, 90));
        set2.addAll(set);
        //输出学生
        System.out.println(set.size());
        System.out.print("[");
        for(Student stu:set){
            System.out.print(stu.toString()+", ");
        }
        System.out.println(set2);
    }
}

```

### 3.4 外部比较器Comparator

内部比较器Comparable只有一个，如果希望指定多种比较的规则，可以定义多个外部比较器，定义额外的类实现Comparator接口

code:

```java
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class code09 {
    //分数顺序比较器
    public static class StudentScoreComparator implements Comparator<code08.Student>{
        @Override
        public int compare(code08.Student o1, code08.Student o2) {
            if(o1.getScore()>o2.getScore()){
                return 1;
            }else if(o1.getScore()<o2.getScore()){
                return -1;
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Set<code08.Student> set = new TreeSet<>(new Comparator<code08.Student>(){
            @Override    //分数逆序比较器
            public int compare(code08.Student o1, code08.Student o2){
                if(o1.getScore()>o2.getScore()){
                    return -1;
                }else if(o1.getScore()<o2.getScore()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        Set<code08.Student> set2 = new TreeSet<>(new StudentScoreComparator());
        set.add(new code08.Student(1, "A", 23, 90));
        set.add(new code08.Student(2, "B", 23, 98));
        set.add(new code08.Student(3, "C", 22, 87));
        set.add(new code08.Student(1, "A", 23, 90));
        set2.addAll(set);

        System.out.println(set);
        System.out.println(set2);

    }
```



## 4 哈希表

### 4.1 引入哈希表

**哈希表来实现按照内容查找，同时不进行比较，而是通过计算得到地址，实现类似数组按照索引查询的高效率【$O(1)$】**

其他查找方法共同特点：通过将关键字值与给定值比较，来确定位置。效率取决比较次数。 

理想的方法是：不需要比较，根据给定值能直接定位记录的存储位置。 

这样，需要在记录的存储位置与该记录的关键字之间建立一种确定的对应关系，使每个记录的关键字与一个存储位置相对应。

### 4.2 哈希表结构特点

![image-20210411123404925](https://i.loli.net/2021/04/11/J4F9LhwcOom5j2e.png)

  hashtable（散列表 ）

  特点：快速度快

  最流行、最容易理解的结构是顺序表+链表 ，主结构：顺序表 每个顺序表的节点再单独引出一个链表 

### 4.3 哈希表添加数据的原理

1. **计算哈希码**(调用hashCode(),结果是一个int值，整数的哈希码取自身即可) 

2. **计算在哈希表中的存储位置 $y=k(x)=x\mod11$**

 x:哈希码  k(x):函数    y：在哈希表中的存储位置 

3. **存入哈希表** 

	+ 情况1：一次添加成功 
	+ 情况2：多次添加成功（出现了冲突，调用equals()和对应链表的元素进行比较，比较到最后，结果都是false，创建新节点，存储数据，并加入链表末尾） 
	+ 情况3：不添加（出现了冲突，调用equals()和对应链表的元素进行比较， 经过一次或者多次比较后，结果是true，表明重复，不添加） 

结论1：**哈希表添加数据快（3步即可，不考虑冲突**） 

结论2：**唯一、无序** 

### 4.4 哈希表查询数据的原理

和添加数据的过程是相同的 

+ 情况1：一次找到
+ 情况2：多次找到
+ 情况3：找不到

### 4.5 `hashCode()`和`equals()`的作用

hashCode(): **计算哈希码**，是一个整数，根据哈希码可以计算出数据在哈希表中的存储位置 

equals()：添加时**出现了冲突，需要通过equals进行比较**，判断是否相同；查询时也需要使用equals进行比较，判断是否相同  

### 4.6 装填因子

**装填因子：哈希表的长度和表中的记录数的比例**

如果哈希表的空间远远大于最后实际存储的记录个数，则造成了很大的空间浪费， 如果选取小了的话，则容易造成冲突。 在实际情况中，一般需要根据最终记录存储个数和关键字的分布特点来确定哈希表的大小。还有一种情况时可能事先不知道最终需要存储的记录个数，则需要动态维护哈希表的容量，此时可能需要重新计算哈希地址
$$
装填因子=表中的记录数\div哈希表的长度
$$
装填因子越小，表明表中有越多空单元，则添加发生冲突的可能性越小；而装填因子越大，则发生冲突的可能性就越大，在查找时所耗费的时间就越多。 有相关文献证明当装填因子在0.5左右时候，哈希表性能能够达到最优。 

**因此，一般情况下，装填因子取经验值0.5。** 

### 4.7 如何减少冲突

+ 维持合适的装填因子
+ 选择合适的哈希函数（ 直接定址法   平方取中法  折叠法  **除留取余法（y = x%11）**）
+ 使用其他处理冲突方法（ 链地址法 开放地址法  再散列法  建立一个公共溢出区 ）



## 5 集合——Map

### 5.1 Map集合类型概述

**特点：存储键值对映射关系，根据key可以找到value**

#### HashMap

采用哈希表存储结构

优点：速度快

缺点：键无序

#### LinkedHashMap

采用哈希表存储结构同时使用链表维护次序

Key有序（顺序为添加次序）

#### TreeMap

采用红黑树存储结构

优点：Key有序 按内容查询速度比List快

缺点：速度没有HashSet快



### 5.2 方法摘要
|返回值|方法|说明|
|------|-------------|------------------------------------------------------|
|void| clear() |从此映射中移除所有映射关系（可选操作）。 |
|boolean |containsKey(Object key) |如果此映射包含指定键的映射关系，则返回 true。 |
|boolean |containsValue(Object value) |如果此映射将一个或多个键映射到指定值，则返回 true。 |
|Set<Map.Entry<K,V>>| entrySet() |返回此映射中包含的映射关系的 Set 视图。 |
|boolean |equals(Object o) |比较指定的对象与此映射是否相等。 |
|V| get(Object key) |返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。 |
|int| hashCode() |返回此映射的哈希码值。 |
|boolean| isEmpty() |如果此映射未包含键-值映射关系，则返回 true。 |
|Set\<K>| keySet() |返回此映射中包含的键的 Set 视图。 |
|V |put(K key, V value) |将指定的值与此映射中的指定键关联（可选操作）。 |
|void| putAll(Map<? extends K,? extends V> m) |从指定映射中将所有映射关系复制到此映射中（可选操作）。 |
|V |remove(Object key) |如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。 |
|int |size() |返回此映射中的键-值映射关系数。 |
|Collection\<V> |values() |返回此映射中包含的值的 Collection 视图。 |

### 5.3 Map的简单使用

使用各种Map存储国家简称——名称映射

```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class code10 {
    public static void main(String[] args) {
        Map<String,String>map = new LinkedHashMap<>();
        map.put("CN","中国");
        map.put("JP","日本");
        map.put("US","The United States");
        map.put("US","America");//会覆盖掉上面的 The United States
        map.put("UK","England");
        map.put("EN","England");//不会覆盖掉上面的England

        Map<String,String>map2 = new HashMap<>();
        map2.putAll(map);

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("CN"));
        System.out.println(map.containsKey("中国"));
        System.out.println(map.get("US"));
        System.out.println(map.isEmpty());
        System.out.println(map.size()+"\n");

        System.out.println(map2);
        map2.remove("US");
        System.out.println(map2);
        map2.clear();
        System.out.println(map2.isEmpty());
    }
}
```

### 5.4 Map的遍历

思路1：先得到所有的key（Set），然后根据key找到value

思路2：先得到所有的key-value组成的Set，然后输出每个key-value

code:

```java
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class code11 {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("CN","中国");
        map.put("JP","日本");
        map.put("US","The United States");
        map.put("UK","England");

        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key+"-->"+map.get(key));
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
```

### 5.5Map存储自定义数据类型

使用各种Map存储学号-学生映射

code:

```java
import java.util.HashMap;
import java.util.Map;

public class code12 {
    public static void main(String[] args) {
        Map<Integer,code08.Student> map = new HashMap<>();

        code08.Student stu  = new code08.Student(1, "A", 23, 90);
        code08.Student stu2 = new code08.Student(2, "B", 23, 98);
        code08.Student stu3 = new code08.Student(3, "C", 22, 87);
        code08.Student stu4 = new code08.Student(1, "A", 23, 90);
        map.put(stu.getNumber(),stu);
        map.put(stu2.getNumber(),stu2);
        map.put(stu3.getNumber(),stu3);
        map.put(stu4.getNumber(),stu4);

        System.out.println(map.get(2).toString());
    }
}
```





## 6 理解Map和Set的源码

### 6.1 HashMap源码

JDK1.7及其之前，HashMap底层就是一个table数组+链表实现的哈希表存储结构 

链表的每个节点就是一个Entry，其中包括：键key、值value、键的哈希码hash、执行下一个节点的引用next四部分

#### 主要成员变量及其含义

```java
static class Entry<K, V> implements Map.Entry<K, V> {
    final K key; //key
    V value;//value
    Entry<K, V> next; //指向下一个节点的指针
    int hash;//哈希码
}
```

```java
public class HashMap<K, V> implements Map<K, V> {
//哈希表主数组的默认长度
    static final int DEFAULT_INITIAL_CAPACITY = 16; 
//默认的装填因子
    static final float DEFAULT_LOAD_FACTOR = 0.75f; 
//主数组的引用！！！！
    transient Entry<K, V>[] table; 
    int threshold;//界限值  阈值
    final float loadFactor;//装填因子
    public HashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }
    public HashMap(int initialCapacity, float loadFactor) {
        this.loadFactor = loadFactor;//0.75
        threshold = (int) Math.min(capacity * loadFactor, 
MAXIMUM_CAPACITY + 1);//16*0.75=12
        table = new Entry[capacity];
      ....
    }
}
```



#### 调用put方法添加键值对

哈希表三步添加数据原理的具体实现；是计算key的哈希码，和value无关。特别注意：

1. 第一步计算哈希码时，不仅调用了key的hashCode()，还进行了更复杂处理，目的是尽量保证不同的key尽量得到不同的哈希码

2. 第二步根据哈希码计算存储位置时，使用了位运算提高效率

3. 第三步添加Entry时添加到链表的第一个位置，而不是链表末尾

4. 第三步添加Entry是发现了相同的key已经存在，就使用新的value替代旧的value，并且返回旧的value

```java
public class HashMap {
    public V put(K key, V value) {
       //如果key是null，特殊处理
        if (key == null)
            return putForNullKey(value);
        //1.计算key的哈希码hash 
        int hash = hash(key);
        //2.将哈希码代入函数，计算出存储位置  y= x%16；
        int i = indexFor(hash, table.length);
        //如果已经存在链表，判断是否存在该key，需要用到equals()
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            //如找到了,使用新value覆盖旧的value，返回旧value
    if (e.hash == hash && ((k = e.key) == key || key.equals(k))) { 
                V oldValue = e.value;// the United States
                e.value = value;//America
                e.recordAccess(this);
                return oldValue;
            }
        }
        //添加一个结点
        addEntry(hash, key, value, i);
        return null;
    }
final int hash(Object k) {
    int h = 0;
    h ^= k.hashCode();
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}
static int indexFor(int h, int length) {
//作用就相当于y = x%16,采用了位运算，效率更高
    return h & (length-1);
 }
}
```



#### 调用get方法根据key获取value

哈希表三步查询数据原理的具体实现

其实是根据key找Entry，再从Entry中获取value即可

```java
public V get(Object key) {
    //根据key找到Entry（Entry中有key和value）
    Entry<K,V> entry = getEntry(key);
    //如果entry== null,返回null，否则返回value
    return null == entry ? null : entry.getValue();
}
```



#### 扩容

添加元素时如达到了阈值，需扩容，每次扩容为原来主数组容量的2倍

```java
void addEntry(int hash, K key, V value, int bucketIndex) {
    //如果达到了门槛值，就扩容，容量为原来容量的2位 16---32
    if ((size >= threshold) && (null != table[bucketIndex])) {
        resize(2 * table.length);
        hash = (null != key) ? hash(key) : 0;
        bucketIndex = indexFor(hash, table.length);
    }
    //添加节点
    createEntry(hash, key, value, bucketIndex);
}
```

#### 在JDK1.8中的变化

当链表的存储的数据个数大于等于8的时候，不再采用链表存储，而采用了红黑树存储结构。

这么做主要是查询的时间复杂度上，链表为$O(n)$，而红黑树一直是$O(\log n)$。如果冲突多，并且超过8，采用红黑树来提高效率

![image-20210411132315416](https://i.loli.net/2021/04/11/Fc5gL2aTSrDxm1M.png)



### 6.2 TreeMap源码

基本特征：二叉树->二叉查找树->二叉平衡树->红黑树

每个节点的结构:

<img src="C:\Users\CoNStantinusY\AppData\Roaming\Typora\typora-user-images\image-20210411132413570.png" alt="image-20210411132413570"  />



#### 主要成员变量及其引用

```java
static final class Entry<K,V> implements Map.Entry<K,V> {
    K key;
    V value;
    Entry<K,V> left;
    Entry<K,V> right;
    Entry<K,V> parent;
    boolean color = BLACK;
}
```

```java
public class TreeMap<K, V> implements NavigableMap<K, V> {
    private final Comparator<? super K> comparator;//外部比较器
    private transient Entry<K, V> root = null; //红黑树根节点的引用
    private transient int size = 0;//红黑树中节点的个数
    public TreeMap() {
        comparator = null;//没有指定外部比较器
    }
    public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;//指定外部比较器
    }
}
```



#### 添加原理 

从根节点开始比较 

添加过程就是构造二叉平衡树的过程，会自动平衡 

平衡离不开比较：外部比较器优先，然后是内部比较器。如果两个比较器都没有，就抛出异常

```java
public V put(K key, V value) {
    Entry<K,V> t = root;
    //如果是添加第一个节点，就这么处理
    if (t == null) {
        //即使是添加第一个节点，也要使用比较器
        compare(key, key); // type (and possibly null) check
        //创建根节点
        root = new Entry<>(key, value, null);
        //此时只有一个节点
        size = 1;
        return null;
    }
    //如果是添加非第一个节点，就这么处理
    int cmp;
    Entry<K,V> parent; 
    Comparator<? super K> cpr = comparator;
    //如果外部比较器存在，就使用外部比较器
    if (cpr != null) {
        do {
            parent = t;
            cmp = cpr.compare(key, t.key);
            if (cmp < 0)
                t = t.left;//在左子树中查找
           else if (cmp > 0)                
                t = t.right; //在右子树查找
            else
               //找到了对应的key，使用新的value覆盖旧的value                 
                return t.setValue(value);
        } while (t != null);
    }
    else {
        //如果外部比较器没有，就使用内部比较器
       ....
    }
    //找到了要添加的位置，创建一个新的节点，加入到树中
    Entry<K,V> e = new Entry<>(key, value, parent);
    if (cmp < 0)  
        parent.left = e;
    else
        parent.right = e;       
    size++;
    return null;
}
```

#### 查询原理

与添加基本相同

```java
public V get(Object key) {
    //根据key（cn）找Entry（cn--China）
    Entry<K,V> p = getEntry(key);
    //如果Entry存在，返回value：China
    return (p==null ? null : p.value);
}

final Entry<K, V> getEntry(Object key) {
    //如果外部比较器存在，就使用外部比较器
    if (comparator != null)
        return getEntryUsingComparator(key);
    if (key == null)
        throw new NullPointerException();
    @SuppressWarnings("unchecked")
    //如果外部比较器不存在，就使用内部比较器
    Comparable<? super K> k = (Comparable<? super K>) key;
    Entry<K, V> p = root;
    while (p != null) {
        int cmp = k.compareTo(p.key);
        if (cmp < 0)
            p = p.left;
        else if (cmp > 0)
            p = p.right;
        else
            //如果找到了，就返回Entry
            return p;
    }
    //如果没有找到，就返回null
    return null;
}
```



### 6.3 HashSet源码

HashSet的底层使用的是HashMap，所以底层结构也是哈希表 

HashSet的元素到HashMap中做key，value统一是 new Object()

```java
public class HashSet<E> implements Set<E> {
    private transient HashMap<E, Object> map;
    private static final Object PRESENT = new Object();
    public HashSet() {
        map = new HashMap<>();
    }
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
    public int size() {
        return map.size();
    }
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}
```



### 6.4 TreeSet源码

TreeSet的底层使用的是TreeMap，所以底层结构也是红黑树 

TreeSet的元素e是作为TreeMap的key存在的，value统一为new Object()

```java
public class TreeSet<E> implements NavigableSet<E> {
//底层的TreeMap的引用
    private transient NavigableMap<E, Object> m; 
    private static final Object PRESENT = new Object();
    public TreeSet() {
//创建TreeSet对象就是创建一个TreeMap对象
        this(new TreeMap<E, Object>()); 
    }
TreeSet(NavigableMap<E, Object> m) {
        this.m = m;
    }
    public boolean add(E e) {
        return m.put(e, PRESENT) == null;
    }
public int size() {
        return m.size();
    }
}
```

