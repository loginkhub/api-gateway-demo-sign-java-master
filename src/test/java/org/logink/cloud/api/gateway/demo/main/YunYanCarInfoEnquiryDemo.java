package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 云雁车辆信息核查接口
* 重要提示如下：
* 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/YunYanCarInfoEnquiryDemo.java
*/
public class YunYanCarInfoEnquiryDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/yunyan/carInfoEnquiry";
		//请求的body,json格式
		String body = "{\"vehicleNumber\":\"******\"," //车辆牌照号
                + "\"vehiclePlateColorCode\":\"******\","  //牌照类型代码(1=蓝色；2=黄色)
		        + "\"vin\":\"******\","  //车辆识别代号
		        + "\"roadTransportCertificateNumber\":\"******\"}";  //道路运输证号
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

