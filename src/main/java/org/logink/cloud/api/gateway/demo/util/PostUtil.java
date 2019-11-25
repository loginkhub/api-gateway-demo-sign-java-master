/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.logink.cloud.api.gateway.demo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.logink.cloud.api.gateway.demo.Client;
import org.logink.cloud.api.gateway.demo.Request;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.constant.Constants;
import org.logink.cloud.api.gateway.demo.constant.ContentType;
import org.logink.cloud.api.gateway.demo.constant.HttpHeader;
import org.logink.cloud.api.gateway.demo.enums.Method;

import com.alibaba.fastjson.JSON;

/**
 * 调用示例
 * 请替换APP_KEY,APP_SECRET,HOST,CUSTOM_HEADERS_TO_SIGN_PREFIX为真实配置
 */
public class PostUtil {
	//网关的host地址
	public static String HOST = "https://gateway.logink.cn";
    

    /**
     * HTTP POST 字符串
     *
     * @throws Exception
     */
    public static Response postString(String URL, String BODY,
    		String APP_KEY, String APP_SECRET) throws Exception {
    	System.out.println("Request:");
    	System.out.println("Url: " + URL);
    	String PATH = URL.substring(HOST.length(), URL.length());
        Map<String, String> headers = new HashMap<String, String>();
        //（必填）根据期望的Response内容类型设置
        headers.put(HttpHeader.HTTP_HEADER_ACCEPT, ContentType.CONTENT_TYPE_JSON);
        //（可选）Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(BODY));
        //（POST/PUT请求必选）请求Body内容格式
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
        //（非必填）用户自定义的header字段，用户自己决定是否参与签名，如果参与签名，将相关header信息设置如下
        headers.put("a-header1", "header1Value");
        headers.put("b-header2", "header2Value");
        
        List<String> CUSTOM_HEADERS_TO_SIGN_PREFIX = new ArrayList<String>();
        CUSTOM_HEADERS_TO_SIGN_PREFIX.add("a-header1");
        CUSTOM_HEADERS_TO_SIGN_PREFIX.add("a-header2");
        

        Request request = new Request(Method.POST_STRING, HOST, 
        		PATH, APP_KEY, APP_SECRET, Constants.DEFAULT_TIMEOUT);
        request.setHeaders(headers);
        request.setSignHeaderPrefixList(CUSTOM_HEADERS_TO_SIGN_PREFIX);
        
        //（非必填）根据api描述，如果有需要传递的参数，设置请求的query
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("a-query1", "query1Value");
        querys.put("b-query2", "query2Value");
        request.setQuerys(querys);
        
        request.setStringBody(BODY);

        //调用服务端
        Response response = Client.execute(request);
        System.out.println("Body: " + BODY);
        System.out.println("");
        System.out.println("Response: ");
        return response;
    }
   
}
