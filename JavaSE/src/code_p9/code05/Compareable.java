package code_p9.code05;

public interface Compareable {
    /**
     * 判断两个对象的大小关系
     * @param obj 另一个对象
     * @return 返回0，相等；返回正数，大于；返回负数，小于。
     */
    public int compareTo(Object obj);
}
