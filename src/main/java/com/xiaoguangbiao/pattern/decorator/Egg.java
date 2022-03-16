package com.xiaoguangbiao.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: Egg
 * @Description: 鸡蛋类(具体的装饰者角色)
 * @Author: xiaoguangbiao-github
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
