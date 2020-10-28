package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * logink cloud gateway api demo
 * 集装箱状态信息查询接口
 * 代码下载:https://github.com/loginkhub/api-gateway-demo-sign-java-master/
 * 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/ContainerQueryDemo.java
 **/
public class ContainerQueryDemo {
    public static void main(String[] args) {
        String appkey = "您的appkey";
        String appsecret = "您的appsecret";
        String url = "https://gateway.logink.cn/container/getNingboContainerInfo";
        //请求的body,json格式，集装箱号与提单号只能二选一，这里仅示例根据集装箱号查询
        String body = "{\"containerNumber\":\"******\"," +//集装箱号查询
                "\"ladingBillNumber\":\"\"" +//提单号必须为空
                ",\"partyFunctionCode\":\"CNNGB\"}";//服务提供商代码，非必填
        try {
            // PostUtil封装了header设置和签名计算,然后发送request并获取response
            Response response = PostUtil.postString(url, body, appkey, appsecret);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
