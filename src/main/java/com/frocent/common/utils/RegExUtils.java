package com.frocent.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

public class RegExUtils {
	public static boolean matches(String line, String regEx) {
		boolean regExpMatches = false;
		if (!StringUtils.isEmpty(line) && !StringUtils.isEmpty(regEx)) {
			if (line.matches(regEx)) {
				regExpMatches = true;
			}
		}
		return regExpMatches;
	}

	public static List<String> getMatches(String line, String regEx, int group) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(line);
		List<String> matches = new ArrayList<String>();

		while (matcher.find()) {
			matches.add(matcher.group(group));
		}
		return matches;
	}

	public static String getMatchedContent(String line, String regEx) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(line);
		String matchedContent = null;
		if (matcher.find()) {
			matchedContent = matcher.group();
		}
		return matchedContent;
	}
}
