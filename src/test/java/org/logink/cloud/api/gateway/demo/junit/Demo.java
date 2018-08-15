package org.logink.cloud.api.gateway.demo.junit;

import org.junit.Assert;
import org.junit.Test;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

public class Demo {
	
    @Test
	public  void test() {
    	String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "请求的url";
		//请求的body,json格式
		String body = "{\"param1\":\"******\","   //参数1
	    		+ "\"param2\":\"******\", " ///参数2
	    		+ "\"param3\":\"******\","  ///参数3
	    		+ "\"param4\":\"******\","   ///参数4
	    		+ "\"param5\":\"******\"}";    //参数5
		try {
			// PostUtil封装了header设置和签名计算,然后发送request并获取response
			Response response = PostUtil.postString(url, body, appkey, appsecret);
			System.out.println("response = " + JSON.toJSONString(response));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

}
