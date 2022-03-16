package com.xiaoguangbiao.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: Garnish
 * @Description: 装饰者类(抽象装饰者角色)
 * @Author: xiaoguangbiao-github
 */
public abstract class Garnish extends FastFood {

    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
