package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 短信验证码接口(Logink)
* 重要提示如下：
* 代码请从 github path:https://github.com/huojuntao/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/MessageSendVerificationCodeDemo.java
*/
public class MessageSendVerificationCodeDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.org/message/sms/sendVerificationCode";
		//请求的body,json格式
		String body = "{\"mobiles\":\"******\","   //手机号码
	    		+ "\"content\":\"******\"}";    //短信内容
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

