package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

	private BufferedReader br;

	public InputReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Returns a parsed integer
	 */
	public int getInt() throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine());
	}

	/**
	 * Returns a parsed integer array
	 */
	public int[] getIntArray() throws IOException {
		String[] input = getStringArray();
		int a[] = new int[input.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		return a;
	}

	/**
	 * Returns a String array
	 */
	public String[] getStringArray() throws IOException {
		return br.readLine().split(" ");
	}

	/**
	 * Returns a char array
	 */
	public char[] getCharArray() throws IOException {
		return br.readLine().trim().toCharArray();
	}

	public String getLine() throws IOException {
		return br.readLine();
	}

}
