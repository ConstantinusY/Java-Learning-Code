package example03_ConYShop.dao;

import example03_ConYShop.entity.CartItem;

import java.util.LinkedHashMap;

public class CartItemDao implements CartItemDaoInterface{
    //购物车
    private LinkedHashMap<Integer,CartItem> shoppingCart = new LinkedHashMap<>();

    /**
     * 添加条目到购物车
     *
     * @param item 添加的条目
     */
    public void addCartItem(CartItem item) {
        shoppingCart.put(item.getId(),item);
    }

    /**
     * 获取所有购物车条目
     *
     * @return 所有购物车条目集合
     */
    public LinkedHashMap<Integer, CartItem> findCart() {
        return shoppingCart;
    }
}
