package com.xiaoguangbiao.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: FastFood
 * @Description: 快餐类(抽象构件角色)
 * @Author: xiaoguangbiao-github
 */
public abstract class FastFood {

    private float price;//价格
    private String desc; //描述

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract float cost();
}
