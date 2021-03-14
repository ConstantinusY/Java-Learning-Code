package code10;

public interface Comperator {
    /**
     * 此方法用于比较两个对象
     * @param obj1 第一个对象
     * @param obj2 第二个对象
     * @return 返回0，相等；返回整数，大于；返回负数，小于。
     */
    public int compare(Object obj1, Object obj2);
}
