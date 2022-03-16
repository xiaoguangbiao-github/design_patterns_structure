package com.xiaoguangbiao.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassName: Computer
 * @Description: 计算机类
 * @Author: xiaoguangbiao-github
 */
public class Computer {

    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw  new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
