package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * @ClassName: CreditQueryDemo
 * @Description: 车辆查询统一接口demo
 * @author: Xu Zhengwen
 * @date: 2018/11/28 9:43
 */
public class CreditQueryDemo {
    public static void main(String[] args) {
        String appkey = "您的appkey";
        String appsecret = "您的appsecret";
        String url = "https://gateway.logink.org/credit/vehicleQuery/logink";
        //请求的body,json格式
        String body = "{\"vehicleNumber\":\"******\","   //车辆牌照号
                + "\"licensePlateTypeCode\":\"******\"}";    //牌照类型代码(1=蓝色；2=黄色)
        try {
            // PostUtil封装了header设置和签名计算,然后发送request并获取response
            Response response = PostUtil.postString(url, body, appkey, appsecret);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
