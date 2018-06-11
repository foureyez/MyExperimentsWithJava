package com.util;

public class StringUtils {
	public static char[] toCharArray(String[] a) {
		char[] ch = null;
		StringBuilder tempString = new StringBuilder();

		for (String s : a) {
			tempString.append(s);
		}

		ch = tempString.toString().toCharArray();

		return ch;
	}
}
