package com.frocent.httpclient;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.springframework.util.NumberUtils;

import com.frocent.common.utils.RegExUtils;
import com.google.common.collect.Interners;
import com.google.common.primitives.Ints;

public class HttpClientTest {

	
	public void setCookie(CookieStore cookieStore,String name,String value){
		BasicClientCookie basicClientCookie = new BasicClientCookie(name, value);
		basicClientCookie.setVersion(0);
		basicClientCookie.setDomain("www.aishedes.org");
		basicClientCookie.setPath("/");
		cookieStore.addCookie(basicClientCookie);
	}
	
	@Test
	public void test(){
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://www.aishedes.org/forum.php");
		try {
			CookieStore cookieStore = new BasicCookieStore();
			setCookie(cookieStore, "nzrE_2132_saltkey", "uwbYRyYy");
			setCookie(cookieStore, "nzrE_2132_lastvisit", "1382064015");
			setCookie(cookieStore, "bdshare_firstime", "1382077258643");
			setCookie(cookieStore, "nzrE_2132_auth", "6ad0Tiuk3CZbweGevA3teIXLrKYnG55hV%2BvqNVzVPM7FglvOjcGpJazmOW6g6KhOOe8mRCKMJ%2F7n7%2F4VF38iCopb9w");
			setCookie(cookieStore, "nzrE_2132_nofavfid", "1");
			setCookie(cookieStore, "nzrE_2132_atarget", "1");
			setCookie(cookieStore, "nzrE_2132_atlist", "229570");
			setCookie(cookieStore, "nzrE_2132_adclose_5", "1");
			setCookie(cookieStore, "kangle_runat", "1");
			setCookie(cookieStore, "nzrE_2132_st_t", "21897%7C1383442250%7C3b6325f88e3bd3117ee144eb73801e7b");
			setCookie(cookieStore, "nzrE_2132_forum_lastvisit", "D_52_1382748888D_51_1382749016D_40_1383310760D_58_1383359933D_60_1383359954D_64_1383362559D_2_1383438900D_89_1383440245D_38_1383442250");
			setCookie(cookieStore, "nzrE_2132_adclose_8", "1");
			setCookie(cookieStore, "nzrE_2132_lip", "221.216.139.33%2C1383453271");
			setCookie(cookieStore, "nzrE_2132_ulastactivity", "23dftXa69hOD4lKd9oRlIM8UjuK1hfYhfTP5XheYMo2vz8JErSZr");
			setCookie(cookieStore, "nzrE_2132_adclose_17", "1");
			setCookie(cookieStore, "nzrE_2132_visitedfid", "89D2D61D108D38D46D44D42D55D51");
			setCookie(cookieStore, "nzrE_2132_st_p", "21897%7C1383459537%7C58457c64ccd9f88a27ed56c79869c0eb");
			setCookie(cookieStore, "nzrE_2132_viewid", "tid_70374");
			setCookie(cookieStore, "nzrE_2132_smile", "1D1");
			setCookie(cookieStore, "CNZZDATA5331698", "cnzz_eid%3D1821419122-1382077262-http%253A%252F%252Fwww.aishedes.org%26ntime%3D1383458277%26cnzz_a%3D137%26sin%3Dnone%26ltime%3D1383446960871%26rtime%3D6");
			setCookie(cookieStore, "_cnzz_CV", "");
			setCookie(cookieStore, "nzrE_2132_lastcheckfeed", "21897%7C1383459906");
			setCookie(cookieStore, "nzrE_2132_sendmail", "1");
			setCookie(cookieStore, "nzrE_2132_noticeTitle", "1");
			setCookie(cookieStore, "nzrE_2132_lastact", "1383459907%09misc.php%09patch");
			setCookie(cookieStore, "tjpctrl", "1383461708712");
			httpClient.getParams().setParameter("http.useragent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.76 Safari/537.36");
			httpClient.setCookieStore(cookieStore);
			
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();
			String content = EntityUtils.toString(httpEntity);
			List<String> contents = RegExUtils.getMatches(content, "<a href=\\\"forum.php\\?mod=forumdisplay\\&fid=[0-9]*\\\" >[\\S]*</a>", 0);
			for (String matchContents : contents) {
				Document doc = Jsoup.parse(matchContents);
				String title = doc.text();
				String urlLink = doc.attr("href");
				String[] parts = urlLink.split("=");
				
			}
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			httpClient.getConnectionManager().shutdown();
		}
		
		
		//1. ������ҳ����ȡ���еİ���ID
		//2. �����������������
		//3. �������������html���������Ӹ������Ե����ݿ���
		//4. ץȡ���е����ӵĽ�һ������
	}
}
