package example03_ConYShop.dao;

import example03_ConYShop.entity.Product;

import java.util.List;

public interface ProductDaoInterface {
    /**
     * 添加商品
     * @param product 要添加的商品
     */
    void add(Product product);

    /**
     * 获取所有商品信息
     * @return 所有商品存储的集合
     */
    List<Product> findAll();

    /**
     * 获取指定编号的商品
     * @param id 查询的编号
     * @return 查找到的商品
     */
    Product findByID(int id);
}
