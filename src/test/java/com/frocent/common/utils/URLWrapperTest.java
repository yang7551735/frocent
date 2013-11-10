package com.frocent.common.utils;

import org.junit.Assert;
import org.junit.Test;

public class URLWrapperTest {

	@Test
	public void test() {
		URLWrapper urlWrapper = URLWrapper.wrap("forum.jsp?id1=12&id2=123");
		String id2Value = urlWrapper.getParamValue("id2");
		Assert.assertEquals(id2Value, "123");
		Assert.assertEquals(urlWrapper.getRelativeUrl(), "forum.jsp");

		int id2IntValue = urlWrapper.getParamValueAsInt("id2");
		Assert.assertEquals(id2IntValue, 123);
		
		urlWrapper = URLWrapper.wrap("forum.jsp?id1=12");
		String id1Value = urlWrapper.getParamValue("id1");
		Assert.assertEquals(id1Value, "12");
		Assert.assertEquals(urlWrapper.getRelativeUrl(), "forum.jsp");

		
	}

}
