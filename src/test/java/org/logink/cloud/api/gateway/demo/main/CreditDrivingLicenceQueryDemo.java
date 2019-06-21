package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * logink cloud gateway api demo
 * 驾驶证查询接口
 * 重要提示如下：
 * 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
 * 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/CreditDrivingLicenceQueryDemo.java
 */
public class CreditDrivingLicenceQueryDemo {
    public static void main(String[] args) {
        String appkey = "您的appkey";
        String appsecret = "您的appsecret";
        String url = "https://gateway.logink.org/credit/drivingLicence/logink";
        //请求的body,json格式
        String body = "{\"vehicleNumber\":\"*********\","   //车辆牌照号
                + "\"vehicleClassification\":\"*********\","//车辆分类
                + "\"owner\":\"*********\"}";//车辆所有人
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
