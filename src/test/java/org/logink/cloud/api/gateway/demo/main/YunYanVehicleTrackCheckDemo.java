package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 云雁车辆轨迹核查接口
* 重要提示如下：
* 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/YunYanVehicleTrackCheckDemo.java
*/
public class YunYanVehicleTrackCheckDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/yunyan/vehicleTrackCheck";
		//请求的body,json格式
		String body = "{\"shippingNoteNumber\": \"******\","  //  运单号 
				+ "\"vehiclePlateColorCode\": \"******\","  //  车牌号
				+ "\"vehicleNumber\": \"******\","  //  车牌颜色
				+ "\"receiptCountrySubdivisionCode\": \"******\","  //  收货地址的国家行政区划代码
				+ "\"placeOfLoading\": \"******\","  //  装货地址
				+ "\"goodsReceiptDateTime\": \"******\","  //  收货日期时间
				+ "\"loadingCountrySubdivisionCode\": \"******\","  //  装货地址的国家行政区划代码
				+ "\"goodsReceiptPlace\": \"******\","  //  收货地址
				+ "\"despatchActualDateTime\": \"******\","  //  发货日期时间
				+ "\"verificationTimeRadius\": \"******\"}";  //  核验时间半径
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

