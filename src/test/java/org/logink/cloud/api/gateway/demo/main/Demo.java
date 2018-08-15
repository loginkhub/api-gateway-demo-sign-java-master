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
package org.logink.cloud.api.gateway.demo.main;

import org.logink.cloud.api.gateway.demo.util.PostUtil;

public class Demo {
	
	public static void main(String[] args) {
		
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
			PostUtil.postString(url, body, appkey, appsecret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

