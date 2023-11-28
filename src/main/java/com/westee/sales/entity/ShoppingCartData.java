package com.westee.sales.entity;

import com.westee.sales.generate.Shop;

import java.util.List;

public class ShoppingCartData {
    private Shop shop;
    private List<ShoppingCartGoods> goods;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<ShoppingCartGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<ShoppingCartGoods> shoppingCartGoods) {
        this.goods = shoppingCartGoods;
    }
}
