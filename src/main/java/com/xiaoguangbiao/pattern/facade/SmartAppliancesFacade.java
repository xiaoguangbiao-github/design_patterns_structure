package com.xiaoguangbiao.pattern.facade;

/**
 * @version v1.0
 * @ClassName: SmartAppliancesFacade
 * @Description: 外观类，用户主要和该类对象进行交互
 * @Author: xiaoguangbiao-github
 */
public class SmartAppliancesFacade {

    //聚合电灯对象，电视机对象，空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语言控制
    public void say(String message) {
        if(message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    //一键打开功能
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    //一键关闭功能
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
