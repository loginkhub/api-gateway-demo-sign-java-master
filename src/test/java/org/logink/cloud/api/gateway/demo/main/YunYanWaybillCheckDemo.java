package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

import com.alibaba.fastjson.JSON;

/**
* logink cloud gateway api demo 
* 云雁运单信息核验接口
* 重要提示如下：
* 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
* 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/YunYanWaybillCheckDemo.java
*/
public class YunYanWaybillCheckDemo {
	public static void main(String[] args) {
		String appkey = "您的appkey";
		String appsecret = "您的appsecret";
		String url = "https://gateway.logink.cn/yunyan/waybillCheck";
		//请求的body,json格式
		String body = "{"
				+ "	\"originalDocumentNumber\": \"******\","  //  原始单号
				+ "	\"shippingNoteNumber\": \"******\","  //  运单号
				+ "	\"vehicleAmount\": \"******\","  //  运输总车辆数
				+ "	\"serialNumber\": \"******\","  //  分段分单号
				+ "	\"transportTypeCode\": \"******\","  //  运输组织类型代码
				+ "	\"sendToProDateTime\": \"******\","  //  运单上传时间
				+ "	\"carrier\": \"******\","  //  网络货运经营者名称
				+ "	\"unifiedSocialCreditIdentifier\": \"******\","  //  统一社会信用代码
				+ "	\"permitNumber\": \"******\","  //  网络货运经营者道路运输经营许可证编号
				+ "	\"permitValidPeriodFrom\": \"\","  //  道路运输经营许可证有效期自
				+ "	\"permitValidPeriodTo\": \"\","  //  道路运输经营许可证有效期至
				+ "	\"consignmentDateTime\": \"******\","  //  运单生成时间
				+ "	\"businessTypeCode\": \"******\","  //  业务类型代码
				+ "	\"despatchActualDateTime\": \"******\","  //  发货日期时间
				+ "	\"goodsReceiptDateTime\": \"******\","  //  收货日期时间
				+ "	\"consignorInfo\": {"  //  托运人信息
				+ "		\"consignor\": \"******\","  //  托运人名称
				+ "		\"consignorID\": \"******\","  //  托运人统一社会信用代码或个人证件号
				+ "		\"unifiedSocialCreditIdentifierCertificateValidPeriodFrom\": \"\","  //  托运人统一社会信用证或个人证件有效期自
				+ "		\"unifiedSocialCreditIdentifierCertificateValidPeriodTo\": \"\","  //  托运人统一社会信用证或个人证件有效期至
				+ "		\"placeOfLoading\": \"\","  //  装货地址
				+ "		\"countrySubdivisionCode\": \"******\""  //  装货地点的国家行政区划代码或国别代码
				+ "	},"
				+ "	\"consigneeInfo\": {"  //  收货方信息
				+ "		\"consignee\": \"******\","  //  收货方名称
				+ "		\"consigneeID\": \"******\","  //  收货方统一社会信用代码或个人证件号码
				+ "		\"goodsReceiptPlace\": \"\","  //  收货地址
				+ "		\"countrySubdivisionCode\": \"******\""  //  收货地点的国家行政区划代码或国别代码
				+ "	},"
				+ "	\"totalMonetaryAmount\": \"******\","  //  运费金额
				+ "	\"vehicleInfo\": {"  //  车辆信息
				+ "		\"vehiclePlateColorCode\": \"******\","  //  车牌颜色代码
				+ "		\"vehicleNumber\": \"******\","  //  车辆牌照号
				+ "		\"despatchActualDateTime\": \"\","  //  发货日期时间
				+ "		\"goodsReceiptDateTime\": \"\","  //  收货日期时间
				+ "		\"placeOfLoading\": \"\","  //  装货地址
				+ "		\"loadingCountrySubdivisionCode\": \"\","  //  装货地址的国家行政区划代码或国别代码
				+ "		\"goodsReceiptPlace\": \"\","  //  收货地址
				+ "		\"receiptCountrySubdivisionCode\": \"\","  //  收货地址的国家行政区划代码或国别代码
				+ "		\"driver\": {"  //  驾驶员
				+ "			\"driverName\": \"******\","  //  驾驶员姓名
				+ "			\"drivingLicense\": \"******\","  //  机动车驾驶员身份证编号
				+ "			\"driverLicenseNumber\": \"******\""  //  机动车驾驶证编号
				+ "		},"
				+ "		\"goodsInfo\": [{"  //  货物信息
				+ "			\"descriptionOfGoods\": \"******\","  //  货物名称
				+ "			\"cargoTypeClassificationCode\": \"******\","  //  货物类型分类代码
				+ "			\"goodsItemGrossWeight\": \"******\","  //  货物项毛重
				+ "			\"cube\": \"\","  //  体积
				+ "			\"totalNumberOfPackages\": \"\""  //  总件数
				+ "		}]"
				+ "	}," 
				+ "	\"actualCarrierInfo\": {"  //  实际承运人信息
				+ "		\"actualCarrierName\": \"******\","  //  实际承运人名称
				+ "		\"actualCarrierBusinessLicense\": \"******\","  //  实际承运人的道路运输经营许可证编号
				+ "		\"actualCarrierID\": \"******\""  //  实际承运人统一社会信用代码或证件号码
				+ "	},"
				+ "	\"insuranceInformation\": {"  //  保险信息
				+ "		\"policyNumber\": \"******\","  //  保险单号
				+ "		\"insuranceCompany\": \"******\""  //  保险公司名称代码
				+ "	},"
				+ "	\"verifyRange\": \"\","  //  校验范围
				+ "	\"remark\": \"\""  //  备注
				+ "}";
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

