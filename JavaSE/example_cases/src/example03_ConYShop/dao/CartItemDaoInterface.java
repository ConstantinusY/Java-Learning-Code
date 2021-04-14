package example03_ConYShop.dao;

import example03_ConYShop.entity.CartItem;

import java.util.LinkedHashMap;

public interface CartItemDaoInterface {
    /**
     * 添加条目到购物车
     * @param item 添加的条目
     */
    void addCartItem(CartItem item);

    /**
     * 获取所有购物车条目
     * @return 所有购物车条目集合
     */
    LinkedHashMap<Integer,CartItem> findCart();
}
