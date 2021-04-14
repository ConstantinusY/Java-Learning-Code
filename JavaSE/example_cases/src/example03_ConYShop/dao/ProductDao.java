package example03_ConYShop.dao;

import example03_ConYShop.entity.Product;

import java.util.*;

public class ProductDao implements ProductDaoInterface{

    private static Map<Integer, Product> productMap = new TreeMap<Integer, Product>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 == o2) return 0;
            else if (o1 > o2) return 1;
            else return -1;
        }
    });

    static {
        productMap.put(0001,new Product(0001,"product1",100,"黑色",10,2));
        productMap.put(0003,new Product(0003,"product3",300,"黑色",1000,1));
        productMap.put(0002,new Product(0002,"product2",200,"黑色",10,5));
    }

    /**
     * 添加商品
     *
     * @param product 要添加的商品
     */
    public void add(Product product) {
        productMap.put(product.getId(),product);
    }

    /**
     * 获取所有商品信息
     *
     * @return 所有商品存储的集合
     */
    public List<Product> findAll() {
        List<Product> res = new ArrayList<Product>();
        for (Map.Entry<Integer,Product> product : productMap.entrySet()){
            res.add(product.getValue());
        }
        return res;
    }

    /**
     * 获取指定编号的商品
     *
     * @return 查找到的商品
     */
    public Product findByID(int id) {
        return productMap.get(id);
    }

    /**
     * 返回所有商品编号
     * @return 商品编号集合
     */
    public Set<Integer> getProductMapKeySet(){
        return productMap.keySet();
    }
}
