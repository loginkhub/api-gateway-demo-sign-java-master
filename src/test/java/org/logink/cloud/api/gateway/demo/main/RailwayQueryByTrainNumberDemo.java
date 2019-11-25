package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo <br>
 *     北京铁路局车号查询接口
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/RailwayQueryByTrainNumberDemo.java
*/
public class RailwayQueryByTrainNumberDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/railway-query/findByTrainNumber";
		//请求的body,json格式
		String body = "{\"railwayWagonNumber\": \"******\"," +//车号
				"    \"shippingNodeNumber\": \"******\"}"; // 运单号
		try {
			// PostUtil封装了header设置和签名计算,然后发送request并获取response
			Response response = PostUtil.postString(url, body, appkey, appsecret);
			System.out.println(JSON.toJSONString(response));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

