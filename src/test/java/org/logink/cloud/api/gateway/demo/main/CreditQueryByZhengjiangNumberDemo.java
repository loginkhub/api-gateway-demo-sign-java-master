package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * @ClassName: CreditQueryByZhengjiangNumberDemo
 * @Description: 浙江车辆信息查询接口Demo
 * @author: Xu Zhengwen
 * @date: 2018/11/26 9:34
 */
public class CreditQueryByZhengjiangNumberDemo {
    public static void main(String[] args) {
        String appkey = "您的appkey";
        String appsecret = "您的appsecret";
        String url = "https://gateway.logink.org/credit/vehicleQuery/zhejiang";
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
