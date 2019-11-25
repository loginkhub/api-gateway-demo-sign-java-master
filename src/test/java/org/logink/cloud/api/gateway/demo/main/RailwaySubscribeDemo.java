package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 铁路订阅接口
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/RailwaySubscribeDemo.java
*/
public class RailwaySubscribeDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/railway-query/subscribe";
		//请求的body,json格式
		String body = "{\"taskId\":\"******\"," // 订阅标识符
				+ "\"railwayWagonNumber\":\"******\", " // 车号
				+ "\"containerNumber\":\"\"," // 集装箱箱号
				+ "\"shippingNodeNumber\":\"\"," // 运单号
				+ "\"invoiceNumber\":\"\"," // 货票号
				+ "\"placeOfDeparture\":\"\", " // 发站
				+ "\"destination\":\"\"," // 到达站
				+ "\"endDate\":\"yyyy-MM-dd\"}"; // 订阅截止时间
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

