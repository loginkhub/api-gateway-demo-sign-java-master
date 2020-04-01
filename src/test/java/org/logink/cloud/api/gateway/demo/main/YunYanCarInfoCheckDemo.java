package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 云雁车辆信息核验接口
* 重要提示如下：
* 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/YunYanCarInfoCheckDemo.java
*/
public class YunYanCarInfoCheckDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/yunyan/carInfoCheck";
		//请求的body,json格式
		String body = "{\"vehicleNumber\": \"******\","  // 车辆牌照号
				+ "\"vehiclePlateColorCode\": \"******\","  // 车牌颜色代码
				+ "\"vehicleType\": \"******\","  // 车辆类型代码
				+ "\"owner\": \"******\","  // 车辆所有人
				+ "\"useCharacter\": \"******\","  // 车辆使用性质
				+ "\"vin\": \"******\","  // 车辆识别号
				+ "\"issuingOrganizations\": \"******\","  // 车辆行驶证发证机关
				+ "\"registerDate\": \"******\","  // 注册日期
				+ "\"issueDate\": \"******\","  // 发证日期
				+ "\"vehicleEnergyType\": \"******\","  // 车辆能源类型
				+ "\"vehicleTonnage\": \"******\","  // 核定载质量
				+ "\"grossMass\": \"******\","  // 吨位
				+ "\"roadTransportCertificateNumber\": \"******\","  // 道路运输证号
				+ "\"roadTransportCertificateValidPeriodFrom\": \"******\","  // 道路运输证有效期自
				+ "\"roadTransportCertificateValidPeriodTo\": \"******\","  // 道路运输证有效期至
				+ "\"trailerVehiclePlateNumber\": \"******\","  // 挂车牌照号
				+ "\"verifyRange\": \"******\","  // 校验范围
				+ "\"remark\": \"******\"}"; // 备注
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

