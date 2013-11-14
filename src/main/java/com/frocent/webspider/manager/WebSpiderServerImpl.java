package com.frocent.webspider.manager;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.frocent.common.utils.URLWrapper;

public class WebSpiderServerImpl {

	public void handleRequest(URLWrapper urlWrapper){
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(urlWrapper.getUri());
		try {
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();
			EntityUtils.toString(httpEntity);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
